package pl.coderslab;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pl.coderslab.beans.Hello;
import pl.coderslab.beans.MessageSender;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) context.getBean("hello");

        MessageSender messageSender = context.getBean("messageSender", MessageSender.class);
        System.out.println("messageSender.getMessage() = " + messageSender.getMessage());

        messageSender.sendMessage();

//        hello.printMessage();
        context.close();

    }
}
