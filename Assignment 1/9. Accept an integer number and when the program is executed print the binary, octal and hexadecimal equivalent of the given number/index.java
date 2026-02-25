import java.util.Scanner;

public class index
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        int num = sc.nextInt();

        String binary = Integer.toBinaryString(num);
        String octal = Integer.toOctalString(num);
        String hexa = Integer.toHexString(num);

        System.out.println("Binary equivalent :" + binary);
        System.out.println("Octal equivalent :" + octal);
        System.out.println("Hexadecimal equivalent :" + hexa);
    }
}
