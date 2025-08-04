package designpatterns._02_structural_patterns._10_facade;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EmailSender {

    private EmailSettings emailSettings;

    public EmailSender(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }
//    public void sendEmail(EmailMessage emailMessage) {
//        Properties properties = System.getProperties();
//        properties.setProperty("mail.smtp.host", emailSettings.getHost());
//
//        Session session = Session.getDefaultInstance(properties);
//
//        try {
//            MimeMessage message = new MimeMessage(session);
//            message.setFrom(new InternetAddress(emailMessage.getFrom()));
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(emailMessage.getTo()));
//            message.addRecipient(Message.RecipientType.CC, new InternetAddress(emailMessage.getCc()));
//            message.setSubject(emailMessage.getSubject());
//            message.setText(emailMessage.getText());
//
//            Transport.send(message);
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//    }

    public void sendEmail(EmailMessage emailMessage) {
        System.out.println("이메일 전송 시뮬레이션");
        System.out.println("SMTP Host: " + emailSettings.getHost());
        System.out.println("From: " + emailMessage.getFrom());
        System.out.println("To: " + emailMessage.getTo());
        System.out.println("Cc: " + emailMessage.getCc());
        System.out.println("Subject: " + emailMessage.getSubject());
        System.out.println("Text: " + emailMessage.getText());
    }
}