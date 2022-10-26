#include <stdio.h>

int main(void) {
  int n, v;
  int b[100];
  int count=0;
  scanf("%d", &n);
  for(int i=0;i<n;i++){
    scanf("%d", &b[i]);
}
  scanf("%d", &v);
  for(int j=0;j<n;j++){
    if(b[j]==v)
      count++;
  }
  printf("%d", count);
}