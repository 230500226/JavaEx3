/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex3;

/**
 *
 * @author ldxt460s
 */
public class CompareStringSeg {

    public static void start(String str1, String str2, int start, int end) {
        boolean result = str1.regionMatches(true, start, str2, start, end);
        if (result) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
    }

}
