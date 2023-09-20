import java.util.Scanner;
public class Test2
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the drink you consumed (beer, wine, whiskey, gin, rum, vodka, tequila):");
        String drinkType = kb.nextLine();
        if(drinkType.equalsIgnoreCase("beer") || drinkType.equalsIgnoreCase("wine") || drinkType.equalsIgnoreCase("whiskey") || drinkType.equalsIgnoreCase("gin") || drinkType.equalsIgnoreCase("rum") || drinkType.equalsIgnoreCase("vodka") || drinkType.equalsIgnoreCase("tequila"))
            {
            
                System.out.println("Enter the number of drinks you consumed:");
                double drinkNum = kb.nextDouble();
        
                double liqOunc = drinkNum * 0.6;
                System.out.println("Enter your weight in pounds:");
                double weight = kb.nextDouble();
                System.out.println("Enter the number of hours elapsed since drinking began:");
                double hours = kb.nextDouble();
                System.out.println("Enter your gender:");
                kb.nextLine();  
                String gender = kb.nextLine();
                kb.close();
               
                if(gender.equalsIgnoreCase("male"))
                    {
                        maleCalc(drinkType, drinkNum, liqOunc, weight, hours);
                    }
        
                else if(gender.equalsIgnoreCase("female"))
                    {
                        femaleCalc(drinkType, drinkNum, liqOunc, weight, hours);
                    }
                
                else
                    {
                         System.out.println("Error: invalid gender.");
                         System.exit(0);          
                    }       
            }
        
        else
            {
                System.out.println("Error: invalid drink type.");
                System.exit(0);
            }        
    }
    
    public static void maleCalc(String drinkTy, double drinkNumber, double liqOnc, double weight1, double hours1)
    {
       double bac = ((liqOnc * 5.14) / (weight1 * 0.73)) - 0.015 * hours1;
       bac = (double)Math.round(bac * 10000d) / 10000d;
       System.out.println("If you are a " + weight1 + " pound male and drank " + drinkNumber + " glasses of " + drinkTy + " for " + hours1 + " hours, your BAC level would be: " + bac + "%");
       if(bac > 0.01 && bac < .03)
           System.out.println("No effects, slight mood elevation.");
       else if(.04 <= bac && bac <= .06)
           System.out.println("Feeling of relaxation, minor impairment of reasoning and memory.");
       else if(bac <= 0.07 && bac <= .09)
           System.out.println("Mild impairment of balance, speech, vision and control.");
       else if(.1 <= bac && bac <= .12)
           System.out.println("Significant impairment of motor coordination and loss of judgement.");
       else if(.13 <= bac && bac <= .15)
           System.out.println("Blurred vision and major loss of balance.");
       else if(.16 <= bac && bac <= .20)
           System.out.println("Dysphoria and nausea may appear.");
       else if(.21 <= bac && bac <= .30)
           System.out.println("Needs assistance walking, mental confusion.");
       else if(.31 <= bac && bac <= .40)
           System.out.println("On the brink of a coma.");
       else if(bac > .4)
           System.out.println("In a coma. Likely to die.");
    }
    
    public static void femaleCalc(String drinkTy1, double drinkNumber1, double liqOnc1, double weight2, double hours2)
    {
        double bac1 = ((liqOnc1 * 5.14) / (weight2 * 0.66)) - 0.015 * hours2;
        bac1 = (double)Math.round(bac1 * 10000d) / 10000d;
        System.out.println("If you are a " + weight2 + " pound female and drank " + drinkNumber1 + " glasses of " + drinkTy1 + " for " + hours2 + " hours, your BAC level would be: " + bac1 + "%");
        if(bac1 > 0.01 && bac1 < .03)
            System.out.println("No effects, slight mood elevation.");
        else if(.04 <= bac1 && bac1 <= .06)
            System.out.println("Feeling of relaxation, minor impairment of reasoning and memory.");
        else if(bac1 <= 0.07 && bac1 <= .09)
            System.out.println("Mild impairment of balance, speech, vision and control.");
        else if(.1 <= bac1 && bac1 <= .12)
            System.out.println("Significant impairment of motor coordination and loss of judgement.");
        else if(.13 <= bac1 && bac1 <= .15)
            System.out.println("Blurred vision and major loss of balance.");
        else if(.16 <= bac1 && bac1 <= .20)
            System.out.println("Dysphoria and nausea may appear.");
        else if(.21 <= bac1 && bac1 <= .30)
            System.out.println("Needs assistance walking, mental confusion.");
        else if(.31 <= bac1 && bac1 <= .40)
            System.out.println("On the brink of a coma.");
        else if(bac1 > .4)
            System.out.println("In a coma. Likely to die.");
    }

}
