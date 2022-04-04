public class Summing
{
    public static void main(String[] args)
    {
        System.out.println(sum(6));  // should print 21
        System.out.println(sum(10)); // should print 55
    }

    public static int sum(int n)
    {
        if(n ==1)
        {
            return 1;
        }
        else
        {
            return (n + sum(n-1));
        }
        // Write a RECURSIVE implementation of this method!
    }
}

