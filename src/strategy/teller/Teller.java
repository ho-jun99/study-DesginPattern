package strategy.teller;

import strategy.schedule.Scheduler;

public abstract class Teller {
    public String name;
    public Scheduler mScheduler;

    public Teller(String name){
        this.name = name;
        mScheduler = null;
    }

    public void setScheduleType(Scheduler scheduleType) {
        this.mScheduler = scheduleType;
        System.out.println(mScheduler + " 방식으로 근무합니다.");
    }

    public void takeCall(){
        mScheduler.getNextCall();
        mScheduler.sendCallToAgent();
    }
}
