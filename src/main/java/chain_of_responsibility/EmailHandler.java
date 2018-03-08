package chain_of_responsibility;

/**
 * @author kangkang lou
 */
//Handler
public interface EmailHandler {//reference to the next handler in the chain

    void setNext(EmailHandler handler);//handle requestpublic

    void handleRequest(Email email);
}