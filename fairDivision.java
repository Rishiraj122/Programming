import java.util.*;
import java.lang.*;
import java.io.*;

public class fairDivision {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            int count=0,flag=0,ones=0,twos=0;

            for(int i=0;i<n;i=i+1){
                if(arr[i]==2){
                    count=count+1;
                    twos++;
                }
                else{
                    ones++;
                    if(flag==0){
                        flag=1;
                    }
                    else{
                        count=count+-1;
                        flag=0;
                    }
                }
            }

            if(ones==0){
                if(count%2==0){
                    System.out.println("YES");
                }
            }
            else if(twos==0){
                if(count%2==0){
                    System.out.println("YES");
                }
            }
            else if(count==0){
                System.out.println("YES");
            }
            else if(ones%twos==0 || twos%ones==0){
                System.out.println("YES");
            }

        }

    }
}
