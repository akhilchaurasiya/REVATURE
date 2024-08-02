import java.util.Scanner;

public class Problem9 {

    void solve(int num)
    {
        if(num>99)
        {
            int first = num/100;  
            int rem =num%10;
            int temp = num/10;
            int mid = temp%10;
            
            int sum = first + mid + rem;
            System.out.println("The sum of three digit number is :" + sum);
        }
        else{
            System.out.println("Please enter 3 digit number");
        }
    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter three digit number :");
            int num = sc.nextInt();

            Problem9 obj = new Problem9();
            obj.solve(num);

        }
    }
}
