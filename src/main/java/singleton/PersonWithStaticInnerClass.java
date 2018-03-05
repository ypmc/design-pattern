package singleton;

/**
 * @author Test
 */
public class PersonWithStaticInnerClass {

    private static class SingletonHolder {
        private static final PersonWithStaticInnerClass instance = new PersonWithStaticInnerClass();
    }

    private PersonWithStaticInnerClass() {
    }

    public static final PersonWithStaticInnerClass getInsatance() {
        return SingletonHolder.instance;
    }
}
