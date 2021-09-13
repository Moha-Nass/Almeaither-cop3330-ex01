package org.example;

import java.util.Scanner;

/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Mohammed_Almeaither
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "What is your name?" );
        String name="";
        Scanner input = new Scanner(System.in);
        name = input.next();
        System.out.printf("Hello, %s, nice to meet you!", name);
    }
}
