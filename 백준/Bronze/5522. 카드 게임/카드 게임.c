#include <stdio.h>
int main(void) {
  int num; int sum=0;
  for(int i=0;i<5;i++){
    scanf("%d\n", &num);
    sum += num;
  }
  printf("%d", sum);
  return 0;
}