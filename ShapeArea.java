import java.util.Scanner;
class ShapeArea
{
    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter a shape type to find its area / surface area:");
        String shapeType = kb.nextLine();
        
        if(shapeType.equals("square"))            
                calcSquare();
        
        else if(shapeType.equals("trapezoid"))            
                calcTrapezoid();
        
        else if(shapeType.equals("sphere"))
            calcSphere();
        
        else if(shapeType.equals("triangle"))
            calcTriangle();
        
        else if(shapeType.equals("circle"))
            calcCircle();
        else
            System.out.println("Please enter another shape type.");
                          
    }
    
    public static void calcSquare()
    {
        System.out.println("You entered the shape type square.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the side:");
        double side = kb.nextDouble();
        double area = side * side;
        System.out.println("Area of square = " + area);       
    }
    
    public static void calcTrapezoid()
    {
        System.out.println("You entered the shape type trapezoid.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the first base:");
        double b1 = kb.nextDouble();
        System.out.println("Enter the length of the second base:");
        double b2 = kb.nextDouble();
        System.out.println("Enter the length of the height:");
        double h = kb.nextDouble();
        double area = ((b1 + b2) / 2) * (h);
        System.out.println("Area of trapezoid = " + area);              
    }
    
    public static void calcSphere()
    {        
        System.out.println("You entered the shape type sphere.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the radius:");
        double radius = kb.nextDouble();
        double surfArea = 4 * Math.PI * (radius * radius);
        System.out.println("Surface area of sphere = " + surfArea);       
    }
    
    public static void calcTriangle()
    {
        System.out.println("You entered the shape type triangle.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the base:");
        double base = kb.nextDouble();
        System.out.println("Enter the length of the height:");
        double height = kb.nextDouble();
        double area = (base * height) / 2;
        System.out.println("Area of triangle = " + area);       
    }
    
    public static void calcCircle()
    {
        System.out.println("You entered the shape type circle.");
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the length of the radius:");
        double radius = kb.nextDouble();
        double area = Math.PI * (radius * radius);
        System.out.println("Area of circle = " + area);        
    }    
}