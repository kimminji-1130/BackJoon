#include<stdio.h>

int main(){
    int H, M, a;
    scanf("%d %d", &H, &M);
    
    if(H==0)
       H=24;
    a = H*60+M-45;
    H = a/60;
    M = a%60;
    
    if(H==24)
        H=0;
    printf("%d %d", H, M);
}