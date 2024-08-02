public class Problem9 {
    public static void main(String[] args)
    {
        int[] arr = {2,3,1,45,15};

        
        for(int i =0;i<arr.length-1;i++)
        {
            int minIndex = i;
            
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        System.out.println("Print sorted array :");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.println(arr[i] + " ");
        }
    }
}
