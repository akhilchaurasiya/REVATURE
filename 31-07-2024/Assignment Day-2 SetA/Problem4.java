import java.util.*;
public class Problem4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int avg = 0;
        for (int i = 1; i <=10; i++)
        {
            System.out.println("Please Enter the " + i+ " number");
            int num = sc.nextInt();
            avg = avg + num;
        }

        int temp = avg/10;
        System.out.println("The average of 10 number is : "+ temp);
    }
}
