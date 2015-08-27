/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

import java.util.Scanner;

/**
 *
 * @author Zachary
 */
public class WorkingWithScanner {
    public static void main (String[] args){
        Scanner keyboard = new Scanner(System.in);
        //the languages declares and instance of an arguement
       int number;
       //what did we do line 18? we declared the vairable number as an integer
       System.out.println("enter an integer");
       //what did we do? provide a user prompt
       number = keyboard.nextInt();
       //what did we do? allows the user to enter in the input
       System.out.println(number);
       //all of the next fill in the blank on white space
    }
}
