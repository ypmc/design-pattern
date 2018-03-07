package command;

/**
 * @author kangkang lou
 */
public class MakingFishCommand implements Command {
    private ChefReceiver chef;

    public MakingFishCommand(ChefReceiver c) {
        this.chef = c;
    }

    @Override
    public void execute() {
        System.out.println("客人点了鱼");
        chef.makeFish();
    }
}
