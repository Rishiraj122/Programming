import java.util.*;
import java.io.*;
import java.lang.*;

public class replaceElements{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int flag=0;
            int n=sc.nextInt();
            int d=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            if(arr[0]>d || arr[1]>d){
                flag=1;
            }
            int lowestSum=arr[0]+arr[1];

            for(int i=2;i<n;i=i+1){
                if(arr[i]>d){
                    arr[i]=lowestSum;
                }
            }
            
            for(int i=0;i<n;i=i+1){
                if(arr[i]>d){
                    flag=1;
                }
            }

            if(flag==1){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }

    }
}