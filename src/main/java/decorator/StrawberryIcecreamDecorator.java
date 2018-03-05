package decorator;

/**
 * @author Test
 */
public class StrawberryIcecreamDecorator extends IcecreamDecorator {
    public StrawberryIcecreamDecorator(Icecream icecream) {
        super(icecream);
    }

    public void makeIcecream() {
        super.makeIcecream();
        System.out.println("add strawberry");
    }
}
