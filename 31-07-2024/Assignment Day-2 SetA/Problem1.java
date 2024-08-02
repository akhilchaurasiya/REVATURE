import java.util.*;
public class Problem1{

    void checkSquare(int a,int b)
    {
        if(a==b)
        {
            System.out.println("It is a Square");
        }
        else{
            System.out.println("It is not a square");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length :");
        int length = sc.nextInt();
        System.out.println("Enter the breadth");
        int breadth = sc.nextInt();

        Problem1 obj = new Problem1();
        obj.checkSquare(length, breadth);


    }
}