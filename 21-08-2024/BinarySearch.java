public class BinarySearch {

    public static boolean binarySort(int[]arr,int key,int start,int end)
    {
        while(start<=end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid]==key)
            {
                return true;
            }

            else if(arr[mid]>key)
            {
                end = mid-1;
            }
            else{
                start = mid+1;
            } 
        }
        return false;
    }
    public static void main(String[] args) {
        {
            int key = 20;
            int [] arr  = {4,6,9,13,23,29,45};

            int start = 0;
            int end = arr.length-1;
            boolean ans = binarySort(arr,key,start,end);

            if(ans)
            {
                System.out.println("Number is present in an array");
            }
            else{
                System.out.println("Number is not present in an array");
            }
        }
    }
}
