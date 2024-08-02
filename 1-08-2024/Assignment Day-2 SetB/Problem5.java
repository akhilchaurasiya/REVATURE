public class Problem5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int sum = 0;
        int product = 1;
        for(int i = 0;i<arr.length;i++)
        {
            sum = sum + arr[i];
            product = product * arr[i];
        }

        System.out.println("The sum of array is : " + sum);
        System.out.println("The product of array is : " + product);
    }
}
