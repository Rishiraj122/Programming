import java.util.*;
import java.io.*;
import java.lang.*;

public class candiesForFriends2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            int c=0;

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n;i=i+1){
                if(c==0){
                    c=c+arr[i];
                }
                else if(c<arr[i]){
                    c=c+arr[i];
                }
                else{
                    c=c-arr[i];
                }
            }

            if(c==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}
