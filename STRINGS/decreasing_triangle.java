public class decreasing_triangle {
    public static void main(String args[])
    {
        int n=5;

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                if(i==1 || j==i || j <= n)
                System.out.print("* ");
                else{
                    System.out.print(" ");
                }
            }
        }
        System.out.println(" ");
    }
}
