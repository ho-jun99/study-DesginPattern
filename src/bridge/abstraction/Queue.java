package bridge.abstraction;

import bridge.implementor.AbstractList;

public class Queue<T> extends List<T>{
    public Queue(AbstractList<T> mImpl) {
        super(mImpl);
        System.out.println("Queue임");
    }

    public void enQueue(T obj){
        impl.addElement(obj);
    }

    public T deQueue(){
        return impl.deleteElement(0);
    }
}
