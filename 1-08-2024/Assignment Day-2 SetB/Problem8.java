import java.util.*;
public class Problem8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int maxDifference = arr[n-1] - arr[0];
        int[]maxarr = {arr[n-1],arr[0]};
        int minDifference = arr[1] - arr[0];
        int[] minarr = {arr[1],arr[0]};

        System.out.println("The pair is :" + maxarr[0] + " " + maxarr[1] + " " + "with maximum difference " + maxDifference);
        System.out.println("The pair is :" + minarr[0] + " " + minarr[1] + " " + "with minimum difference " + minDifference);
        
        
    }
}
