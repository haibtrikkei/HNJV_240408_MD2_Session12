package kieu_queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();
//        System.out.println(queue.remove());

        queue.addElement(10);
        queue.addElement(5);
        queue.addElement(20);
        queue.addElement(7);

        queue.viewList();
    }
}
