import java.util.*;
import java.lang.*;
import java.io.*;

class passwords {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        while(testcases-->0){
            String s=sc.next();
            int length=s.length(),flag1=0,flag2=0,flag3=0,flag4=0,flag5=1;
            if(length<10){
                flag5=0;
            }
            else{
                for(int i=0;i<length;i=i+1){
                    char ch=s.charAt(i);
                    if(ch>='a' && ch<='z'){
                        flag1++;
                    }
                }
                for(int i=1;i<length-1;i=i+1){
                    char ch=s.charAt(i);
                    
                    if(ch>='A' && ch<='Z'){
                        flag2++;
                    }
                    else if(ch>='0' && ch<='9'){
                        flag3++;
                    }
                    else if(ch=='@' || ch=='#' || ch=='%' || ch=='&' || ch=='?'){
                        flag4++;
                    }
                }
            }
            if(flag1>0 && flag2>0 && flag3>0 && flag4>0 && flag5==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
