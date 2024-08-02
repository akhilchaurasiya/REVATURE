import java.util.*;
public class Problem1{
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] myArray = new int[10];
       
         for(int i = 0;i<10;i++)
         {
            int input = sc.nextInt();
            myArray[i] = input;
         
         }
        System.out.println("Displaying the results :");

         for(int i = 0;i<myArray.length;i++)
         {
            System.out.println(myArray[i]);
         }
   }
}