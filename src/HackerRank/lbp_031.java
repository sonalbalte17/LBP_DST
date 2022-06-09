package HackerRank;

import java.util.Scanner;

public class lbp_031 {
    static int maxD(int n) {
        int m,d;
        m=0;
        while (n!=0){
            d=n%10;
            if(m<d)
                m=d;
            n=n/10;
        }
        return m;
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int w,x,y,z,n1,n2,n3;
        n1= obj.nextInt();
         n2= obj.nextInt();
         n3= obj.nextInt();

        w=Math.min(Math.min(n1%10,n2%10),n3%10);
        x=Math.min(Math.min((n1/10)%10,(n2/10)%10),(n3/10)%10);
y=Math.min(Math.min(n1/100,n2/100),n3/100);

        z=Math.max(Math.max(maxD(n1),maxD(n2)),maxD(n3));
        System.out.println(z*1000+y*100+x*10+w);

}


}
