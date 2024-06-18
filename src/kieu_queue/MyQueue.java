package kieu_queue;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyQueue<E> {
    private List<E> data;

    public MyQueue(){
        data = new ArrayList<>();
    }

    public boolean addElement(E e){
        return  data.add(e);
    }

    public E peek(){
        if(data.isEmpty())
            return null;
        return data.get(0);
    }

    public E poll(){
        if(data.isEmpty())
            return null;
        E value = data.get(0);
        data.remove(0);
        return value;
    }

    public E remove(){
        if(data.isEmpty())
            throw new NoSuchElementException("Queue empty!");
        E value = data.get(0);
        data.remove(0);
        return value;
    }

    public void viewList(){
        for(E e : data){
            System.out.println(e);
        }
    }
}
