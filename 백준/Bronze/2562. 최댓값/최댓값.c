#include<stdio.h>

int main(){
  int a[9];
  int num=0, c;
  
  for(int i=0;i<9;i++){
    scanf("%d\n", &a[i]);
    
    if(num<a[i]){
      num = a[i];
      c = i;
    }
    }
  printf("%d\n", num);
  printf("%d", c+1);
}