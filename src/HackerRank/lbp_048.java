package HackerRank;
//Accept video length in minutes the format is mm:ss in String format, create a function that takes video length and return it in seconds.
import java.util.Scanner;

public class lbp_048 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String[] s=obj.nextLine().split(":");
        System.out.println(Integer.parseInt(s[0])*60+Integer.parseInt(s[1]));
    }

}
