package decorator;

/**
 * @author Test
 */
public class NuttyIcecreamDecorator extends IcecreamDecorator {
    public NuttyIcecreamDecorator(Icecream icecream) {
        super(icecream);
    }

    public void makeIcecream() {
        super.makeIcecream();
        System.out.println("add nutty");
    }
}
