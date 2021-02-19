import java.util.*;
import java.lang.*;
import java.io.*;

public class newYear {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int number=sc.nextInt();
            int i=0,ans=0;
            //number = 2020*x + 2021*y
            for(i=0;i<=10000;i=i+1){
                int m=number-(2020*i);
                if(m<0){
                    System.out.println("NO");
                    break;
                }
                if(m%2021==0){
                    System.out.println("YES");
                    break;
                }
            }
        }
    }
}
