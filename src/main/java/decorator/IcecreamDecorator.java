package decorator;

/**
 * @author Test
 */
public abstract  class IcecreamDecorator implements Icecream {
    private Icecream icecream;

    public IcecreamDecorator(Icecream icecream) {
        this.icecream = icecream;
    }

    public void makeIcecream() {
        icecream.makeIcecream();
    }
}
