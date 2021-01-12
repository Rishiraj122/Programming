import java.util.*;
import java.lang.*;
import java.io.*;

public class cardsForFriends{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            long w=sc.nextLong();
            long h=sc.nextLong();
            long n=sc.nextLong();
            long counter=1,flag=0;

            while(flag!=1){
                if(w%2==0 && h%2==0){
                    if(w>h){
                        w=w/2;
                    }
                    else{
                        h=h/2;
                    }
                    counter=counter*2;
                }
                else if(w%2==0 && h%2!=0){
                    w=w/2;
                    counter=counter*2;
                }
                else if(h%2==0 && w%2!=0){
                    h=h/2;
                    counter=counter*2;
                }
                else{
                    flag=1;
                }
            }

            if(counter>=n){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }

    }
}