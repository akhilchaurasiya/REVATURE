import java.util.*;
public class LinearSearch{

    static boolean search(int[]arr,int n)
    {
        for(int i  =0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                return true;
            }
           
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to find in array");
        int num = sc.nextInt();

        int[] arr = {4,5,7,9,4,1,44,2,9};

        boolean ans = search(arr,num);

        if(ans)
        {
            System.out.println("Number is present in an array");
        }
        else{
            System.out.println("Number is not present in an array");
        }




    }
}