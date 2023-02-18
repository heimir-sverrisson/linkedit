package com.coolprimes.linkedit;

import java.io.IOException;
import java.util.List;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


public class LinkEdit {
    private String filename;
    private LinkGrammarVisitorImpl visitor;
    private long shift = 0x10100;
    private long maxFlash = 0x100000;

    LinkEdit(String filename){
        this.filename = filename;
    }

    void run() throws IOException{
        LinkGrammarLexer lexer = new LinkGrammarLexer(CharStreams.fromFileName(filename));
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        LinkGrammarParser parser = new LinkGrammarParser(tokenStream);
        parser.removeErrorListeners();
        ParseTree tree = parser.spec();
        visitor = new LinkGrammarVisitorImpl();
        visitor.parser = parser;
        visitor.visit(tree);
    }

    void newMemoryArea() {
        List<MemoryArea> memoryAreas = visitor.memoryAreas;
        for(MemoryArea ma : memoryAreas){
            // Shift origin of all sections in Flash (not of W type)
            if(!ma.memoryType.contains("W")){
                ma.origin += shift;
                if(ma.origin + ma.length > maxFlash){
                    ma.length = maxFlash - ma.origin;
                }
            }
            String orgValue = String.format("0x%08X",ma.origin);
            String lenValue = String.format("0x%08X",ma.length);
            System.out.printf("\t%s\t%s\t: origin=%s length=%s\n",
            ma.name, ma.memoryType, orgValue, lenValue);
        }
    }

    public static void main(String args[]) throws IOException{
        if(args.length < 1){
            System.err.println("Please supply input filename as argument");
            System.exit(1);
        }

        LinkEdit le = new LinkEdit(args[0]);
        le.run();
        le.newMemoryArea();
    }
}
