import java.util.*;
import java.io.*;
import java.lang.*;

public class CF690B {

    public static int compareIt(int n,String str){

        int flag=0;
        for(int i=0;i<=4;i=i+1){
            String str2=str.substring(0,i);
            String str3=str.substring(n-4+i);
            String res=str2+str3;
            String cmp="2020";
            flag=res.compareTo(cmp);
            if(flag==0){
                return 1;
            }   
        }
        return 0;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        
        while(testcases-->0){

            int n=sc.nextInt();
            String str=sc.next();
            int temp=compareIt(n,str);

            if(temp==0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }

        }
    }
}
