package command;
/**
 * @author kangkang lou
 */
public class DinnerClient {

    public static void main(String[] args) {
        MakingFishCommand command0 = new MakingFishCommand(new MrSun());
        Waiter waiter0 = new Waiter(command0);
        waiter0.execute();

        MakingNoodleCommand command1 = new MakingNoodleCommand(new MrSun());
        Waiter waiter1 = new Waiter(command1);
        waiter1.execute();
    }
}
