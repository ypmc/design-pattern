package singleton;

/**
 * @author Test
 */
public class Person {
    private static Person instance = new Person();

    private Person() {

    }

    public static Person getInstance() {
        return instance;
    }
}
