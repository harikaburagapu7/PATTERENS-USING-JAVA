

public class recursion
{
    public static void number(int n)
    {
     
        
        for(int i=n;i> 0;i--)
        {
            System.out.println(i + " ");

        }
    }
    public static void main(String args[])
    {
        int n=10;
        System.out.println(n);
        number(n);
    }
        
}