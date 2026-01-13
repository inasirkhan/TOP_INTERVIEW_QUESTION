package top150.deqode.desingpattern;

class User{

    private int id;
    private String name;
    private int age;

    public User(UserBuilder userBuilder) {
        this.id = userBuilder.id;
        this.name = userBuilder.name;
        this.age = userBuilder.age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    static class UserBuilder{
        private int id;
        private String name;
        private int age;

        public UserBuilder setId(int id){
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age){
            this.age = age;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }
}

public class BuilderPattern {

    public static void main(String[] args) {
        User builUser = new User.UserBuilder()
                .setId(101)
                .setAge(27)
                .setName("Nasser")
                .build();
    }
}
