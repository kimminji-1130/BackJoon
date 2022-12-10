#include <stdio.h>

int main(){
  int input1, input2;
  int a[100][100];
  int b[100][100];
  int sum[100][100]={};
  scanf("%d %d", &input1,&input2);
  for(int i=0;i<input1;i++){
    for(int j=0;j<input2;j++){
      scanf("%d", &a[i][j]);
    }
  }
  for(int i=0;i<input1;i++){
    for(int j=0;j<input2;j++){
      scanf("%d", &b[i][j]);
    }
  }
  for(int i=0;i<input1;i++){
    for(int j=0;j<input2;j++){
      sum[i][j]=a[i][j]+b[i][j];
      printf("%d ",sum[i][j]);
      }
    printf("\n");
    }
}