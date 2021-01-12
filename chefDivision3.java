import java.util.*;
import java.io.*;
import java.lang.*;

class chefDivision3 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int d=sc.nextInt();
            int[] arr=new int[n];
            int sum=0;

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
                sum=sum+arr[i];
            }

            sum=sum/k;

            if(sum>d){
                System.out.println(d);
            }
            else{
                System.out.println(sum);
            }

        }
    }    
}
