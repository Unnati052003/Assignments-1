import java.util.*;

public class index
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is an Uppercase letter.");
        }
        else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a Lowercase letter.");
        }
        else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Digit.");
        }
        else {
            System.out.println("It is a Special character.");
        }
    }
}
