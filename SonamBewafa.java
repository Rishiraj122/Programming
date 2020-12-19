
import java.util.*;
import java.lang.*;
import java.io.*;

public class SonamBewafa {
	public static void main (String[] args) {
		//code
		Scanner sc=new Scanner(System.in);
		int testcases=sc.nextInt();
		while(testcases-->0){
            int n=sc.nextInt();
            int q=sc.nextInt();
            n=n*2;
            int[] arr=new int[n];
            int[] b=new int[q];
            ArrayList<Integer> li=new ArrayList<Integer>();

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<q;i=i+1){
                b[i]=sc.nextInt();
            }

            for(int i=0;i<n-1;i=i+2){
                int j;
                for(j=arr[i];j<=arr[i+1];j=j+1){
                    li.add(j);
                }
            }

            for(int i=0;i<q;i=i+1){
                int x=b[i];
                int ans=li.get(x)-1;
                System.out.print(ans+" ");
            }
            System.out.println();
		}
	}
}