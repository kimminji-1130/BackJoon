#include<stdio.h>

int main() {
    int a=1;   
    scanf("%d", &a);
    char b[1000][81];
    for (int i = 0; i < a; i++) {
        int sum = 0, num = 0;
        scanf("%s", &b[i]);
        for(int j=0;j<81;j++){;
            if (b[i][j] == 'O') {
                sum++;
                num += sum;
            }if (b[i][j] == 'X') {
                sum = 0;
            }
            
        }
        printf("%d\n", num);
        num = 0;
        sum = 0;
    }
    return 0;
}