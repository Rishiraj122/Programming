import java.io.*;
import java.lang.*;
import java.util.*;

class encodedString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int len=sc.nextInt();
            String str=sc.next();
            String ans="";
            char[] arr=new char[16];

            for(int i=0;i<16;i=i+1){
                arr[i]=(char)(97+i);
            }

            int key=0;

            while(key<len){
                String str2="";
                for(int i=key;i<4+key;i=i+1){
                    str2=str2+(str.charAt(i));
                }
                int value=Integer.parseInt(str2,2);
                ans=ans+arr[value];
                key=key+4;
            }

            System.out.println(ans);

        }

    }
}
