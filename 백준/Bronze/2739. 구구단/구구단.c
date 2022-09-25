#include <stdio.h>

int main(){
    int a;
    scanf("%d", &a);
    if(a>0 && a<10){
        for(int i=1;i<10;i++){
        printf("%d * %d = %d\n", a, i, a*i);
    }
    }
    
}