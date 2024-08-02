import java.util.Scanner;

public class Problem6 {
    public static int sum;
    public static int product;
    public static void AverageAndProduct(int count,int input)
    {
        sum = sum + input;
        count++;
        product = product*input;
        int average = sum/count;

    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            // Problem6 obj = new Problem6();
            
            sum = 0;
            product = 1;
            int count = 1;
            // System.out.println("If you want to quit the operation type q otherwise Enter the number :");
            
            try{
                while (true) { 
                    int input = sc.nextInt();
                    System.out.println("Press q to exit ");
                    AverageAndProduct(count, input);
                }
            }
            catch(Exception e)
            {
                System.out.println(e.getMessage());
                System.out.println("The average of number is :" + sum);
                System.out.println("The product of number is :" + product);
            }
            

           
        }
    }
}
