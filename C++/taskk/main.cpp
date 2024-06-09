#include <iostream>

using namespace std;

int main()
{
string name;
cout<<"Please enter your name: "<<endl;
cin>>name;


int age;
cout<<"Please enter your age: "<<endl;
cin>>age;


float weight;
cout<<"Please enter your weight: "<<endl;
cin>>weight;


string gender;
cout<<"What is your gender, male or female?"<<endl;
cin>>gender;


//why these datatypes were used
cout<<"string was used for both gender and name since they are words not numbers"<<endl;
cout<<"int was used for age since age is a whole number"<<endl;
cout<"float was used for the weight since weight is a decimal"<endl;


    return 0;
}
