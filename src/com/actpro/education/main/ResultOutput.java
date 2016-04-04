/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.main;

import com.actpro.education.cycle.FactForLoop;
import com.actpro.education.recursion.Factorial;
import com.actpro.education.recursion.Fibonachi;
import com.actpro.education.recursion.StringLength;
import java.util.Scanner;

public class ResultOutput {

    private static int userNumber;

    protected static void printFactorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a natural number userNumber : ");
        userNumber = scan.nextInt();
        print("Factorial " + userNumber + " equals " + Factorial.countFactorial(userNumber));
    }

    protected static void printFactorialForLoop() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a natural number userNumber : ");
        userNumber = scan.nextInt();
        print("Factorial " + userNumber + " equals " + FactForLoop.countFactorialForLoop(userNumber));
    }

    protected static void printFibSeries() {
        Fibonachi fibonachi = new Fibonachi();
        for (int i = 1; i < ActproConstants.FIBONACHI_NUMBER; i++) {
            System.out.print(" "+fibonachi.receiveFibSeries(i));
        }
        System.out.println();
    }
    
    protected static void calcTextLength() {
        StringLength stringLength = new StringLength();
        print(stringLength.calculateLength(ActproConstants.TEXT_FOR_LENGTH_CALC));
    }
    
    private static void print(Object notation) {
        System.out.println(notation);
    }
}
