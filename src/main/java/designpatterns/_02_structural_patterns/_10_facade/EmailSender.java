package designpatterns._02_structural_patterns._10_facade;

public class EmailSender {

    private EmailSettings emailSettings;

    public EmailSender(EmailSettings emailSettings) {
        this.emailSettings = emailSettings;
    }

    public void sendEmail(EmailMessage emailMessage) {
        System.out.println("메일 전송 준비...");
        System.out.println("SMTP 서버: " + emailSettings.getHost());
        System.out.println("From: " + emailMessage.getFrom());
        System.out.println("To: " + emailMessage.getTo());
        System.out.println("Cc: " + emailMessage.getCc());
        System.out.println("Subject: " + emailMessage.getSubject());
        System.out.println("Text: " + emailMessage.getText());
        System.out.println("메일 전송 완료 (실제 전송은 생략됨)");
    }
}
