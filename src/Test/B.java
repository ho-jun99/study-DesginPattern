package Test;

public class B extends A{
    String phoneNumber;

    public B(String name, int stnumber, String phoneNumber){
        super(name,stnumber);
        this.phoneNumber = phoneNumber;
    }

    @Override
    void showPhoneNumber() {
        System.out.println(phoneNumber);
    }
}
