#include<stdio.h>

int main(){
    int x, n, a, b;
    int sum = 0;
    scanf("%d", &x);
    scanf("%d", &n);
    for(int i=0;i<n;i++){
        scanf("%d %d", &a, &b);
        sum = sum+(a*b);
        
    }
    if(x == sum){
            printf("Yes");
        }else{
            printf("No");
        }
}