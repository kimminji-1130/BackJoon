#include <stdio.h>
#include <math.h>
int main(){
  int a[5];
  int sum=0;
  for(int i=0;i<5;i++){
    scanf("%d", &a[i]);
    a[i]*=a[i];
    sum+=a[i];
    
  }
printf("%d", sum%10);
}
