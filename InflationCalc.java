import java.util.Scanner;
import java.util.ArrayList;
public class InflationCalc
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        
        ArrayList<Double> data = new ArrayList<Double>();
        data.add(9.9);
        data.add(10.0);
        data.add(10.1);
        data.add(10.9);
        data.add(12.8);
        data.add(15.0);
        data.add(17.3);
        data.add(20.0);
        data.add(17.9);
        data.add(16.8);
        data.add(17.1);
        data.add(17.1);
        data.add(17.5);
        data.add(17.7);
        data.add(17.4);
        data.add(17.2);
        data.add(17.2);
        data.add(16.7);
        data.add(15.2);
        data.add(13.6);
        data.add(12.9);
        data.add(13.4);
        data.add(13.7);
        data.add(13.9);
        data.add(14.4);
        data.add(14.1);
        data.add(13.9);
        data.add(14.0);
        data.add(14.7);
        data.add(16.3);
        data.add(17.3);
        data.add(17.6);
        data.add(18.0);
        data.add(19.5);
        data.add(22.3);
        data.add(24.0);
        data.add(23.8);
        data.add(24.1);
        data.add(26.0);
        data.add(26.6);
        data.add(26.8);
        data.add(26.9);
        data.add(26.8);
        data.add(27.2);
        data.add(28.1);
        data.add(28.9);
        data.add(29.2);
        data.add(29.6);
        data.add(29.9);
        data.add(30.3);
        data.add(30.6);
        data.add(31.0);
        data.add(31.5);
        data.add(32.5);
        data.add(33.4);
        data.add(34.8);
        data.add(36.7);
        data.add(38.8);
        data.add(40.5);
        data.add(41.8);
        data.add(44.4);
        data.add(49.3);
        data.add(53.8);
        data.add(56.9);
        data.add(60.6);
        data.add(65.2);
        data.add(72.6);
        data.add(82.4);
        data.add(90.9);
        data.add(96.5);
        data.add(99.6);
        data.add(103.9);
        data.add(107.6);
        data.add(109.6);
        data.add(113.6);
        data.add(118.3);
        data.add(124.0);
        data.add(130.7);
        data.add(136.2);
        data.add(140.3);
        data.add(144.5);
        data.add(148.2);
        data.add(152.4);
        data.add(156.9);
        data.add(160.5);
        data.add(163.0);
        data.add(166.6);
        data.add(172.2);
        data.add(177.1);
        data.add(179.9);
        data.add(184.0);
        data.add(188.9);
        data.add(195.3);
        data.add(201.6);
        data.add(207.3);
        data.add(215.3);
        data.add(214.5);
        data.add(218.1);
        data.add(224.9);
        data.add(229.6);
        data.add(233.0);
        data.add(236.7);
        data.add(237.0);
        data.add(240.0);
        data.add(245.1);
        data.add(250.5);
        data.add(253.4);
        
        System.out.println("Enter the amount of money:");
        double amount = kb.nextDouble();
        if(amount < 0)
            {
                System.out.println("Error: invalid amount.");
                System.exit(0);
            }
        System.out.println("Enter the initial year (1913-2019):");
        int intYear = kb.nextInt();
        if(intYear < 1913 || intYear > 2019)
            {
                System.out.println("Error: invalid year.");
                System.exit(0);
            }
        System.out.println("Enter the final year (1913-2019):");
        int finalYear = kb.nextInt();
        if(finalYear < 1913 || finalYear > 2019)
            {
                System.out.println("Error: invalid year.");
                System.exit(0);
            }
        
        int intCPI = intYear - 1913;
        int finalCPI = finalYear - 1913;
        double convMoney = (amount * data.get(finalCPI)) / data.get(intCPI);
        convMoney = (double)Math.round(convMoney * 100d) / 100d;
        amount = (double)Math.round(amount * 100d) / 100d;
        
        System.out.println("$" + amount + " in " + intYear + " is equivalent to $" + convMoney + " in " + finalYear);        
    }
}