import java.util.*;
import java.io.*;
import java.lang.*;

public class puzzleFromFuture{
    public static int maxVal(String a, String b){
        int c=Integer.parseInt(a)+Integer.parseInt(b);
        String temp=Integer.toString(c);
        String temp2="";
        if(temp.length()<b.length()){
            int x=b.length()-temp.length();
            while(x-->0){
                temp2=temp2+"0";
            }
            temp2=temp2+temp;
            temp=temp2;
        }

        String removeRepetition=temp;
        String d="";
        d=d+removeRepetition.charAt(0);
        for(int i=1;i<temp.length();i=i+1){
            if(removeRepetition.charAt(i)!=removeRepetition.charAt(i-1)){
                d=d+removeRepetition.charAt(i);
            }
        }
        return Integer.parseInt(d);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int  testcases=sc.nextInt();
        while(testcases-->0){
            int n=sc.nextInt();
            String str=sc.next();
            String str2="";
            String temp="";
            int a=0,ans=0,max=0,maxStr2=0;
            
            while(str2.length()<=n){

                str2=Integer.toBinaryString(a);
                
                if(str2.length()<=n){
                    int x=n-str2.length();
                    while(x-->0){
                        temp=temp+"0";
                    }
                    temp=temp+str2;
                    str2=temp;
                    temp="";
                    ans=maxVal(str2, str);
                }

                if(ans>=max){
                    max=ans;
                    maxStr2=Integer.parseInt(str2);
                }
                a=a+1;
            }


            if(str.equals("0")){
                System.out.println("1");
            }
            else if(str.equals("1")){
                System.out.println("1");
            }
            else{
                System.out.println(maxStr2);
            }    

        }
    }
}