import java.util.*;
import java.lang.*;

class watchingCpl {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int testcases=sc.nextInt();

        while(testcases-->0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] arr=new int[n];
            int t1=0,t2=0,l=n-1,count=0;

            for(int i=0;i<n;i=i+1){
                arr[i]=sc.nextInt();
            }

            Arrays.sort(arr);

            for(int i=n-1;i>=0;i=i-2){
                if(t1<k){
                    t1=t1+arr[l--];
                    count=count+1;
                }
                if(t2<k){
                    t2=t2+arr[l--];
                    count=count+1;
                }
            }

            if(t1<k || t2<k){
                System.out.println("-1");
            }
            else{
                System.out.println(count);
            }
        }
    }
}
