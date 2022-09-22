package bridge.abstraction;

import bridge.implementor.AbstractList;

public class Stack<T> extends List<T> {
    public Stack(AbstractList<T> mImpl) {
        super(mImpl);
        System.out.println("Stack임");
    }

    public void push(T obj) {
        impl.insertElement(obj, 0);
    }

    public T pop() {
        return impl.deleteElement(0);
    }
}
