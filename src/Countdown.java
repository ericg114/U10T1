import java.util.Scanner;

public class Countdown
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number to start: ");
        int start = input.nextInt();
        System.out.println(countdown(start));
    }

    public static String countdown(int number)
    {
        if(number == 0)
        {
            return "blastoff";
        }
        return number + " " + countdown(number-1);
        // WRITE THIS RECURSIVE METHOD! note that it returns a string
    }
}
