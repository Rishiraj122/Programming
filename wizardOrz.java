import java.util.*;
import java.lang.*;
import java.io.*;

public class wizardOrz{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String ans="989";
            int j=0;
            for(int i=3;i<50000;i=i+1){
                if(j==10){
                    j=0;
                }
                ans=ans+Integer.toString(j);
                j=j+1;
            }
        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();

            if(n==1){
                System.out.println(ans.substring(0,1));
            }
            else if(n==2){
                System.out.println(ans.substring(0,2));
            }
            else if(n==3){
                System.out.println(ans.substring(0,3));
            }
            else{
                System.out.println(ans.substring(0,n));
            }
        }
    }
}