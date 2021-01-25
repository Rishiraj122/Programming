import java.util.*;
import java.io.*;
import java.lang.*;

class distinctPair {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int ans=(b-a)*2+1;
            System.out.println(ans);
        }
    }    
}
