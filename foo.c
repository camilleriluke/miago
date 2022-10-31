#include <stdlib.h>
#include <stdio.h>
#include <string.h>
#include <stdbool.h>

int main()
{
    int n;
    scanf("%d", &n);

    int a = 0, b = 1;

    while (a != n) {
        const int tmp = a + b;
        a = b;
        b = tmp;
    }

    printf("%d\n", b);

    return 0;
}
