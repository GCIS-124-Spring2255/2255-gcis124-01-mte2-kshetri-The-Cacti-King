// Question: Q2 (mte2, gcis124, 2255)
// Package name: deques
// File name: MyDeque.java

package mte2.deques;

import java.util.Iterator;
import java.util.LinkedList;

public class MyDeque<E> implements Deque<E> {    
    private final LinkedList<E> list;
    public MyDeque() {    list = new LinkedList<>();    }

    @Override
    public void enqueueFront(E element) {
        list.add(0, element);
    }

    @Override
    public void enqueueBack(E element) {
        list.add(list.size(), element);
    }

    @Override
    public E dequeueFront() {
        E temp = list.remove(0);
        return temp;
    }

    @Override
    public E dequeueBack() {
        E temp = list.remove(list.size());
        return temp;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public Iterator<E> iterator() throws UnsupportedOperationException {
        {
            for(E values : list) {
                while(iterator().hasNext() == false) {
                    iterator().next() = values;
                }
            }
        }
    }

    public static void main(String[] args) { 

        // ...
    }
}