package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
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
