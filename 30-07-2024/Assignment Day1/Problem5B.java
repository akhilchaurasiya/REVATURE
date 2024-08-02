import java.util.*;
public class Problem5B{
    public static void main(String[] args)
    {
        // swap number without using third variable
        int a = 6;
        int b = 8;
        a = a + b;
        b = b-a;
        System.out.println(a);
        a = a-b;
        System.out.println(b);



    }
}