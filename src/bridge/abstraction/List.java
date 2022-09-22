package bridge.abstraction;

import bridge.implementor.AbstractList;

public class List<T> {
    AbstractList<T> impl;

    public List(AbstractList<T> mImpl){
        impl = mImpl;
    }

    public void add(T obj){
        impl.addElement(obj);
    }

    public T get(int i){
        return impl.getElement(i);
    }

    public T remove(int i){
        return impl.deleteElement(i);
    }

    public int getSize(){
        return impl.getElementSize();
    }

}
