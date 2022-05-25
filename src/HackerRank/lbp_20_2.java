package HackerRank;
//wap to print Fibonacci series "0 1 1 2 3 5 8 13 21 34
public class lbp_20_2 {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int max=10;
        int sum=0;
        for(int i=1;i<=max;i++){
            System.out.print(n1+" ");
            sum=n1+n2;
            n1=n2;
            n2=sum;
    }
}}
