 #include <stdio.h>
 #include <math.h>

int main() {
int num1 = 2;
    int num2 = 3;
    int num3 = 7;
    int num4 = 5;
    int num5 = 4;
    int num6 = 6;
    int sum1 = num1 + num2 + num3 + num4 + num5 + num6;
    double average =(double) sum1 / 6;
    double squareaverage = average * average;
    double sumofsquares = (num1 * num1) + (num2 * num2) + (num3 * num3) + (num4 * num4) + (num5 * num5) + (num6 * num6);
    double average1 = sumofsquares / 6;
    double variation = average1 - squareaverage;
    double deviation = sqrt(variation);
    printf("the variation of the numbers 2, 3, 7, 5, 4, 6 is %.2f.\n", variation);
    printf("the standard deviation of the numbers 2, 3, 7, 5, 4, 6 is %.2f.\n", deviation);

    return 0;
}
