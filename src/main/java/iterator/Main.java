package iterator;

/**
 * @author kangkang lou
 */
public class Main {

    public static void main(String[] args) {
        SimpleContainer<String> names = new SimpleContainer(8);
        for (int i = 0; i < 8; i++) {
            names.add(String.valueOf(i));
        }
        for (Iterator iterator = names.iterator(); iterator.hasNext(); ) {
            System.out.println("Name : " + iterator.next());
        }

        SimpleContainer<User> users = new SimpleContainer<>(8);
        for (int i = 0; i < 8; i++) {
            users.add(User.builder().id(i).name("user" + i).build());
        }
        for (Iterator iterator = users.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }
    }
}
