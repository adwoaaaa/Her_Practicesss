package JAVA;
import java.util.*;
public class foodSCHEDULE{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] breakfast = {"FRUITS", "CHOCOLATE DRINK WITH BREAD", "COFFEE WITH PANCAKES", "CERELAC", "CORNFLAKES", "PORRIDGE"};
        String[] lunch = {"FRENCH FRIES", "JOLLOF RICE", "FRIED RICE", "WAAKYE", "KIVO GARI MIX", "COKE WITH SIMPLY GOOD BISCUITS"};
        String[] supper = {"FUFU AND PALMNUT SOUP", "BANKU WITH TILAPIA", "KENKEY AND FRIED FISH", "RICE AND STEW", "INDOMIE"};

        System.out.println("Hey Adwoa, it is time for food. Would you like to take Breakfast, Lunch or Supper? ");
        String food = input.next().toLowerCase();
        Random random = new Random();

        if(food.equals ("breakfast")){
            int randomIndex = random.nextInt(breakfast.length);
            String randomString = breakfast[randomIndex];
            System.out.println("This morning; for breakfast, you would take " + randomString + ".");
        } else if (food.equals ("lunch"))  {
            int randomIndex = random.nextInt(lunch.length);
            String randomString = lunch[randomIndex];
            System.out.println("This afternoon; for lunch, you would take " + randomString + ".");
        }else{
            int randomIndex = random.nextInt(supper.length);
            String randomString = supper[randomIndex];
            System.out.println("This evening; for supper, you would take " + randomString + ".");
        }
    }
}    

