package mediator;

public class Test {
    public static void main(String[] args) {
        Mediator kakaoTalk = new ChatApp();

        Colleague hojun = new User("hojun",kakaoTalk);
        Colleague james = new User("james",kakaoTalk);
        Colleague tom = new User("tom",kakaoTalk);

        kakaoTalk.addUser(hojun);
        kakaoTalk.addUser(james);
        kakaoTalk.addUser(tom);

        hojun.send("내일 밥 뭐 먹을래? ");
        james.send("치김볶 ㄱㄱ");
        tom.send("난 낼 다이어트할거야 밥 안먹을래");

    }
}
