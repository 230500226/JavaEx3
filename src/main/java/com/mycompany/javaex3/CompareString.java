/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex3;

/**
 *
 * @author ldxt460s
 */
public class CompareString {

    public static void start(String str1, String str2) {
        int result = str1.compareTo(str2);
        if (result < 0) {
            System.out.println("The first string is less than the second string.");
        } else if (result == 0) {
            System.out.println("The first string is equal to the second string.");
        } else {
            System.out.println("The first string is greater than the second string.");
        }
    }
    
}
