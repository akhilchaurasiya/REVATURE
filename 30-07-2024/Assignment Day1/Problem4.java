import java.util.*;
public class Problem4 {

    // Print totalmarks and percentage of studnet in 3 subjects
    int totalMarks(int a,int b,int c)
    {
        int total = a+b+c;
        return total;
    }

    
    int percentage(int a,int b,int c)
    {
        int total = a+b+c;
        int res = total/3;
        return res;
    }

    
    public static void main(String[] args)
    {
        System.out.println("Please Enter the marks of Robert in 3 Subjects");

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        Problem4 obj = new Problem4();
        int res = obj.totalMarks(a,b,c);
        System.out.println("Total marks of 3 subject is:");
        System.out.println(res);

        int ans = obj.percentage(a,b,c);
        System.out.println("Perentage of 3 subject");
        System.out.println(ans);
    }
}
