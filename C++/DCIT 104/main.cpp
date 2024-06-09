
 #include <iostream>
#include <cmath>
using namespace std;

bool isPrime(int num) {
    if (num <= 1) return false;
    if (num <= 3) return true;
    if (num % 2 == 0 || num % 3 == 0) return false;
    for (int i = 5; i * i <= num; i += 6) {
        if (num % i == 0 || num % (i + 2) == 0)
            return false;

  }
    return true;
}

int main() {
    int sum = 0;
    for (int i = 2; i <= 100; i++) {
        if (isPrime(i)) {
            cout << i << " is a prime number." << endl;
            sum += i;
        }
    }
    cout << "The sum of prime numbers up to 100 is: " << sum << endl;
    return 0;
}

