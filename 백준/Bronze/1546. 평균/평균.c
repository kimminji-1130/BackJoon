#include<stdio.h>

int main(){
  int a;
  int max=0;
  double answer=0;
  scanf("%d", &a);
  float num[a];
  for(int i=0;i<a;i++){
    scanf("%f", &num[i]);
    if(num[i]>max){
      max = num[i];
    }
  }
  for(int j=0;j<a;j++){
    answer += num[j]/max*100;
  }
  printf("%lf",answer/a);
}