package HackerRank;
//no. of misses if special char found in string
import java.util.Scanner;

public class lbp_038 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine().toLowerCase();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch=s.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 0 && ch <= 9)||ch==' ')
              continue;
            else
                c++;

        }  System.out.print(c);
    }
}

