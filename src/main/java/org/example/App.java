/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Nicholas Rubio
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {

        String userPass, key;
        key = "abc$123";
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the password? ");
        userPass = sc.nextLine();

        if (key.equals(userPass)) {
            System.out.println("Welcome!");
        }
        else{
            System.out.println("I don't know you.");
        }
    }
}
