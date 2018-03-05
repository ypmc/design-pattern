package decorator;

/**
 * @author Test
 */
public class Main {
    public static void main(String[] args) {
        Icecream icecream = new StrawberryIcecreamDecorator(new NuttyIcecreamDecorator(new SimpleIcecream()));
        icecream.makeIcecream();
    }
}
