import java.util.Scanner;
public class Problem3 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        int positive = 0;
        int negative =0;
        int zeros =0;
        int even = 0;
        int odd =0;
        System.out.println("Please enter 20 integer number :");
        for(int i =0;i<20;i++)
        {
            int input =  sc.nextInt();
            if(input>0)
            {
                positive++;
            }
            else if(input<0)
            {
                negative++;
            }
            else{
                zeros++;
            }

            if(input%2==0)
            {
                even++;
            }
            else{
                odd++;
            }  
        }

        System.out.println("Total Positive number are :" + positive);
        System.out.println("Total Negative number are :" + negative);
        System.out.println("Total zeros number are :" + zeros);
        System.out.println("Total Even number are :" + even);
        System.out.println("Total Odd number are :" + odd);
    }
}
