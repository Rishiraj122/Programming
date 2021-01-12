import java.util.*;
import java.io.*;
import java.lang.*;

public class strangeList {
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();
            int x=sc.nextInt();
            double solve=0;
            ArrayList<Integer> arr=new ArrayList<Integer>();

            for(int i=0;i<n;i=i+1){
                int key=sc.nextInt();
                arr.add(key);
            }

            for(int i=0;i<arr.size();i=i+1){
                int val=arr.get(i);
                int temp=x;
                if(val%x==0){
                    while(temp-->0){
                        arr.add(val/x);
                    }
                }
                else{
                    break;
                }
            }

            for(int i=0;i<arr.size();i=i+1){
                solve=solve+ arr.get(i);
            }

            System.out.println((int)solve);

        }

    }
}
