package HackerRank;

import java.util.Scanner;

public class lbp_031_2 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int n1= obj.nextInt();
     int n2= obj.nextInt();
    int n3= obj.nextInt();
        String str1=Integer.toString(n1);
        String str2=Integer.toString(n2);
        String str3=Integer.toString(n3);
      //  System.out.println(str1);
        for (int i = 0; i <str1.length() ; i++){
          //  int i;
            System.out.println(str1.charAt(i));}
            for (int j = 0; j < str2.length() ; j++) {
               System.out.println(str2.charAt(j));}
                for (int k = 0; k <str3.length() ; k++){
              System.out.println(str3.charAt(k));}

       if (str1.charAt(2)>str2.charAt(2)|| str1.charAt(2)>str3.charAt(2)){
           System.out.println(str1.charAt(2)+ " is largest");
           int a1= str1.charAt(2);

       if(str2.charAt(2)>str1.charAt(2)&&str2.charAt(2)>str3.charAt(2)){
           System.out.println(str2.charAt(2)+  "is largest.");
           int a2=str2.charAt(2);
       }
        }else System.out.println(str3.charAt(2)+  "--is largest");
       int a3= str3.charAt(2);

        if (str1.charAt(1)>str2.charAt(1)|| str1.charAt(1)>str3.charAt(1)){
            System.out.println(str1.charAt(1)+ " is largest");

            if(str2.charAt(1)>str1.charAt(1)&&str2.charAt(1)>str3.charAt(1)){
                System.out.println(str2.charAt(1)+  "--is largest.");
            }
        }else System.out.println(str3.charAt(1)+  "is largest");

        if (str1.charAt(0)>str2.charAt(0)|| str1.charAt(0)>str3.charAt(0)){
            System.out.println(str1.charAt(0)+ " is largest");

            if(str2.charAt(0)>str1.charAt(0)&&str2.charAt(0)>str3.charAt(0)){
                System.out.println(str2.charAt(0)+  "is largest.");
            }
        }else System.out.println(str3.charAt(0)+  "--is largest");

        System.out.println();
    }
    }

