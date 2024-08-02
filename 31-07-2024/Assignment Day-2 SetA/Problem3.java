import java.util.Scanner;

public class Problem3 {

    int solve(int a,int b)
    {
        int temp = (b*100)/a;
        System.out.println("The percentage of attending class is :" + temp);
        if(temp<75)
        {
            return 0;
        }
        else{
            return 1;
        }

        
    }
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of classes held :");
            int classHeld = sc.nextInt();
            System.out.println("Enter the number of classes attend :");
            int classAttend = sc.nextInt();
            

           Problem3 obj = new Problem3();
           int ans = obj.solve(classHeld,classAttend);
           if(ans ==0)
           {
            System.out.println("Enter 1 if you have a medical isssue otherwise enter 0 : ");
            System.out.println("please Enter :");
            byte medicalIssue = sc.nextByte();

            if(medicalIssue == 1)
            {
                System.out.println("You are allowed to sit in exam");
            }
            else{
                System.out.println("You are not allowed to sit in exam");
            }

           }

           else{
            System.out.println("Yes, you are allowd to sit in an exam");
           }
        }
    }
}
