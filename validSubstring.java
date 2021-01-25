import java.util.*;
import java.lang.*;
import java.io.*;

class validSubstring{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            String s=sc.next();
            int length=s.length();
            int count=0,buffer=0;
            
            Stack<Integer> stack = new Stack<Integer>();
            stack.push(-1);

            for(int i=0;i<length;i=i+1){
                if(s.charAt(i)=='('){
                    stack.push(i);
                }
                else{
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                    if(!stack.isEmpty()){
                        buffer=Math.max(buffer, i-stack.peek());
                    }
                    else{
                        stack.push(i);
                    }
                }
            }   
            System.out.println(buffer);
        }
    }
}