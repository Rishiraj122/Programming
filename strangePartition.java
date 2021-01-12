import java.util.*;
import java.io.*;
import java.lang.*;

public class strangePartition {

    public static double find(int[] arr, int n, int x){
        double max=0;
        for(int i=0;i<n;i=i+1){
            if(arr[i]%x==0){
                max=max+arr[i]/x;
            }
            else{
                max=1+max+arr[i]/x;
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            int[] arr=new int[n+1];
            int[] b=new int[n];
            int[] c=new int[n];

            if(n%2!=0){
                arr[n]=0;
            }
            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            double max=0,min=0,e,f,g;

            e=find(arr,n,x);

            int j=0;

            for(int i=0;i<n;i=i+2){
                b[j++]=arr[i]+arr[i+1];
            }

            f=find(b,n,x);

            j=0;
            c[j++]=arr[0];

            for(int i=1;i<n;i=i+2){
                c[j++]=arr[i]+arr[i+1];
            }

            g=find(c,n,x);

            if(e>=f && e>=g){
                max=e;
            }
            else if(f>=g && f>=e){
                max=f;
            }
            else{
                max=g;
            }

            if(e<=f && e<=g){
                min=e;
            }
            else if(f<=g && f<=e){
                min=e;
            }
            else{
                min=g;
            }

            System.out.println((int)min+" "+(int)max);

        }
    }
}
