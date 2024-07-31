import java.util.*;
public class Program1{

    public static void main(String... args)
    {
        System.out.println("Enter two number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    
        System.out.println("Enter the operation you want to perform 1 for addition , 2 for subtraction, 3 for multiplication , 4 for division");
        
        int operator = sc.nextInt();
        
        switch(operator)
        {
          case 1:
             int sum = a+b;
             System.out.println(sum);
             break;
          case 2 :
             int diff = a-b;
             System.out.println(diff);
             break;
          case 3 :
             int product = a*b;
             System.out.println(product);
             break;
          case 4 :
              int division = a/b;command:
              System.out.println(division);
              break;

            default:
            System.out.println("Invalid input please enter 1 to 4");
        }

    }

}
          