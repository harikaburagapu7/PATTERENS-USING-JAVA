public class FIRST {
    public static void main(String args[])
    {
        String s1 = "geeks";
        String s2 = s1;
        s1 = s1+"forgeeks";
        if(s1==s2)
        {
            System.out.println("Same");
        }
        else{
            System.out.println("not same");
        }
    }
}
