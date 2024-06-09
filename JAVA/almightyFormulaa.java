import static java.lang.Math.sqrt;

public class almightyFormulaa{
    public static double formula (double a, double b, double c){
        // creating a variable to store b squared - 4ac
        double e = ((b*b)-(4*a*c));
        double formula = (-(b) + sqrt(e))/(2*a);
        return formula; 

  
    }
}