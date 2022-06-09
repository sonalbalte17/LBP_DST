package HackerRank;
//Given three integers i,j & k, a sequence sum to be the value of i+(i+1)+(i+2)..+j+(j-1)+(j-2)+..+k (increment from i until it equals to j, then decrement from j until equals k). Given values i,j,k. caluclate the sequence sum as described.
//int getSequenceSum(int,int,int);
import java.util.Scanner;

public class lbp_027 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
int i= obj.nextInt();
int j= obj.nextInt();
int k= obj.nextInt();
int sum=0;
while(i<=j){
    sum=sum+(i++);
}
while(j>k)//(j!=k) can be used too
{
    sum=sum+(--j);
}
        System.out.println(sum);
    }
}
