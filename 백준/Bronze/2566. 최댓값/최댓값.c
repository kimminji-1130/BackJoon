#include <stdio.h>
main () {
   int arr[100][100];
   int i, j, max, ga, se;
   max = 0;
   for (i=0; i<9; i++) {
      for (j=0; j<9; j++) {
         scanf("%d",&arr[i][j]);
         if (arr[i][j] > max) {
            ga = i;
            se = j;
            max = arr[i][j];
         } 
      }
   }
   printf("%d\n%d %d",max,ga+1,se+1);
}