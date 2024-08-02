import java.util.*;
public class Problem2 {

    // Print perimeter of traingle

    void perimeter(int side)
    {

        int perimeter  = 3*side;
        System.out.println("The perimeter of triangle is : " + perimeter);
        System.out.println(perimeter);
    }
    
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of triangle :");
        int side = Integer.parseInt(args[0]);
        // int side = sc.nextInt();
        Problem2 obj = new Problem2();

        obj.perimeter(side);
        
    }
}
