import java.util.*;
import java.lang.*;
import java.io.*;

class chefMeetings {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();
        String p=sc.next();
        while(testcases-->0){
            String dn="";
            dn=sc.next();
            int hour,hour2,hour3;

            hour=1000*(p.charAt(0)-'0')+100*(p.charAt(1)-'0')+10*(p.charAt(3)-'0')+(p.charAt(4)-'0');
            
            if(dn.charAt(0)=='P' && hour<1200){
                hour=hour+1200;
            }

            if(dn.charAt(0)=='A' && hour>=1200){
                hour=hour-1200;
            }


            String str="";
            int n=sc.nextInt();  
            while(n-->0){
                String l=sc.next();
                dn=sc.next();

                hour2=1000*(l.charAt(0)-'0')+100*(l.charAt(1)-'0')+10*(l.charAt(3)-'0')+(l.charAt(4)-'0');

                if(dn.charAt(0)=='P' && hour2<1200){
                    hour2=hour2+1200;
                }
    
                if(dn.charAt(0)=='A' && hour2>=1200){
                    hour2=hour2-1200;
                }
        
                String r=sc.next();
                dn=sc.next();
                hour3=1000*(r.charAt(0)-'0')+100*(r.charAt(1)-'0')+10*(r.charAt(3)-'0')+(r.charAt(4)-'0');
                
                if(dn.charAt(0)=='P' && hour3<1200){
                    hour3=hour3+1200;
                }
    
                if(dn.charAt(0)=='A' && hour3>=1200){
                    hour3=hour3-1200;
                }
    

                if(hour>=hour2 && hour<=hour3){
                    str=str+"1";
                }
                else if(hour<=hour2 && hour>=hour3){
                    str=str+"1";
                }
                else{
                    str=str+"0";
                }
                System.out.println("hour "+ hour + " hour2 "+hour2+" hour3 "+hour3);                
            }  

            System.out.println(str);

        }
    }
}
