import java.util.*;
public class Problem8 {

    public int ArmStrong(int a,int b,int c)
    {
        int a1 = a*a*a;
        int b1 = b*b*b;
        int c1 = c*c*c;

        int sum = a1+b1+c1;
        return sum;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Problem8 obj = new Problem8(); 

        for(int i=100;i<500;i++)
        {
            int num = i;
            int first = i/100;
            int third = i%10;
            num = i/10;
            int second = num%10;

            int ans = obj.ArmStrong(first, second, third);

            if(ans==i)
            {
                System.out.println(ans);
            }

        }        
    }
}
