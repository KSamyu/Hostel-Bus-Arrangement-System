/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nancy
 */
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMessage {

    public static void main(String[] args) throws MessagingException {
        // Set the properties for the mail server
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");

        // Create a new session
        Session session = Session.getDefaultInstance(props);

        // Create a new message
        Message message = new MimeMessage(session);

        // Set the from and to addresses
        message.setFrom(new InternetAddress("a@gmail.com"));
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse("b@gmail.com"));

        // Set the subject and body of the message
        message.setSubject("Test message");
        message.setText("This is a test message.");

        // Send the message
        Transport.send(message);
    }
}
