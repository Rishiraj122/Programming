import java.util.*;
import java.lang.*;
import java.io.*;

public class mapInterface{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        HashMap<String, String> capitalCities=new HashMap<String, String>();
        capitalCities.put("London", "NewYork");
        capitalCities.put("Australia","Arizona");
        capitalCities.put("Rome", "Berlin");
        System.out.println(capitalCities.get("Rome"));
        capitalCities.remove("Rome");

        for(String i: capitalCities.keySet()){
            System.out.println(i+" ");
        }

    }
}