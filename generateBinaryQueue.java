import java.util.*;
import java.io.*;
import java.lang.*;

class generateBinaryQueue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Queue<String> q=new LinkedList<String>();
        q.add("1");

        while(n-->0){
            String s1=q.peek();
            q.remove();
            System.out.print(s1+" ");
            q.add(s1+"0");
            q.add(s1+"1");
        }

    }
}
