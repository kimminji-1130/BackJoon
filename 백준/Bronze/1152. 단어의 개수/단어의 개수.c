#include <stdio.h>
int main(void) {
  char s[9999999];

  scanf("%[^\n]", s);
  int a=0;
  for(int i=0; i<strlen(s);i++){
    if(s[i] != ' ')
      a++;
      while (s[i] != ' '){
        i++;
      }
    }
  printf("%d", a);
  return 0;
}