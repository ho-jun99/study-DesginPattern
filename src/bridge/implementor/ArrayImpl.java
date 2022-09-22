package bridge.implementor;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T>{

    ArrayList<T> array;

    public ArrayImpl(){
        array = new ArrayList<T>();
        System.out.println("ArrayList로 구현됨");
    }

    @Override
    public void addElement(T obj) {
        array.add(obj);
    }

    @Override
    public T deleteElement(int i) {
        return array.remove(i);
    }

    @Override
    public int insertElement(T obj, int i) {
        array.add(i,obj);
        return i;
    }

    @Override
    public T getElement(int i) {
        return array.get(i);
    }

    @Override
    public int getElementSize() {
        return array.size();
    }

    @Override
    public String toString() {
        return "ArrayList";
    }
}
