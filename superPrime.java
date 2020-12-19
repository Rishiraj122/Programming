import java.util.*;
import java.io.*;
import java.lang.*;

public class superPrime {
    
    public static int checkPrime(int num){
        int flag = 0;
        for (int i = 2; i <= num / 2; ++i) {
          // condition for nonprime number
          if (num % i == 0) {
            flag = 1;
            break;
          }
        }
    
        if (flag==0)
            return 1;
        else
            return 0;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        // code here
        int[] arr=new int[n+1];
        int[] b=new int[n+1];
        int k=0,j=0;
        for(int i=2;i<=n;i=i+1){
            
            if(checkPrime(i)==1){
                arr[k++]=i;
            
                if(k>=2){
                    if(arr[k-2]+2==arr[k-1]){
                        j++;
                    }
                }
            }
        }

        for(int i=0;i<k;i=i+1){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n"+j);
    }
};
