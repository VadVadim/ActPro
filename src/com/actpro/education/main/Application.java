/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.main;

import com.actpro.education.cycle.EmptyPartFor;
import com.actpro.education.cycle.For;
import com.actpro.education.formatting.OutputFormatting;
import com.actpro.education.text.TextModifyAction;

public class Application {

    public static void executeExamples() {
        printMultiplyTable();
        executeCycle();
        executeEmptyPartCycle();
        modifyText();
    }

    private static void printMultiplyTable() {
        OutputFormatting outputFormatting = new OutputFormatting();
        print("Task for formatting");
        outputFormatting.printMultiplyTable();
    }

    private static void executeCycle() {
        For forCycle = new For();
        print("Task for work with cycle");
        forCycle.printArray();
    }

    private static void executeEmptyPartCycle() {
        EmptyPartFor emptyFor = new EmptyPartFor();
        print("Task  with cycle, which have empty parts");
        emptyFor.printResult();
    }
    
    private static void modifyText() {
        TextModifyAction textModifyAction = new TextModifyAction();
        print("Task about modifying of string");
        textModifyAction.modifyText();
    }

    private static void print(String notation) {
        System.out.println("\n " + notation + "\n");
    }
}
