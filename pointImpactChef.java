import java.util.*;
import java.lang.*;
import java.io.*;

class pointImpactChef{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            int n,k,x,y,i=0,j=0;
            n=sc.nextInt();
            k=sc.nextInt();
            x=sc.nextInt();
            y=sc.nextInt();

            int[] arr=new int[4];
            int[] b=new int[4];
            if(x==y){
                System.out.println(n+" "+n);
                i=1;
            }
            else if(x>y){
                int base=n-x;
                arr[0]=x+base;
                b[0]=y+base;
                arr[1]=y+base;
                b[1]=x+base;
                x=b[1]+base;
                y=arr[1]+base;
                base=y;
                arr[2]=y-base;
                b[2]=x-base;
                arr[3]=b[2];
                b[3]=arr[2];
            }
            else if(x<y){
                int base=n-y;
                arr[0]=x+base;
                b[0]=y+base;
                arr[1]=y+base;
                b[1]=x+base;
                x=arr[1]+base;
                y=b[1]+base;
                base=y;
                arr[2]=x-base;
                b[2]=y-base;
                arr[3]=b[2];
                b[3]=arr[2];
            }
        
            j=(k-1)%4;
            if(i==0){
                System.out.println(arr[j]+" "+b[j]);
            }
        }
    }
}