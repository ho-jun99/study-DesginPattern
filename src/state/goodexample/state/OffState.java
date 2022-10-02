package state.goodexample.state;

import state.goodexample.MacBook;

public class OffState implements PowerState {

    @Override
    public void pushButton(MacBook mac) {
        System.out.println("[OFF->ON] 맥북이  시작합니다.");
        mac.setSate(new OnState());
    }
}
