import java.util.*;
import java.io.*;
import java.lang.*;

public class reverseEquation {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            String S=sc.next();
            S=S+"+3";
            String str="",operator="";
            int length=S.length();
            Stack<String> stack=new Stack<String>();
            
            for(int i=0;i<length-1;i=i+1){
                char ch=S.charAt(i);
                char next=S.charAt(i+1);
                
                if(ch>='0' && ch<='9'){
                    if(next>='0' && next<='9'){
                        str=str+ch;
                    }
                    else{
                        str=str+ch;
                        stack.push(str);
                        str="";
                    }
                }
                else{
                    operator=operator+ch;
                    stack.push(operator);
                    operator="";
                }
            }
            S="";
            
            while(!stack.isEmpty()){
                S=S+stack.pop();
            }
            S=S.substring(1);
            System.out.println(S);
        }
    }
}
