/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 29-Oct-20
 *  Time: 1:40 PM
 */
package main;

import java.util.Scanner;

//demonstrate exception handling by using try, catch and finally
public class DemoException {
    public static void main(String[] args) {
        int numerator;
        int denominator;
        int result;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a numerator");
        numerator = sc.nextInt();
        System.out.println("enter denominator");
        denominator = sc.nextInt();
        try {
            result = numerator / denominator;
        }
        //exception handler
        catch(ArithmeticException e){
            //corrective measure
            System.out.println("denominator cannot be 0");
            result = 0;
        }
        System.out.println("result = " + result);
    }
}
