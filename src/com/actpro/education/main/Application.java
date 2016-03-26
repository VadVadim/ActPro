/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.main;

import com.actpro.education.cycle.EmptyPartFor;
import com.actpro.education.cycle.For;
import com.actpro.education.formatting.OutputFormatting;

public class Application {

    public static void executeExamples() {
        printMultiplyTable();
        executeCycle();
        executeEmptyPartCycle();
    }

    private static void printMultiplyTable() {
        OutputFormatting outputFormatting = new OutputFormatting();
        print("\n Task for formatting\n");
        outputFormatting.printMultiplyTable();
    }

    private static void executeCycle() {
        For forCycle = new For();
        print("\n Task for work with cycle\n");
        forCycle.printArray();
    }

    private static void executeEmptyPartCycle() {
        EmptyPartFor emptyFor = new EmptyPartFor();
        print("\n Task  with cycle, which have empty parts\n");
        emptyFor.printResult();
    }

    private static void print(String notation) {
        System.out.println(notation);
    }
}
