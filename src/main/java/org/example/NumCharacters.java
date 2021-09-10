package org.example;
import java.util.Scanner;

/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 *Copyright 2021 Daniela Gomez-Dugan
 */
public class NumCharacters
{
    public static void main( String[] args )
    {
        // Asks user for a string and prints the amount of characters in string
        Scanner input = new Scanner(System.in);

        System.out.print("What is the input string? ");
        String word = input.nextLine();

        // Checking for empty strings
        while (word.length() == 0) {
            System.out.print("I am sorry. Please enter a valid string. What is the input string?");
            word = input.nextLine();
        }

        System.out.println(word + " has " + word.length() + " characters.");
    }
}
