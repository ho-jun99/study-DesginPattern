package builder;

public class Test {
    public static void main(String[] args) {
        User hojun = new User.Builder()
                .name("hojun")
                .nickname("hacker")
                .id("testId_123")
                .age(24)
                .pwd("password123")
                .build();

        System.out.println(hojun);
        System.out.println("======@@@@@======");

        User bob = new User.Builder()
                .name("bob")
                .id("bobtree1")
                .pwd("bob1234")
                .build();

        System.out.println(bob);


    }
}
