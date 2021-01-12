import java.util.*;
import java.io.*;
import java.lang.*;

class watchingCplBestFit {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            int t1=k,t2=k,count=0;
            Arrays.sort(arr);

            for(int i=n-1;i>=0;i=i-1){
                if(t1<=arr[i] && t1>0){
                    t1=t1-arr[i];
                    count=count+1;
                    arr[i]=0;
                }
                else if(t2<arr[i] && t2>0){
                    t2=t2-arr[i];
                    count=count+1;
                    arr[i]=0;
                }
            }

            if(t1>0){
                for(int i=n-1;i>=0;i=i-1){
                    if(arr[i]!=0 && t1>0){
                        t1=t1-arr[i];
                        count=count+1;
                        arr[i]=0;
                    }
                }
            }

            if(t2>0){
                for(int i=n-1;i>=0;i=i-1){
                    if(arr[i]!=0 && t2>0){
                        t2=t2-arr[i];
                        count=count+1;
                    }
                }
            }

            if(t1>0 || t2>0){
                System.out.println("-1");
            }
            else
            System.out.println(count);

        }
    }
}
