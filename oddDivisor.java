import java.util.*;
import java.lang.*;
import java.math.BigInteger;
import java.io.*;

public class oddDivisor {

    public static String check(long n){
        long i=1;
        while(i<=n){
            if(n==i){
                return "NO";
            }
            i=i*2;
        }
        return "YES";
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            long n=sc.nextLong();
            System.out.println(check(n));
        }
    }    
}
