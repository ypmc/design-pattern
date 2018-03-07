package command;

/**
 * @author kangkang lou
 */
public class Waiter {
    private Command command;

    public Waiter(Command command) {
        this.command = command;
    }

    public void execute() {
        this.command.execute();
    }
}
