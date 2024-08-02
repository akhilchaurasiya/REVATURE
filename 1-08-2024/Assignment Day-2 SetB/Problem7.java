public class Problem7 {
    public static void main(String[] args) {

        int[] arr = {2,5,9,3,6,4,1};
        int min = 0;
        int max = 0;

        for(int i = 0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
            else{
                min = arr[i];
            }
        }
        System.out.println("The max number is " + max);
        System.out.println("The min number is " + min);
    }
}
