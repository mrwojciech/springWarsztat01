package pl.coderslab.beans;

import lombok.Getter;

public class MessageSender {
    private NotificationService notificationService;
    @Getter
    private String message;


    public MessageSender() {
    }

    public MessageSender(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendMessage() {
        notificationService.send(message);
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
