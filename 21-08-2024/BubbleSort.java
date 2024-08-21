public class BubbleSort {
    static void Bubblesort(int[]arr)
    {
        int temp = 0;
        int flag = 0;
        for(int i = 0;i<arr.length-1;i++)
        {
            for(int j  = 0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }

            }
           
            if(flag==0)
            {
                break;
            }
        }
    }
    public static void main(String[] args) {
        {
            int[] arr = {4,15,7,18,54,3,2};

            Bubblesort(arr);

            for(int i=0;i<arr.length;i++)
            {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
