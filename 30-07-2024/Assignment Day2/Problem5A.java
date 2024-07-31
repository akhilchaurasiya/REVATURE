public class Problem5A {
    public static void main(String[] args) {
        // Swap two number using third vairable
        int a = 6;
        int b = 8;
        System.out.println("Value before swapping is :" + a +" and "+ b);
        int temp = 0;
        temp = a;
        a = b;
        b = temp;

        System.out.println("Value after swapping of a and b :" + a + " and " +b);
        
    }
}
