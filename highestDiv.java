import java.util.*;
import java.lang.*;
import java.io.*;

class highestDiv {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=10;i>=1;i=i-1){
            if(n%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
