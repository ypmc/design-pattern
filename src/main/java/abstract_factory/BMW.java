package abstract_factory;

/**
 * @author Test
 */
public class BMW extends AbstractBMW {
    private String name;

    public BMW(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(name + " bmw run");
    }
}
