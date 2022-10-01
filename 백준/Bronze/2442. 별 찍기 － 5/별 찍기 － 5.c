#include<stdio.h>

int main()
{
    int n,i,sum=0;
    scanf("%d",&n);
    while(n--){
    	for(i=0;i<n;i++) printf(" ");
    	for(i=(++sum)*2-1;i>0;i--) printf("*");
        printf("\n");
    }
    return 0;
}