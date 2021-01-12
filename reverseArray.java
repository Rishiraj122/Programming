import java.util.*;
import java.lang.*;
import java.io.*;

public class reverseArray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();

        ArrayList<Integer> arr=new ArrayList<Integer>();

        for(int i=0;i<n;i=i+1){
            int value=sc.nextInt();
            arr.add(value);
        }
        
        for(int i=0;i<n;i=i+k){
            int left=i;
            int right=Math.min(i+k-1,n-1);
            int temp;

            while(left<right){
                temp=arr.get(left);
                arr.set(left, arr.get(right));
                arr.set(right,temp);
                left=left+1;
                right=right-1;
            }
        }
        for(int i=0;i<n;i=i+1){
            System.out.print(arr.get(i)+" ");
        }

    }
}