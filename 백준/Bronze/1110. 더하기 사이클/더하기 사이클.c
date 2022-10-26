#include<stdio.h>

int main(){
    int a;
    scanf("%d", &a);
    int cycle=0;
    int b=0,c=0;
    int check=a;
     b=check%10;
        c=((check/10)+(check%10))%10;    
        check=b*10+c;
        cycle++;
    while(a!=check){
        b=check%10;
        c=((check/10)+(check%10))%10;    
        check=b*10+c;
        cycle++;
      
    }
    printf("%d", cycle);
}