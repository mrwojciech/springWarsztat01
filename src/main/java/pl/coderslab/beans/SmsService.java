package pl.coderslab.beans;

public class SmsService implements NotificationService {
    @Override
    public void send(String message) {
        System.out.println("sending SMS with message:" + message);
    }
}
