package abstract_factory;

/**
 * @author Test
 */
public class Audi extends AbstractAudi {
    private String name;

    public Audi(String name) {
        this.name = name;
    }

    void run() {
        System.out.println(name + " audi run");
    }
}
