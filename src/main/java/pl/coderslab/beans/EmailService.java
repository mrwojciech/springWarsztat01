package pl.coderslab.beans;

public class EmailService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("sending email with message:" + message);
    }
}
