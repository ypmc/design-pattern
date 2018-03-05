package abstract_factory;

/**
 * @author Test
 */
public class Main {
    public static void main(String[] args) {
        ChinaCarFactory chinaCarFactory = new ChinaCarFactory();
        AbstractAudi audi0 = chinaCarFactory.produceAudi();
        AbstractBMW bmw0 = chinaCarFactory.produceBMW();
        audi0.run();
        bmw0.run();
        JapanCarFactory japanCarFactory = new JapanCarFactory();
        AbstractAudi audi1 = japanCarFactory.produceAudi();
        AbstractBMW bmw1 = japanCarFactory.produceBMW();
        audi1.run();
        bmw1.run();

    }
}
