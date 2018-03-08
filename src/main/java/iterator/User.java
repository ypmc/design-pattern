package iterator;

/**
 * @author kangkang lou
 */
public class User {
    private int id;
    private String name;

    private User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("id is %s, name is %s", id, name);
    }

    public static Builder builder() {
        return new Builder();
    }

    static class Builder {
        private int id;
        private String name;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public User build() {
            return new User(id, name);
        }
    }
}
