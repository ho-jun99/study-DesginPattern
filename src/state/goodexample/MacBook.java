package state.goodexample;

import state.goodexample.state.OffState;
import state.goodexample.state.PowerState;

public class MacBook {
    PowerState state;

    MacBook(){
        setSate(new OffState());
        System.out.println("====================");
        System.out.println("[전원 OFF] 맥북이 생성 됐습니다.");
        System.out.println("====================");
    }

    public void setSate(PowerState nextSate){
        state = nextSate;
    }

    public void pushButton(){
        state.pushButton(this);
    }

}
