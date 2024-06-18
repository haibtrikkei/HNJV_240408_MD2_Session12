package chuabai7;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity){
        elements = new Object[capacity];
    }

    public void add(int index, E element){
        if(index<0 || index>size){
            System.err.println("IndexOutOfBoundsException -> Vuot qua chi so cua mang");
            return;
        }
        if(size>=elements.length-1){
            System.err.println("Mang da day");
            return;
        }
        //don cac phan tu tu index ve cuoi de them phan tu moi vao
        size = size + 1;
        for(int i=size;i>index;i--){
            elements[i] = elements[i-1];
        }
        elements[index] = element;
    }

    public E remove(int index){
        if(index<0 || index>size){
            System.err.println("IndexOutOfBoundsException -> Vuot qua chi so cua mang");
            return null;
        }
        E value = (E) elements[index];
        for(int i=index;i<elements.length;i++){
            elements[i] = elements[i+1];
        }
        size = size-1;
        return value;
    }

    public int size(){
        return  size;
    }

    public E clone(){
        return (E) elements;
    }

    public boolean contains(E o){
        for(Object data : elements){
            E obj = (E) data;
            if(obj.equals(o))
                return true;
        }
        return false;
    }

    public int indexOf(E o){
        for(int i=0;i< elements.length;i++){
            E obj = (E) elements[i];
            if(obj.equals(o))
                return i;
        }
        return -1;
    }

    public boolean add(E o){
        if(size>elements.length-1){
            return false;
        }
        elements[size++] = o;
        return  true;
    }

    public void ensureCapacity(int minCapacity){
        if(minCapacity< elements.length){
            System.out.println("Co kha nang chua "+minCapacity+" phan tu");
        }else{
            System.out.println("Khong the chua duoc "+minCapacity+" phan tu");
        }
    }

    public E get(int i){
        if(i<0 || i>size){
            System.err.println("IndexOutOfBoundsException -> Vuot qua chi so cua mang");
            return null;
        }
        return (E) elements[i];
    }

    public void clear(){
        size = 0;
        elements = null;
    }
}
