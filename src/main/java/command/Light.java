package command;

/**
 * @author kangkang lou
 */
public class Light {
    private boolean on;

    public void switchOn() {
        on = true;
        System.out.println("light is on");
    }

    public void switchOff() {
        on = false;
        System.out.println("light is off");
    }
}