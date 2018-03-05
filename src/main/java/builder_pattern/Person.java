package builder_pattern;

/**
 * @author Test
 */
public class Person {
    private String name;
    private String password;

    private Person(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String toString() {
        return String.format("name is %s, password is %s", name, password);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String password;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Person build() {
            return new Person(name, password);
        }
    }
}
