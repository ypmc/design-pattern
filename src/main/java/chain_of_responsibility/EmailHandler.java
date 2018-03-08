package chain_of_responsibility;

/**
 * @author kangkang lou
 */
//Handler
public interface EmailHandler {

    void setNext(EmailHandler handler);

    void handleRequest(Email email);
}