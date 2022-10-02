#include <stdio.h>

int main(void)
{
    int num, c=1;
    scanf("%d", &num);
    for(int i=0;i<num;i++){
        for(int k=i;k>0;k--){
            printf(" ");
        }
        for(int j=2*num-c;j>=1;j--){
            printf("*");
        }
        c+=2;
        printf("\n");        
      }
}