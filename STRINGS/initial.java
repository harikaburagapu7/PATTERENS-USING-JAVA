public class initial {
    public static void recursion(int start,int end)
    {
        if(start <= end)
        {
            System.out.print(start + " ");
            recursion(start + 1 ,end);
        }
    }
    public static void main(String args[])
    {
        recursion(1,10);
    }
    
}

