package strategy.Test;

import strategy.schedule.LeastJob;
import strategy.schedule.PriorityAllocation;
import strategy.schedule.RoundRobin;
import strategy.schedule.Scheduler;
import strategy.teller.KoreaTeller;
import strategy.badsample.RoundRobinTeller;
import strategy.teller.Teller;

public class Test {
    public static void main(String[] args) {

        // Strategy를 통해 구현된 알고리즘(행동)
        Scheduler leastJob = new LeastJob();
        Scheduler roundRobin = new RoundRobin();
        Scheduler priority = new PriorityAllocation();

        Teller hojun = new KoreaTeller("KoreaHojun");

        // leastJob
        hojun.setScheduleType(leastJob);
        hojun.takeCall();
        System.out.println();

        // roundRobin
        hojun.setScheduleType(roundRobin);
        hojun.takeCall();
        System.out.println();

        // priority
        hojun.setScheduleType(priority);
        hojun.takeCall();
        System.out.println();
    }
}
