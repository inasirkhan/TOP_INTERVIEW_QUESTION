package top150.designpatters;

class User{

    private final int id;
    private final String name;
    private final String city;

    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.city = userBuilder.city;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    static class UserBuilder{
        private int id;
        private String name;
        private String city;

        public UserBuilder setId(int id) {
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setCity(String city) {
            this.city = city;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

public class BuilderPattern {

    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setId(101)
                .setName("Nasser Khan")
                .setCity("Dharamshala")
                .build();

        System.out.println(user);
    }
}
