package demo_quy;

public class CaiDatDeQuy {
    public long giaithua(int n){
        if(n==1)
            return 1;
        else
            return n*giaithua(n-1);
    }

    public long ham_mu(int x, int i, int n){
        if(i==n)
            return 1;
        else
            return  x*ham_mu(x,++i,n);
    }
}
