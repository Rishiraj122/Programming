#include <stdio.h>

int main() {
	//code
	int testcases;
	scanf("%d",&testcases);
	while(testcases--){
	    int p,q,min=0,count=1;
	    scanf("%d%d",&p,&q);
	    min= (p < q ) ? p : q;
	    
	    for(int i=2;i<=min;i=i+1){
	        if(p%i==0 && q%i==0){
	            count++;
	        }
	    }
	    
	    printf("%d\n",count);
	    
	}
	
	
	return 0;
}