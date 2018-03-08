package chain_of_responsibility;

/**
 * @author kangkang lou
 */
public class Email {
    private String from;

    public Email(String from) {
        this.from = from;
    }

    public String getFrom() {
        return from;
    }
}
