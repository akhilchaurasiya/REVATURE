public class SelectionSort {
    static void selectionSort(int[]arr)
    {
        for(int i =0;i<arr.length;i++)
        {
            int min = arr[i];
            for(int j=i+1;j<arr.length;j++)
            {
                if(min>arr[j])
                {
                    min = arr[j];
                }
            }
            int temp = arr[i];
            arr[i] = min;

        }
    }
    public static void main(String[] args) {
        {
            int[]arr = {2,12,26,9,5,19,21,1};

            selectionSort(arr);

            for(int i =0;i<arr.length;i++)
            {
                System.out.print(arr[i]+"");
            }
        }
    }
}
