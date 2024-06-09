import java.util.Scanner;

public class Max
{
public static void main (String[] args)
{ 
    Scanner input = new Scanner(System.in);
    System.out.println("FINDING THE MAXIMUM AND MINIMUM OF THREE NUMBERS. ");
    System.out.print("Enter first number: ");
    double x = input.nextDouble();
    System.out.print("Enter second number: ");
    double y = input.nextDouble();
    System.out.print("Enter third number: ");
    double z = input.nextDouble(); 

// invoking maxxxxxx
    double max = maxxx.max(x, y, z);
    double min = minnn.min(x, y, z);

// printing the maximum number of the 3
System.out.println(" ");
System.out.println("The maximum of the three numbers is " + max);
System.out.println(" ");
// printing the minimum of the 3 numbers
System.out.println("The minimum of the three numbers is " + min);

}
}