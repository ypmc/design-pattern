package singleton;

/**
 * double check
 *
 * @author Test
 */
public class PersonWithLazyLoading {
    private static PersonWithLazyLoading instance = null;

    private PersonWithLazyLoading() {

    }

    public static synchronized PersonWithLazyLoading getInstance() {
        if (instance == null) {
            synchronized (PersonWithLazyLoading.class) {
                instance = new PersonWithLazyLoading();
            }
        }
        return instance;
    }
}
