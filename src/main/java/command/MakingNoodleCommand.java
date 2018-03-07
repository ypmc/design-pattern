package command;

/**
 * @author kangkang lou
 */
public class MakingNoodleCommand implements Command {
    private ChefReceiver chef;

    public MakingNoodleCommand(ChefReceiver chef) {
        this.chef = chef;
    }

    @Override
    public void execute() {
        System.out.println("客人点了面");
        chef.makeNoodle();
    }
}
