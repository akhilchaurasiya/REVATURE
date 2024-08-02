import java.util.Scanner;

public class Problem10 {

    void solve(int num)
    {
        int reverse = 0;
        while(num>0)
        {
            int rem = num%10;
            reverse = reverse*10 + rem;
            num = num/10;
        }

        System.out.println("After reversing the number is :" + reverse);
    }
    public static void main(String[] args) {
        // Reverse three digit number
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input three digit number");
        int value = sc.nextInt();

        Problem10 obj = new Problem10();

        obj.solve(value);


    }
}
