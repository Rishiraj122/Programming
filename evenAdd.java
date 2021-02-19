import java.util.*;
import java.lang.*;
import java.io.*;

class evenAdd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int[] array=new int[n];
            int sum=0;

            for(int i=0;i<n;i=i+1){
                array[i]=sc.nextInt();
                sum=sum+array[i];
            }

            if(sum%2==0){
                System.out.println("1");
            }
            else{
                System.out.println("2");
            }

        }
    }
}
