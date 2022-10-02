package state.goodexample.state;

import state.goodexample.MacBook;

public class SleepState implements PowerState{
    @Override
    public void pushButton(MacBook mac) {
        System.out.println("[SLEEP->OFF] 맥북이 종료됩니다.");
        mac.setSate(new OffState());
    }
}
