package com.coolprimes.linkedit;

import java.util.ArrayList;
import java.util.List;

public class LinkGrammarVisitorImpl extends LinkGrammarBaseVisitor<Value> {
    LinkGrammarParser parser;
    List<MemoryArea> memoryAreas = new ArrayList<>();

    @Override
    public Value visitMemoryArea(LinkGrammarParser.MemoryAreaContext ctx){
        MemoryArea ma = new MemoryArea();
        ma.name = ctx.Name().getText();
        ma.memoryType = ctx.MemoryType().getText();
        LinkGrammarParser.ExprContext originCtx = ctx.expr(0);
        LinkGrammarParser.ExprContext lengthCtx = ctx.expr(1);
        ma.origin = visit(originCtx).value;
        ma.length = visit(lengthCtx).value;
        memoryAreas.add(ma);
        return null;
    }

    @Override
    public Value visitExpr(LinkGrammarParser.ExprContext ctx){
        LinkGrammarParser.ExprContext left = ctx.expr(0);
        LinkGrammarParser.TermOperatorContext op = ctx.termOperator();
        LinkGrammarParser.ExprContext right = ctx.expr(1);
        if(right != null){
            Value leftValue = visit(left);
            Value rightValue = visit(right);
            switch(op.getText()){
                case "+": return new Value(leftValue.value + rightValue.value);
                case "-": return new Value(leftValue.value - rightValue.value);
            }
        }
        long val;
        if(left != null){
            return visit(left);  // This is the ( expr ) case
        } else {
            val = Long.decode(ctx.getText());
        }
        return new Value(val);
    }
}
