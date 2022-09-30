#include <stdio.h>

int main(void) {
  int a, b;
  for(;;){
    if(scanf("%d %d", &a, &b) != EOF){
    printf("%d\n", a+b);
    }else{
      break;
    }
  }
  }