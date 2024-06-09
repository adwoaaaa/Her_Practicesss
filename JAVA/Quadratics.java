import java.util.Scanner;

public class Quadratics
{
public static void main (String[] args)
 { 
 Scanner input = new Scanner(System.in);
   System.out.println("A PROGRAM TO IMPLEMENT THE ALMIGHTY FORMULA");
    System.out.print("Enter the value of a : ");
    double a = input.nextDouble();
    System.out.print("Enter the value of b: ");
    double b = input.nextDouble();
    System.out.print("Enter the value of c: ");
    double c = input.nextDouble();

 // invoking the almightyformula
  double root = almightyFormulaa.formula(a, b, c);
  System.out.println("The root of the quadratic is " + root);
    }
}