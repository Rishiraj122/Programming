import java.util.*;
import java.lang.*;
import java.io.*;

class maximiseFunction {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            long max=Long.MIN_VALUE;
            long min=Long.MAX_VALUE;

            int n=sc.nextInt();
            long arr[]=new long[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();

                if(max<arr[i]){
                    max=arr[i];
                }

                if(min>arr[i]){
                    min=arr[i];
                }
            }

            long ans=2*(max-min);
            System.out.println(ans);

        }
    }
}
