package state.badexample;

public class BadMacBook {
    enum Power {OFF,ON, SLEEP}
    Power state;

    BadMacBook(){
        state = Power.OFF;
        System.out.println("====================");
        System.out.println("[전원 OFF] 맥북이 생성 됐습니다.");
        System.out.println("====================");
    }

    private void setSate(Power nextSate){
        state = nextSate;
    }

    public void pushButton(){
        if (state == Power.OFF) {
            System.out.println("[OFF->ON] 맥북이 시작합니다.");
            setSate(Power.ON);
        } else if (state == Power.ON) {
            System.out.println("[ON->SLEEP] 맥북이 절전모드에 돌입합니다.");
            setSate(Power.SLEEP);
        } else if (state == Power.SLEEP) {
            System.out.println("[SLEEP->OFF] 맥북 전원이 종료됩니다.");
            setSate(Power.OFF);
        }
    }

}
