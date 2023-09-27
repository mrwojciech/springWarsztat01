package pl.coderslab.beans;

public class Hello {
    private String message;

    public Hello(String message) {
        this.message = message;
    }

    public Hello() {

    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void printMessage() {
        System.out.println("Hello{ message='" + message + "}");
    }
}
