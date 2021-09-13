/*
 *  UCF COP3330 Fall 2021 Assignment 20 Solution
 *  Copyright 2021 first_name last_name
 */

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amount;
        double tax = 0.0;
        double total = 0.0;
        System.out.print("What is order amount? ");
        amount = input.nextInt();   //stores order amount
        System.out.print("What state do you live in? ");
        String state = input.next();    //stores state
        String county = null;   //initializes county to be null
        if (state.equals("Wisconsin")) {    //if state equals Wisconsin
            System.out.print("What county do you live in? ");
            county = input.next();  //stores county of Wisconsin
            if (county.equals("Eau Claire")) ;  //if state equals Eau Claire
            tax = (amount * 5.005) / 100;   //calculate tax for Eau Claire
            total = tax + amount;   //calculates total
        } else if (county.equals("Dunn")) { //if county equals Dunn
            tax = (amount * 5.004) / 100;   //calculate tax for Dunn
            total = tax + amount;   //calculate total
        } else if (state.equals("Illinois")) {  //if state equals Illinois
            tax = (amount*8)/100;   //calculate tax for Illinois
            total = tax + amount;   //calculate total
        }else{  //if none then tax is 0
            tax = 0;
            total = amount;
        }
        System.out.println("The tax is $"+String.format("%.2f",tax));
        System.out.println("The total is $"+String.format("%.2f",total));
    }
}
