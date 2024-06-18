package chuabai8;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<Integer> list = new MyLinkedList<>();

        list.add(10,100);

        System.out.println(list.getFirst());

        list.add(1,1000);
        System.out.println("list.size()="+list.size());
        System.out.println(list.getFirst());
        System.out.println("--- once a gain---");
        list.add(1,1000);
        System.out.println("list.size()="+list.size());
        System.out.println(list.getFirst());
    }
}
