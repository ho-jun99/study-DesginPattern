package strategy.schedule;

// 전화 받는 스케줄링 방법에 대한 전략
public interface Scheduler {
    public void getNextCall();
    public void sendCallToAgent();
}
