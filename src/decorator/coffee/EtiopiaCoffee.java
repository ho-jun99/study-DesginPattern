package decorator.coffee;

public class EtiopiaCoffee extends Coffee{
    @Override
    public void brewing() {
        System.out.print("EtiopiaCoffee ");
    }
}
