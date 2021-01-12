import java.util.*;
import java.lang.*;
import java.io.*;

public class uniqueNumber{

    public static int check(String str, int n){
        int len=str.length();
        int sum=0;
        for(int i=0;i<len;i=i+1){
            sum=sum+(str.charAt(i)-'0');
        }
        if(sum==n){
            int arr[]=new int[10];
            Arrays.fill(arr, 0);    
            for(int i=0;i<len;i=i+1){
                int val=str.charAt(i)-'0';
                if(arr[val]!=0){
                    return -1;
                }
            }
        }

        if(sum!=n){
            return -1;
        }

        return 1;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int ans=0, i=0;
            String str="";
            while(i<n*10){
                str=Integer.toString(i);
                ans=check(str, n);
                if(ans==1){
                    System.out.println(str);
                    i=n*10;
                }
                i++;
            }
            if(ans!=1){
                System.out.println("-1");
            }
        }
    }
}