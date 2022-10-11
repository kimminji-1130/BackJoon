#include <stdio.h>

int main(void) {
  int a, i=2,j=5, cnt =2;
  scanf("%d", &a);
  if(a==1){
    printf("1");
    return 0;
  }
  while(1){
    if(i<=a && i+j >=a){
      printf("%d", cnt);
      break;
    }
    i = i+j+1;
    j +=6;
    cnt++;
  }
}