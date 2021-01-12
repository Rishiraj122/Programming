import java.util.*;
import java.lang.*;
import java.io.*;

public class regularBracketSequence{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            Stack<String> stack=new Stack<String>();
            StringBuffer sb=new StringBuffer();
            String str=sc.next();
            int len=str.length();
            int flag=0,a=0,b=0,c=0;

            for(int i=0;i<len;i=i+1){
                String temp=String.valueOf(str.charAt(i));

                if(len%2!=0){
                    flag=1;
                }
                else if(str.charAt(0)==')' || str.charAt(len-1)=='('){
                    flag=1;
                }

                else{
                    if(str.charAt(i)==')'){
                        a++;
                    }
                    else if(str.charAt(i)=='('){
                        b++;
                    }
                    else{
                        c++;
                    }
                }

            }

            if(a%2==0 && b%2==0 && c%2==0 && flag!=1){
                flag=0;
            }

            if(flag==0){
                System.out.println("YES");
            }
            else if(flag==1){
                System.out.println("NO");
            }
        }
    }
}