import java.util.*;
import java.io.*;
import java.util.regex.Pattern;
import java.lang.*;

public class StringBreaker {


    static String reverseWords(String str) 
    { 
  
        // Specifying the pattern to be searched 
        Pattern pattern = Pattern.compile("\\s"); 
  
        // splitting String str with a pattern 
        // (i.e )splitting the string whenever their 
        //  is whitespace and store in temp array. 
        String[] temp = pattern.split(str); 
        String result = ""; 
  
        // Iterate over the temp array and store 
        // the string in reverse order. 
        for (int i = 0; i < temp.length; i++) { 
            if (i == temp.length - 1) 
                result = temp[i] + result; 
            else
                result = " " + temp[i] + result; 
        } 
        return result; 
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int len=str.length();
        String[] arr = str.split("\\s+");
        String temp=str.replaceAll("\\s", "");
        System.out.println("The First Two Words Are: "+ arr[0]+" "+arr[1]);
        System.out.println("Removing the white spaces: "+temp);
        System.out.println("The First Letter is: "+str.charAt(0));
        System.out.println("The Last Letter is: "+str.charAt(len-1));
        System.out.println("The First Letter of First Word is: "+str.charAt(0));

        String lastWord = str.substring(str.lastIndexOf(" ")+1);  
        System.out.println("First letter of last word: "+lastWord.charAt(0));

        String initials = "";
        for (String s : str.split(" ")) {
            initials+=s.charAt(0);
        }
        System.out.println("First Letter of each word: "+initials);

        System.out.println("The Word Reversal is: "+reverseWords(str));
    }    
}
