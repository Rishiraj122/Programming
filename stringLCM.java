import java.util.*;
import java.io.*;
import java.lang.*;

public class stringLCM {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            String str=sc.next();
            String str2=sc.next();
            int flag=0;
            int len1=str.length();
            int len2=str.length();
            int lcm=Math.max(len1,len2);

            while(flag==0){
                if(lcm%len1==0 && lcm%len2==0){
                    flag=1;
                    break;
                }
                lcm=lcm+1;
            }

            str=str.repeat(lcm);
            str=str.substring(0,lcm);

            str2=str2.repeat(lcm);
            str2=str2.substring(0,lcm);
            if(str.equals(str2)){
                System.out.println(str);
            }
            else{
                System.out.println("-1");
            }
        }
    }
}
