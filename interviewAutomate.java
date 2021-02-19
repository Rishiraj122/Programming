import java.util.*;
import java.lang.*;
import java.io.*;

class interviewAutomate {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        
        while(testcases-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            
            int bot=0, slowFlag=0;
            int rejectedCondition;
            if(n%2!=0){
                rejectedCondition=n/2 + 1;
            }
            else{
                rejectedCondition=n/2;
            }
            double rejectedFlag=0;

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            for(int i=0;i<n;i=i+1){
                if(arr[i]>1 || arr[i]==-1){
                    bot=1;
                }
                if(arr[i]!=-1){
                    rejectedFlag=rejectedFlag+1;
                }
                if(arr[i]>k){
                    slowFlag=1;
                }
            }

            if(rejectedFlag<rejectedCondition){
                System.out.println("Rejected");
            }
            else if(slowFlag==1){
                System.out.println("Too Slow");
            }
            else if(bot==0){
                System.out.println("Bot");
            }
            else{
                System.out.println("Accepted");
            }

        }

    }
}
