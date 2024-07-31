import java.util.*;
public class Problem1{
    public static void main(String[] args)
    {

        // Print area and perimenter of rectangle
        // Scanner sc = new Scanner(System.in);


        System.out.println("Enter the length of rectangle :");
        float length = Float.parseFloat(args[0]);
        // float length = sc.nextInt();


        System.out.println("Enter the breadth of rectangle :" );
        float breadth = Float.parseFloat(args[1]);
        // float breadth = sc.nextInt();

        System.out.println("The area of rectangle is : ");
        float area = length*breadth;
        System.out.println(area);

        System.out.println("The perimeter of rectangle is : ");
        float perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }
}