import java.util.*;
import java.lang.*;
import java.io.*;

public class rb{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int currentSum=0,maxSum=0,currentSum2=0,maxSum2=0,ans=0;
            int n=sc.nextInt();
            int a[]=new int[n];

            for(int i=0;i<n;i=i+1){
                a[i]=sc.nextInt();
            }

            int m=sc.nextInt();
            int b[]=new int[m];

            for(int i=0;i<m;i=i+1){
                b[i]=sc.nextInt();
            }

            for(int i=0;i<n;i=i+1){
                currentSum=currentSum+a[i];
                maxSum=Math.max(currentSum,maxSum);
            }

            for(int i=0;i<m;i=i+1){
                currentSum2=currentSum2+b[i];
                maxSum2=Math.max(currentSum2,maxSum2);
            }

            ans=maxSum+maxSum2;

            System.out.println(ans);

        }
    }
}