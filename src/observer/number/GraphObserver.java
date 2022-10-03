package observer.number;

public class GraphObserver implements Observer{
    String name;

    GraphObserver(String name){
        this.name = name;
    }

    @Override
    public void update(NumberGenerator generator) {
        System.out.println("==@==|| GraphObserver - " +name+ "||==@==");
        System.out.print(generator.getNumber() + ", ");
        for(int i=0; i< generator.getNumber(); i++){
            System.out.print("*");
        }
        System.out.println();

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
