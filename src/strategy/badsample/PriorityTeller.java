package strategy.badsample;

import strategy.schedule.Scheduler;
import strategy.teller.Teller;

public class PriorityTeller implements Scheduler {
    public String name;

    PriorityTeller(){
        name = "PriorityTeller";
    }

    @Override
    public void getNextCall() {
        System.out.println("PriorityAllocation 방식으로 다음 상담원을 연결합니다.");

    }

    @Override
    public void sendCallToAgent() {
        System.out.println("------연결중------");
        System.out.println("PriorityAllocation, 상담원 연결이 완료 됐습니다");
        System.out.println("------상담완료------");
    }
}
