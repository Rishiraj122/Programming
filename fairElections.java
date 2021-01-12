import java.util.*;
import java.io.*;
import java.lang.*;

class fairElections{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int[] arr=new int[n];
            int[] b=new int[m];
            int vote1=0,vote2=0;

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
                vote1=vote1+arr[i];
            }
            for(int i=0;i<m;i=i+1){
                b[i]=sc.nextInt();
                vote2=vote2+b[i];
            }

            if(vote1>vote2){
                System.out.println(0);
                continue;
            }

            Arrays.sort(arr);
            Arrays.sort(b);

            int k=m-1,count=0;
            for(int i=0;i<n;i=i+1){
                vote1=vote1-arr[i];
                vote2=vote2-b[k];
                vote1=vote1+b[k];
                vote2=vote2+arr[i];
                count=count+1;
                k=k-1;
                if(vote1>vote2 || k<0){
                    break;
                }
            }

            if(vote1>vote2){
                System.out.println(count);
            }
            else{
                System.out.println("-1");
            }
        }

    }

}