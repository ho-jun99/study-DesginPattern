package state.goodexample.state;

import state.goodexample.MacBook;

public class OnState implements PowerState {

    @Override
    public void pushButton(MacBook mac) {
        System.out.println("[ON->SLEEP] 맥북이 절전모드에 돌입합니다.");
        mac.setSate(new SleepState());
    }
}
