#include<stdio.h>

int main(){
    int a;
    scanf("%d", &a);
    
    for(int i=0;i<=a;i++){
        for(int j=a-1;j>=i;j--){
            printf("*");
        }
        printf("\n");
    }
}