#include <stdio.h>

int main(void) {
  int a, b, c;
  int sum=0;
  scanf("%d %d %d", &a, &b, &c);
  if(b<c) printf("%d\n", a/(c-b)+1);
  else printf("-1");
  return 0;
}