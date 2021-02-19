import java.util.*;
import java.lang.*;
import java.io.*;

class pairMe {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int[] arr=new int[3];

            for(int i=0;i<3;i=i+1){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            if(arr[0]+arr[1]==arr[2]){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
