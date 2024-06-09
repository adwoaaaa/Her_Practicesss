#include <iostream>

using namespace std;

int main()
{
    double annualSalary = 150000.89;
    double commissionPercentage = 0.15;
    double commissionAmount = annualSalary * commissionPercentage;

    cout << "Your Commission is " << commissionAmount << endl;

    return 0;
}
