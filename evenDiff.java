import java.util.*;
import java.lang.*;
import java.io.*;

class evenDiff {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        
        while(testcases-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int odd=0,even=0;

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
                
                if(arr[i]%2!=0){
                    odd=odd+1;
                }
                else{
                    even=even+1;
                }
            }

            if(even>odd){
                System.out.println(odd);
            }
            else{
                System.out.println(even);
            }

        }

    }
}
