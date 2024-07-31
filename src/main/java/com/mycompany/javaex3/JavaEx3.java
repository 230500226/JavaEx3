/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.javaex3;

/**
 *
 * @author ldxt460s
 */
public class JavaEx3 {

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("1. Compare strings");
            System.out.println("2. Compare string segments");
            System.out.println("3. Generate random sentence");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the first string: ");
                    String str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = scanner.nextLine();
                    CompareString.start(str1, str2);
                    break;
                case 2:
                    System.out.print("Enter the first string: ");
                    str1 = scanner.nextLine();
                    System.out.print("Enter the second string: ");
                    str2 = scanner.nextLine();
                    System.out.print("Enter the start index: ");
                    int start = scanner.nextInt();
                    System.out.print("Enter the end index: ");
                    int end = scanner.nextInt();
                    CompareStringSeg.start(str1, str2, start, end);
                    break;
                case 3:
                    RandomSentence.start();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            scanner.close();
        }
    }
}
