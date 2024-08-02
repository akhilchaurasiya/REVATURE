import java.util.*;
public class Problem4 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[3];
        for (int i = 0; i < 3; i++)
        {
            int input = sc.nextInt();
            arr[i] = input;
        }

       
        int[] arr1 = new int[3];
        int size = arr1.length;
        int k = 1;
        System.out.println("Printing array in reverse order");
        for(int i = 0;i<size;i++)
        {
            arr1[i] = arr[size-i-1];
            System.out.println(arr1[i]);
        }
    }
}
