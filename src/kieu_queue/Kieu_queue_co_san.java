package kieu_queue;

import java.util.PriorityQueue;

public class Kieu_queue_co_san {
    public static void main(String[] args) {
        PriorityQueue<Integer> dsQueue = new PriorityQueue<>();

        dsQueue.add(10);
        dsQueue.add(20);
        dsQueue.add(5);
        dsQueue.add(30);
        dsQueue.add(15);

        //Lay phan tu dau tien nhung khong xoa phan tu khoi danh  sach
        System.out.println(dsQueue.peek());
        System.out.println(dsQueue.peek());
        //Lay phan tu dau tien va xoa hoi danh sach
        System.out.println(dsQueue.poll());
        while(!dsQueue.isEmpty())
            System.out.println(dsQueue.poll());

        //poll() khong co du lieu thi tra ra null
        System.out.println(dsQueue.poll());

        //Lay phan tu dau tien va, nhung neu khong co du lieu thi nem ra ngoai le
        System.out.println(dsQueue.remove());


    }
}
