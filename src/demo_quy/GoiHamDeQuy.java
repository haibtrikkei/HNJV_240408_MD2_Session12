package demo_quy;

public class GoiHamDeQuy {
    public static void main(String[] args) {
        int n = 5;

        CaiDatDeQuy obj = new CaiDatDeQuy();
        long kq1 = obj.giaithua(n);
        System.out.println(n+"!="+kq1);

        int x = 2;
        long kq2 = obj.ham_mu(x,0,n);
        System.out.println(x+"^"+n+"="+kq2);
    }
}
