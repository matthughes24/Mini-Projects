import java.util.Scanner;
public class Height
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the age of the child:");
        int age = kb.nextInt();
        if(age < 0 || age > 4)
            {
                System.out.println("This calculator is most accurate for children ages 0 to 4. Please enter an age between 0 and 4.");
                System.exit(0);
            }
        System.out.println("Enter your father's height in feet only. For example, if your father is 5ft 8in tall, enter 5.");
        int dadHeightFt = kb.nextInt();
        if(dadHeightFt <= 0 || dadHeightFt >= 9)
            {
                System.out.println("Error: invalid height.");
                System.exit(0);
            }
        System.out.println("Enter your father's height of the remaining inches. For example, if your father is 5ft 8in tall, enter 8.");       
        int dadHeightIn = kb.nextInt();
        if(dadHeightIn < 0 || dadHeightIn > 12)
            {
                System.out.println("Error: invalid height.");
                System.exit(0);
            }
        double dadHeight = (dadHeightFt * 12) + dadHeightIn;
        
        System.out.println("Enter your mother's height in feet only. For example, if your mother is 5ft 8in tall, enter 5.");
        int momHeightFt = kb.nextInt();
        if(momHeightFt <= 0 || momHeightFt >= 9)
            {
                System.out.println("Error: invalid height.");
                System.exit(0);
            }
        System.out.println("Enter your mother's height of the remaining inches. For example, if your mother is 5ft 8in tall, enter 8.");       
        int momHeightIn = kb.nextInt();
        if(momHeightIn < 0 || momHeightIn > 12)
            {
                System.out.println("Error: invalid height.");
                System.exit(0);
            }
        double momHeight = (momHeightFt * 12) + momHeightIn;
        
        System.out.println("Enter the gender of the child (boy/male or girl/female):");
        kb.nextLine();
        String gender = kb.nextLine();
        kb.close();
        
        if(gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("boy"))
            {
                maleCalc(dadHeight, momHeight, age, dadHeightFt, dadHeightIn, momHeightFt, momHeightIn);
            }

        else if(gender.equalsIgnoreCase("female") || gender.equalsIgnoreCase("girl"))
            {
                femaleCalc(dadHeight, momHeight, age, dadHeightFt, dadHeightIn, momHeightFt, momHeightIn);
            }
        
        else
            {
                 System.out.println("Error: invalid gender.");
                 System.exit(0);          
            }               
    }
    
    public static void maleCalc(double dadHeightMale, double momHeightMale, int ageMale, int dadHeightFtMale, int dadHeightInMale, int momHeightFtMale, int momHeightInMale)
    {
        double maleHeightPre = (momHeightMale * 13) / 12;
        double maleHeightPost = maleHeightPre + dadHeightMale;
        double maleHeightFinal = maleHeightPost / 2;
        maleHeightFinal = (double)Math.round(maleHeightFinal * 100d) / 100d;
        double feet = maleHeightFinal / 12;
        int ft = (int) feet;
        double leftover = maleHeightFinal % 12;
        leftover = Math.round(leftover * 100.0) / 100.0;
        System.out.println();
        System.out.println("Predicted height of a " + ageMale + " year old boy: " + ft + "ft " + leftover + "in");
        System.out.println("The margin of error is +/- 4 inches.");       
    }
    
    public static void femaleCalc(double dadHeightFemale, double momHeightFemale, int ageFemale, int dadHeightFtFemale, int dadHeightInFemale, int momHeightFtFemale, int momHeightInFemale)
    {
        double femaleHeightPre = (dadHeightFemale * 12) / 13;
        double femaleHeightPost = femaleHeightPre + momHeightFemale;
        double femaleHeightFinal = femaleHeightPost / 2;
        femaleHeightFinal = (double)Math.round(femaleHeightFinal * 100d) / 100d;
        double feet = femaleHeightFinal / 12;
        int ft = (int) feet;
        double leftover = femaleHeightFinal % 12;
        leftover = Math.round(leftover * 100.0) / 100.0;
        System.out.println();
        System.out.println("Predicted height of a " + ageFemale + " year old girl: " + ft + "ft " + leftover + "in");
        System.out.println("The margin of error is +/- 4 inches.");                   
    }
}