import java.util.*;
public class Problem2 {
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks out of 100 :");
        int marks = sc.nextInt();

        if(marks>80)
        {
            System.out.println("Grade of student is A");
        }
        else if(marks>60 && marks<80)
        {
            System.out.println("Grade of student is B");
        }
        else if(marks>50 && marks<60)
        {
            System.out.println("Grade of student is C");
        }
        else if(marks>45 && marks<50)
        {

            System.out.println("Grade of student is D");
        }
        else if(marks>25 && marks<45)
        {
            System.out.println("Grade of student is E");
        }
        else
        {
            System.out.println("Grade of student is F");
        }
    }
}
