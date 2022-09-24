#include<stdio.h>

int main(){
    int a, b, c;
    int sum;
    scanf("%d %d %d", &a, &b, &c);
    
    if(a==b && b==c){
        sum = 10000+a*1000;
        printf("%d", sum);
    }else if(a==b || a==c || b==c){
        if(a==b || a==c){
            sum=1000+a*100;
            printf("%d",sum);
        }else{
            sum=1000+c*100;
            printf("%d",sum);
        }
    }else{
        if(a>b && a>c){
            printf("%d", a*100);
        }else if(b>a && b>c){
            printf("%d", b*100);
        }else{
            
            printf("%d", c*100);
        }
    }
}