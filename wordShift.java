import java.util.*;
import java.lang.*;
import java.io.*;

public class wordShift {
    public static String nextString(String temp, int wordLength){
        String newWord="";

        for(int i=0;i<temp.length();i=i+1){
            char ch=temp.charAt(i);
            ch=(char)(ch+wordLength);
            newWord=newWord+(ch);
        }

        return newWord;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String temp="",ans="";
        int wordLength=0;

        for(int i=0;i<str.length();i=i+1){
            if(str.charAt(i)==' '){
                ans=ans+nextString(temp, wordLength);
                wordLength=0;
                temp="";
                ans=ans+" ";
            }
            else{
                temp=temp+str.charAt(i);
                wordLength=wordLength+1;
            }
        }

        ans=ans+nextString(temp, wordLength);
        System.out.println(ans);
    }
}
