package observer.newspaper;

public class BroadCastCompany extends Company{
    String msg;
    String companyName;

    BroadCastCompany(String name){
        super();
        companyName = name;
    }

    @Override
    public void publishItem(String msg) {
        this.msg = companyName + "에서 알림," + msg;
        notifyAllUser();

    }

    @Override
    public String getMsg() {
        return msg;
    }
}
