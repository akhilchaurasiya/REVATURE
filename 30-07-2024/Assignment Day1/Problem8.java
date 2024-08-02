public class Problem8 {

    int solve(int value)
    {
        int first = value/10000;
        int second = value%10;

        int sum = first + second;

        return sum;
    }

    public static void main(String...args)
    {
        int num = 12345;

        Problem8 obj = new Problem8();
        int ans = obj.solve(num);

        System.out.println(ans);


    }
}
