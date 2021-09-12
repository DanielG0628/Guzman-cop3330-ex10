package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Daniel Guzman
 */
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //declare variables and create scanner
        double p1, q1, p2, q2, p3, q3;
        double subPrice, tax, priceAfterTax;
        Scanner sc = new Scanner(System.in);

        //prompt user and scan inputs
        System.out.println("Enter the price of item 1:");
        p1 = sc.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        q1 = sc.nextDouble();
        System.out.println("Enter the price of item 2:");
        p2 = sc.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        q2 = sc.nextDouble();
        System.out.println("Enter the price of item 3:");
        p3 = sc.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        q3 = sc.nextDouble();

        //calculations
        subPrice = (p1*q1) + (p2*q2) + (p3*q3);
        subPrice = Math.round(subPrice*100)/100.0;
        tax = subPrice * 0.055;
        priceAfterTax = subPrice + tax;
        priceAfterTax = Math.round(priceAfterTax*100)/100.0;

        //output
        System.out.println("Subtotal: " + subPrice);
        System.out.println("Tax: " + tax);
        System.out.println("Total: " + priceAfterTax);

        //close scanner
        sc.close();
    }
}
