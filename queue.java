import java.util.*;
import java.lang.*;
import java.io.*;

public class queue {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            Queue<Integer> q=new LinkedList<>();
            System.out.println("Enter the number of elements");
            int n=sc.nextInt();
            for(int i=0;i<n;i=i+1){
                int x=sc.nextInt();
                q.add(x);
            }

            Stack<Integer> stack=new Stack<Integer>();

            for(Integer item:q){
                stack.push(item);
            }

            while(q.size()>0){
                q.remove();
            }

            while(!stack.isEmpty()){
                q.add(stack.pop());
            }

            for(Integer item: q){
                System.out.print(item+" ");
            }
        }
    }
}
