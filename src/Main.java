import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("==================================");
    System.out.println("        CAMPUSTRACK     ");
    System.out.println("==================================");
    System.out.println("Student Academic Management System");
    System.out.println("----------------------------------");

    System.out.print("Enter Student ID: ");
    String id = sc.next();
    sc.nextLine();

    System.out.print("Enter Full Name: ");
    String name = sc.nextLine();

    int age=0;
    do { 
        System.out.print("Enter age: ");
        age = sc.nextInt();
        if (age<=15 || age>=30){
        System.out.println("Invalid age. Enter a value between 15 and 35.");
    }
    } while (age<=15 || age >=30);

    System.out.println("Age accepted.");
    sc.nextLine();

    System.out.print("Enter email: ");
    String email = sc.nextLine();

    System.out.println("Select course:");
    System.out.println("1. BCA");
    System.out.println("2. B.Sc Computer Science");
    System.out.println("3. B.E/B.Tech");
    System.out.println("4. MCA");
    System.out.println("5. Others");
    
    int choice=0;
    do { 
        System.out.print("Enter course choice: ");
        choice = sc.nextInt();
        if(choice<=0 || choice>5){
            System.out.println("Invalid course choice. Select a value from 1 to 5");
        }
    } while (choice<=0 || choice>5);

    String courseName="";
    int courseFee=0;

    switch(choice){
        case 1: courseName="BCA"; courseFee= 35000; break;
        case 2: courseName="B.Sc Computer Science"; courseFee= 30000; break;
        case 3: courseName="B.E/B.Tech"; courseFee= 50000; break;
        case 4: courseName="MCA"; courseFee= 45000; break;
        default: courseName="Other"; courseFee=25000; break; 
    }

    System.out.print("Enter semester (1-8):");
    int sem=sc.nextInt();
    sc.nextLine();

    System.out.print("Enter career goal: ");
    String careerGoal = sc.nextLine();

 }
}
