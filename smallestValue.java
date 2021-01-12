import java.util.*;
import java.io.*;
import java.lang.*;

public class smallestValue{
    public static int HCF(int a, int b){
        int min=Math.min(a,b);
        int temp=0;

        for(int i=min;i>=1;i=i-1){
            if(a%i==0 && b%i==0){
                temp=i;
                break;
            }
        }
        return temp;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int commonFactor=HCF(a,b);
        System.out.println(b/commonFactor+" "+a/commonFactor);
    }
}