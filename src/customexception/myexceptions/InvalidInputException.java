/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Oct-20
 *  Time: 1:41 PM
 */
package customexception.myexceptions;
//creating a custom exception class, to demonstrate use of custom or user-defined exception

public class InvalidInputException extends Exception{
    public InvalidInputException(String message) {
        super(message);
    }
}
