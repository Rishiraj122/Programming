import java.util.*;
import java.lang.*;
import java.io.*;

public class kDivisible {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            
            int mod=n%k;
            int ans=(k-mod)%k;
            ans=(ans+n-1)/n;
            System.out.println(ans+1);
        }
    }
}
