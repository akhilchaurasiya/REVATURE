import java.util.*;
public class Problem2 {
    public static void main(String []args)
    {
        boolean flag = false;
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter the 10 integers");
        for (int i = 0; i < 10; i++)
        {
            int input = sc.nextInt();
            arr[i] = input;
        }

        System.out.println("Enter the number that you need to search :");
        int num = sc.nextInt();

        for(int i = 0;i<arr.length;i++)
        {
            if(num == arr[i])
            {
                flag = true;
                break;
            }
            
        }

        if(flag)
        {
            System.out.println("number is present in an array");
        }
        else{
            System.out.println("number is not present");
        }


    }
}
