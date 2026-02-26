package top150.deqode.intuit.day6;

class user{

    private int id;
    private String name;
    private String city;

    public user(UserBuilder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.city = builder.city;
    }

    static class UserBuilder{
        private int id;
        private String name;
        private String city;

        public UserBuilder setId(int id){
            this.id = id;
            return this;
        }

        public UserBuilder setName(String name){
            this.name = name;
            return this;
        }

        public UserBuilder setCity(String city){
            this.city = city;
            return this;
        }

        public user build(){
            return new user(this);
        }
    }


}


public class BuilderPattern {

    public static void main(String[] args) {
        user build = new user.UserBuilder().setId(101).setName("Nasser").setCity("Indore").build();
        System.out.println(build);

    }
}
