package builder_pattern;

/**
 * @author Test
 */
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person.Builder().name("hello").password("hello").build();
        System.out.println(p1);
        /**
         * Lombok @Builder注解生成的源码
         */
        Person p2 = Person.builder().name("hello").password("hello").build();
        System.out.println(p2);
    }
}
