#include <stdio.h>

int main(void) {
  double a, b;
  scanf("%lf", &a);
  for(int i=0;i<a;i++){
    double sum=0;
    int cnt=0;
    scanf("%lf", &b);
    double c[1000]={0};
    for(int j=0;j<b;j++){
      scanf("%lf", &c[j]);
      sum+=c[j];
    }
    sum=sum/b;
    for(int k=0;k<b;k++){
      if(c[k]>sum) cnt++;
    }
    printf("%.3lf%%", cnt/b*100.0);
    printf("\n");
  }
}