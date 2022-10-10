#include <stdio.h>
int main(void) {
  int a;
  scanf("%d", &a);
  int b, c;
  for(int i=0;i<a;i++){
    scanf("%d,%d", &b, &c);
    printf("%d\n", b+c);
  }
  return 0;
}