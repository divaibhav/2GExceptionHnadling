/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 30-Oct-20
 *  Time: 2:33 PM
 */
package customexception.myexceptions;

public class MyCustomException extends Exception {
    public MyCustomException() {
    }

    public MyCustomException(String message) {
        super(message);
    }

    public MyCustomException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyCustomException(Throwable cause) {
        super(cause);
    }

    public MyCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
