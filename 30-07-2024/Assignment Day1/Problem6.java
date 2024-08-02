import java.util.Scanner;

public class Problem6{

    void temperature(float value)
    {
        float fahrenheit = (5* (value-32))/9;
        fahrenheit = (int)(100 * fahrenheit);
        fahrenheit = fahrenheit/100;

        System.out.println(fahrenheit);
    }
    public static void main(String...args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the fahrenheit value :");
        float value = sc.nextFloat();

        Problem6 obj = new Problem6();
        obj.temperature(value);
    }
}
