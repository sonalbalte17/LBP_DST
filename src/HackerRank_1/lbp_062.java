package HackerRank_1;

import java.util.Scanner;

public class lbp_062 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        String s = obj.nextLine().toLowerCase();
        System.out.println((s.contains("bomb"))?"DUCK!":"Relax, there's no bomb.");
    }
}
