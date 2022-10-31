package pkg1;

public class Bcd {
    public static void main(String[] args) {
        int p=10000;
        int n=2;
        int r=10;
        int num =nik1(p,n,r);
        System.out.println(num);


    }
    public static int nik1(int p,int n,int r)// parameters with return type
    {
        int si=p*n*r/100;
        return(si);

    }
}

