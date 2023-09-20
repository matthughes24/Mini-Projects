import java.util.Scanner;
import java.util.ArrayList;
class Test2
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the wall in inches:");
        double wallLength = kb.nextDouble();
        System.out.println("Enter the number of paintings: ");
        int numOfPaint = kb.nextInt();
        
        double[] array = new double[numOfPaint];
        for(int i = 0; i < numOfPaint; i++)
            {
                System.out.println("Enter the width (in inches) of painting #" + (i+1) + ":");
                array[i] = kb.nextDouble();               
            }
        
        double sum = 0;
        for(int j = 0; j < array.length; j++)
            {
                sum = sum + array[j];
            }
        
        double total = (wallLength - sum) / (numOfPaint + 1);
        
        System.out.println("Each painting should be " + total + " inches apart.");           
    }
}
