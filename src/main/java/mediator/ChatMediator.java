package mediator;

/**
 * @author kangkang lou
 */
public interface ChatMediator {

    void sendMessage(String msg, User user);

    void addUser(User user);
}
