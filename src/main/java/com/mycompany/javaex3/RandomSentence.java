/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex3;

/**
 *
 * @author ldxt460s
 */
public class RandomSentence {

    public static void start() {
        String[] subjects = {"I", "You", "He", "She", "It", "We", "They"};
        String[] verbs = {"run", "jump", "swim", "fly", "walk", "sing", "dance"};
        String[] objects = {"ball", "book", "pen", "pencil", "phone", "computer", "car"};
        int randomSubject = (int) (Math.random() * subjects.length);
        int randomVerb = (int) (Math.random() * verbs.length);
        int randomObject = (int) (Math.random() * objects.length);
        System.out.println(subjects[randomSubject] + " " + verbs[randomVerb] + " " + objects[randomObject] + ".");
    }
    
}
