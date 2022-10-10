#include <stdio.h>
int main(void){

int N, min, max;
scanf("%d",&N);
int num[N];

min = 1e6; // 명시적으로 값 할당
max = -1e6; // 명시적으로 값 할당
for (int i = 0; i < N; i++){
scanf("%d",&num[i]);
if (min > num[i])
min = num[i];
if (max < num[i])
max = num[i];
}
printf("%d %d",min,max);
}