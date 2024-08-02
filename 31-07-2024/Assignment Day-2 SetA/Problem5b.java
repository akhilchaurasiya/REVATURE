public class Problem5b {
    public static void main(String[] args) {
        int n=4;
        for(int i = 0;i<n;i++)
        {

            for(int j =0;j<i;j++)
            {
                System.out.print(" ");
            }

            for(int k=0;k<n-i;k++)
            {
                System.out.print("1");
                if(k<n-i-1)
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
