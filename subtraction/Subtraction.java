/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.subtraction;

/**
 *
 * @author Alvihn-PC
 */
import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        // Generate two single-digit integers
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);

        // Ensure number1 >= number2
        if (number1 < number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // Prompt the student to answer
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is " + number1 + " - " + number2 + "? ");
        int answer = scanner.nextInt();

        // Check the student's answer
        int correctAnswer = number1 - number2;
        if (answer == correctAnswer) {
            System.out.println("Correct!");
        } else {
            System.out.println("Sorry, the correct answer is " + correctAnswer);
        }
    }
}
