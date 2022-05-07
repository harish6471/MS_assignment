package com.assignment.springbootdepartment;

public class Errors  extends  Exception{
    public Errors() {
        super();
    }

    public Errors(String message) {
        super(message);
    }

    public Errors(String message, Throwable cause) {
        super(message, cause);
    }

    public Errors(Throwable cause) {
        super(cause);
    }

    protected Errors(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
