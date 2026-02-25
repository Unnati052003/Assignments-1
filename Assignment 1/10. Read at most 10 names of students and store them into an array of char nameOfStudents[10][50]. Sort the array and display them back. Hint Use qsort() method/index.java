import java.util.*;

public class index
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nameOfStudents[] = new String[10];
        int n;

        System.out.print("Enter number of students (max 10): ");
        n = sc.nextInt();
        sc.nextLine();  

        if(n > 10) {
            System.out.println("You can enter maximum 10 students only.");
            return;
        }

        
        for(int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i+1) + ": ");
            nameOfStudents[i] = sc.nextLine();
        }

    
        Arrays.sort(nameOfStudents, 0, n);

        
        System.out.println("\nSorted Names:");
        for(int i = 0; i < n; i++) {
            System.out.println(nameOfStudents[i]);
        }

        sc.close();
    }
}