package chain_of_responsibility;

/**
 * @author kangkang lou
 */
public class PersonalMailHandler implements EmailHandler {
    private EmailHandler next;

    public void setNext(EmailHandler handler) {
        next = handler;
    }

    public void handleRequest(Email email) {
        if (!email.getFrom().endsWith("@gmail.com")) {
            next.handleRequest(email);
        } else {
            //handle request (move to correct folder)
            System.out.println("move to gmail folder");
        }
    }
}
