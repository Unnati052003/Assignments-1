import java.util.Scanner;

class Student 
{
    String studentName;
    String rollNo;     
    float totalMarks;

    void readData()
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        rollNo = sc.nextLine();

        System.out.print("Enter Total Marks: ");
        totalMarks = sc.nextFloat();
    }

    void displayData() 
    {
        System.out.println("\n--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }
}

public class index {
    public static void main(String[] args) {

        Student s1 = new Student();  

        s1.readData();      
        s1.displayData();   
    }
}
