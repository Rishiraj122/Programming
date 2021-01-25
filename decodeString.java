import java.util.*;
import java.io.*;
import java.lang.*;

class decodeString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        Stack<Character> stack=new Stack<Character>();
        Stack<Integer> num=new Stack<Integer>();
        int length=s.length();
        String str="";

        for(int i=0;i<length;i=i+1){
            if(s.charAt(i)>='0' && s.charAt(i)<='9'){
                num.push(s.charAt(i)-'0');
            }
            else if(s.charAt(i)!=']'){
                stack.push(s.charAt(i));
            }
            else{
                char top=stack.pop();
                while(top!='['){
                    str=str+top;
                    top=stack.pop();
                }
                str=str.repeat(num.pop());
            }

        }

        StringBuffer temp=new StringBuffer();
        temp=temp.append(str);
        temp.reverse();
        str=temp.toString();
        System.out.println(str);
    }
}