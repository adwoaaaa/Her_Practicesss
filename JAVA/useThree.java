package JAVA;

public class useThree
{
public static void main(String[] args)
 {
if (args.length < 3)
{
System.out.println("Enter three names as command-line arguments. ");
return;
}
String name1 = args[0];
String name2 = args[1];
String name3 = args[2];
System.out.println("Hi " + name3 + ", " + name2 + ", and " + name1 + ".");
 }
} 