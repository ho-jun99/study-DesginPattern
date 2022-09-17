package builder;

public class User {
    private String name;
    private int age;
    private String nickname;
    private String id;
    private String pwd;

    private User(Builder builder){
        this.name = builder.name;
        this.age = builder.age;
        this.nickname = builder.nickname;
        this.id = builder.id;
        this.pwd = builder.pwd;
    }

    @Override
    public String toString() {
        return "name : " + name + "\nage : " + age + "\nnickname : " + nickname + "\nid : " + id + "\npwd : " + pwd;
    }

    public static class Builder{
        private String name;
        private int age;
        private String nickname;
        private String id;
        private String pwd;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder nickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder pwd(String pwd) {
            this.pwd = pwd;
            return this;
        }

        public User build(){
            return new User(this);
        }
    }

}
