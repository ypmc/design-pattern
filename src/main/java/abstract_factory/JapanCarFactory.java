package abstract_factory;

/**
 * @author Test
 */
public class JapanCarFactory extends CarFactory {
    AbstractBMW produceBMW() {
        return new BMW("X3");
    }

    AbstractAudi produceAudi() {
        return new Audi("A6");
    }
}
