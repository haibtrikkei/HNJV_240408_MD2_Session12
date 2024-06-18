package chuabai8;

public class MyLinkedList <E>{
    private Node head;
    private int numNodes;

    public MyLinkedList(){
        head = null;
    }

    public void add(int index, E element){
        //khởi tạo node mới với giá trị được truyền vào theo hàm add
        Node node = new Node(element);

        if(head==null){
            head = node;
        }else {
            if (index == 1) {
                //gan vao node dau tien
                node.setNext(head);
                head = node;
            } else {
                //Dùng biến temp để chạy qua các phần tử của danh sách
                Node temp = head;

                //Chạy từ node đầu tiên đến node thứ index-1 (mục đích để chèn 1 node mới vào vị trí index)
                for (int i = 1; i < index; i++) {
                    if (temp.getNext() != null)
                        temp = temp.getNext();
                }


                //Gán node này vào danh sách ở vị trí index

                //Lấy next của node mới tro vao temp
                node.setNext(temp.getNext());

                //temp trỏ tới node mới vừa tạo
                temp.setNext(node);
            }
        }
    }

    public void addFirst(E e){
        //Tạo node mới
        Node node = new Node(e);

        //add vào đầu thì head sẽ trỏ tới node
        node.setNext(head);
        head = node;
    }

    public void addLast(E e){
        //Tạo node mới
        Node node = new Node(e);
        node.setNext(null);

        //dùng 1 node temp để chạy tới node cuối cùng trong danh sách
        Node temp = head;
        while(temp.getNext()!=null){
            temp = temp.getNext();
        }

        temp.setNext(node);

    }

    public E remove(int index){
        //Dùng 1 biến temp để chạy tới index - 1
        Node temp = head;
        for(int i=1;i<index;i++){
            if(temp.getNext()!=null)
                temp = temp.getNext();
        }
        //xóa vị trí index và trả ra cho hàm
        Node nodeDelete = temp.getNext();
        temp.setNext(nodeDelete.getNext());
        return (E) nodeDelete.getData();
    }

    public boolean remove(Object e){
        Node temp = head;
        Node beforeTemp = head;

        while(temp.getNext()!=null && !temp.getData().equals(e)){
            beforeTemp = temp; //beforeTemp dung ngay truoc temp
            temp = temp.getNext(); //temp chay ra dang sau
        }

        if(!temp.getData().equals(e)){
            return false;
        }

        //temp.getData() == e nen xoa temp
        beforeTemp.setNext(temp.getNext());
        return true;
    }

    public int size(){
        int total = 0;
        if(head!=null)
            total = 1;
        Node temp = head;
        while(temp.getNext()!=null){
            total++;
            temp = temp.getNext(); //cau lenh nay de temp chay tiep ra dang sau
        }
        return total;
    }

    public E clone(){
        return (E) head;
    }

    public boolean contains(E o){
        if(head==null)
            return false;

        Node temp = head;
        while(temp.getNext()!=null && !temp.getData().equals(o))
            temp = temp.getNext();
        if(temp.getData().equals(o))
            return true;
        return false;
    }

    public int indexOf(E o){
        if(head==null)
            return 0;
        Node temp = head;
        int index = 1;
        while(temp.getNext()!=null && !temp.getData().equals(o)) {
            temp = temp.getNext();
            index++;
        }
        if(temp.getData().equals(o))
            return index;
        return 0;
    }

    public boolean add(E e){
        //add e vao cuoi danh sach
        Node node = new Node(e);
        node.setNext(null);
        if(head==null) {
            head = node;
        }else{
            Node temp = head;
            while(temp.getNext()!=null)
                temp = temp.getNext();
            temp.setNext(node);
        }
        return true;
    }

    public void ensureCapacity(int minCapacity){
        System.out.println("I'm sure!!!");
    }

    public E get(int i){
        //neu i vuot khoi so phan tu cua danh sach thi tra ra phan tu cuoi cung
        if(head==null)
            return null;

        Node temp = head;
        int index = 1;
        while(index<i && temp.getNext()!=null){
            index++;
            temp = temp.getNext();
        }
        return (E) temp.getData();
    }

    public E getFirst(){
        if(head==null)
            return null;

        return (E) head.getData();
    }

    public E getLast(){
        if(head==null)
            return null;

        Node temp = head;
        while(temp.getNext()!=null)
            temp = temp.getNext();
        return (E) temp.getData();
    }

    public void clear(){
        head = null;
    }
}
