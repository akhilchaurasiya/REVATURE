import java.util.*;
public class Problem7 {
    void HighestCommonFactor(int a,int b)
    {
        while(b!=0)
        {
            int temp = b;
            b = a%b;
            a = temp;
        }

        System.out.println("Highest Common factor is :" + a);
    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number :");
            int a = sc.nextInt();
            System.out.println("Enter the second number :");
            int b = sc.nextInt();

            Problem7 obj = new Problem7();
            
            if(a>b)
            {
                obj.HighestCommonFactor(a, b);
            }
            else{
                obj.HighestCommonFactor(b, a);
            }
        }
    }
}
