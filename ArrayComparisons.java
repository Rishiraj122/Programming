import java.util.*;
import java.lang.*;
import java.io.*;

class ArrayComparisons{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int bottom=sc.nextInt();
            int left=sc.nextInt();
            int[] arr=new int[bottom];
            
                    

            int[] b=new int[left];


            int delay=0;

            for(int i=0;i<bottom;i=i+1){
                for(int j=0;j<left;j=j+1){
                    if(arr[i]==b[j]){
                        delay=delay+1;
                    }
                }
            }

            System.out.println(delay);

        }

    }
}