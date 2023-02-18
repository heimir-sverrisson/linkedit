#!/usr/bin/env bash
java -cp \
    target/linkedit-1.0-SNAPSHOT.jar\
:/usr/local/lib/antlr4/antlr-4.8-complete.jar\
    com.coolprimes.linkedit.LinkEdit $1
