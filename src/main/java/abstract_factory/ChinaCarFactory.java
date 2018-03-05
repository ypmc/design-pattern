package abstract_factory;

/**
 * @author Test
 */
public class ChinaCarFactory extends CarFactory{
    AbstractBMW produceBMW() {
        return new BMW("X1");
    }

    AbstractAudi produceAudi() {
        return new Audi("A1");
    }
}
