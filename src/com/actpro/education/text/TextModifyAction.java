/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.actpro.education.text;

public class TextModifyAction {

    public void modifyText() {
        String str = "dfhklfgmdjdm*bbbhm";
        char[] arr = str.toCharArray();
        int i = 0;
        while (arr[i] != '*') {
            arr[i++] = '.';
        }
        str = String.copyValueOf(arr);
        System.out.println(str);
    }
}
