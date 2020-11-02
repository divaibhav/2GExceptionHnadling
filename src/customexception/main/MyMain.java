/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Oct-20
 *  Time: 1:44 PM
 */
package customexception.main;

import customexception.myexceptions.InvalidInputException;

import java.util.InputMismatchException;
import java.util.Scanner;

//accepting user input inside a method, if the input is not proper, then it can
//generate exception
public class MyMain {
    public static void main(String[] args) {
        MyMain obj =new MyMain();
        try {
            obj.input();
        } catch (InvalidInputException e) {
            System.out.println(e);
            e.printStackTrace();
        }

    }
    public int input() throws InvalidInputException{
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int no ;
        try {
            no = sc.nextInt();
        }
        catch (InputMismatchException e){
            throw new InvalidInputException("Invalid input" + e.getMessage());
        }
        //using finally block to close the resource
        finally {
            sc.close();
        }
        return no;
    }
}
