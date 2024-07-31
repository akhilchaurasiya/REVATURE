import java.util.*;
public class Program2 {
    int sum(int a , int b)
    {

        return a+b;
    }
    int product(int a,int b)
    {
        return a*b;
    }
    int difference(int a,int b)
    {
        return a-b;
    }
    int division(int a,int b)
    {
        return a/b;
    }

    public static void main(String[] args)
    {

        
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        
        Program2 obj = new Program2();
        int c = obj.sum(a,b);
        System.out.println(c);
         System.out.println(obj.product(a,b));

        System.out.println(obj.difference(a,b));
        System.out.println(obj.division(a,b));
       
    }
}
