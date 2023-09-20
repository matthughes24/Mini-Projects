import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter your weight in pounds:");
        double weight = kb.nextDouble();
        
        if(weight<= 0 || weight >= 1000)
            {
                System.out.println("Error: invalid weight.");
                System.exit(0);
            }
        System.out.println("Enter your height in feet only. For example, if you're 5ft 8in tall, enter 5.");
        double heightFt = kb.nextDouble();
        
        if(heightFt <= 0 || heightFt >= 9)
            {
                System.out.println("Error: invalid height.");
                System.exit(0);
            }
        System.out.println("Enter your height of the remaining inches. For example, if you're 5ft 8in tall, enter 8.");
        double heightIn = kb.nextDouble();
        
        if(heightIn < 0 || heightIn > 12)
            {
                System.out.println("Error: invalid height.");
                System.exit(0);
            }
        double height = (heightFt * 12) + heightIn;
        
        double bmi = (weight * 703) / (height * height);
        bmi = (double)Math.round(bmi * 1000d) / 1000d;
        System.out.println("Your BMI is: " + bmi);
        
        if(bmi > 0.0 && bmi < 18.5)
            System.out.println("You are considered underweight. Please see a doctor immediately.");
        else if(18.5 <= bmi && bmi <= 24.9)
            System.out.println("You are considered normal weight. Nice job!");
        else if(25.0 <= bmi && bmi <= 29.9)
            System.out.println("You are considered overweight. Please see a doctor.");
        else if(bmi >= 30)
            System.out.println("You are considered obese. Please see a doctor immediately.");           
    }
}