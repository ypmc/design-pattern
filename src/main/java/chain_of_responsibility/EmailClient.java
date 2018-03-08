package chain_of_responsibility;

/**
 * @author kangkang lou
 */
//email client
public class EmailClient {
    private EmailProcessor processor;

    public EmailClient() {
        createProcessor();
    }

    private void createProcessor() {
        processor = new EmailProcessor();
        processor.addHandler(new BusinessMailHandler());
        processor.addHandler(new PersonalMailHandler());
    }

    public void addRule(EmailHandler handler) {
        processor.addHandler(handler);
    }

    public void emailReceived(Email email) {
        processor.handleRequest(email);
    }

    public static void main(String[] args) {
        EmailClient client = new EmailClient();
        Email email0 = new Email("test@gmail.com");
        Email email1 = new Email("test@businessaddress.com");
        client.emailReceived(email0);
        client.emailReceived(email1);

    }
}
