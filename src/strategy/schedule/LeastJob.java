package strategy.schedule;

public class LeastJob implements Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("LeastJob 방식으로 다음 상담원을 연결합니다.");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("------연결중------");
        System.out.println("LeastJob, 상담원 연결이 됐습니다");
        System.out.println("------상담완료------");
    }

    @Override
    public String toString() {
        return "LeastJob Scheduler";
    }
}
