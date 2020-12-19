import java.util.*;
import java.lang.*;
import java.io.*;

public class CF690{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int[] b=new int[n+2];
            int k=0;
            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n/2+1;i=i+1){
                b[k]=arr[i];
                b[k+1]=arr[n-1-i];
                k=k+2;
            }

            for(int i=0;i<n;i=i+1){
                System.out.print(b[i]+" ");
            }

            System.out.println();

        }
    }
}