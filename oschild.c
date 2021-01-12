#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>

int main()
{
    int pid;
    pid=fork();
    if(pid>0){
        wait(NULL);
        printf("child");
    }
    else{
        printf("eeeParent");
    }
    return 0;
}