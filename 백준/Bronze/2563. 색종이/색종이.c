#include<stdio.h>

int main(){
    int a[100][100]={0};
    int b, c1, c2;
    int c=0;
  scanf("%d", &b);
    for(int i=0;i<b;i++){
      scanf("%d %d", &c1, &c2);
      for(int i=c1;i<c1+10;i++){
    for(int j=c2;j<c2+10;j++){
      if(a[i][j]==0) {
        a[i][j]=1;
        c++;
          }
        }
      }
    }
  printf("%d", c);
  
}