package command;

/**
 * @author kangkang lou
 */
public class MrSun implements ChefReceiver {
    @Override
    public void makeFish() {
        System.out.println("孙师傅准备做鱼");
    }

    @Override
    public void makeNoodle() {
        System.out.println("孙师傅准备做面");
    }
}
