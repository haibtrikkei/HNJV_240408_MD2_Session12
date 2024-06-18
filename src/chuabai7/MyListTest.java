package chuabai7;

public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();
        System.out.println("list.size() = "+list.size());
        final boolean blAdd = list.add(10);
        System.out.println("blAdd = "+blAdd);
        System.out.println("list.size() = "+list.size());
        System.out.println(list.get(list.size()-1));
        System.out.println("test add (index)");
        list.add(0, 20);
        System.out.println("list.size() = "+list.size());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("Test indexOf: "+list.indexOf(10));

    }
}
