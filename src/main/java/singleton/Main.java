package singleton;

/**
 * @author Test
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = Person.getInstance();
        Person p2 = Person.getInstance();
        System.out.println(p1 == p2);
        PersonWithLazyLoading personWithLazyLoading0 = PersonWithLazyLoading.getInstance();
        PersonWithLazyLoading personWithLazyLoading1 = PersonWithLazyLoading.getInstance();
        System.out.println(personWithLazyLoading0 == personWithLazyLoading1);

        PersonWithStaticInnerClass personWithStaticInnerClass0 = PersonWithStaticInnerClass.getInsatance();
        PersonWithStaticInnerClass personWithStaticInnerClass1 = PersonWithStaticInnerClass.getInsatance();

        System.out.println(personWithStaticInnerClass0 == personWithStaticInnerClass1);
    }
}
