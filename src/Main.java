import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int anotherChoice;
    do {
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
        if (age<15 || age>=30){
        System.out.println("Invalid age. Enter a value between 15 and 35.");
    }
    } while (age<15 || age >=30);

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

    int javaMarks;
    int sqlMarks;
    int webTechMarks;
    int AptitudeMarks;
    int commMarks;

    do { 
        System.out.print("Enter Java marks: ");
        javaMarks = sc.nextInt();
        if (javaMarks<0 || javaMarks>100){
            System.out.println("Invalid marks. Enter a value between 0 and 100");
        }
    } while (javaMarks<0 || javaMarks>100);

    do { 
        System.out.print("Enter SQL marks: ");
        sqlMarks = sc.nextInt();
        if (sqlMarks<0 || sqlMarks>100){
            System.out.println("Invalid marks. Enter a value between 0 and 100");
        }
    } while (sqlMarks<0 || sqlMarks>100);

    do { 
        System.out.print("Enter Web Technology marks: ");
        webTechMarks = sc.nextInt();
        if (webTechMarks<0 || webTechMarks>100){
            System.out.println("Invalid marks. Enter a value between 0 and 100");
        }
    } while (webTechMarks<0 || webTechMarks>100);

    do { 
        System.out.print("Enter Aptitude marks: ");
        AptitudeMarks = sc.nextInt();
        if (AptitudeMarks<0 || AptitudeMarks>100){
            System.out.println("Invalid marks. Enter a value between 0 and 100");
        }
    } while (AptitudeMarks<0 || AptitudeMarks>100);

    do { 
        System.out.print("Enter Communication marks: ");
        commMarks = sc.nextInt();
        if (commMarks<0 || commMarks>100){
            System.out.println("Invalid marks. Enter a value between 0 and 100");
        }
    } while (commMarks<0 || commMarks>100);
     
    int totalMarks = javaMarks + sqlMarks + webTechMarks + AptitudeMarks + commMarks;
    double percentage = (double) totalMarks/5;

    System.out.println("Total Marks: "+totalMarks);
    System.out.printf("Percentage: %.2f ",percentage);
    System.out.println();

    boolean academicCriteria = javaMarks>=35 && sqlMarks>=35 && webTechMarks>=35 && AptitudeMarks>=35 && commMarks>=35 && percentage>=40;
    String academicResult = "";

    if(academicCriteria){
        academicResult="PASSED";
    } else{
        academicResult="FAILED";
    }

    String grade;
    if (percentage<40){
        grade = "F";
    }
    else if(percentage>=40 && percentage<49.99){
        grade="D";
    }
    else if (percentage>=50 && percentage<64.99){
        grade="C";
    }
    else if(percentage>=65 && percentage<74.99){
        grade="B";
    }
    else if(percentage>=75 && percentage<84.99){
        grade="A";
    }
    else{
        grade="A+";
    }

    System.out.print("Enter total classes conducted: ");
    int classesConducted = sc.nextInt();
    sc.nextLine();

    int classesAttended;
    do {
    System.out.print("Enter classes attended: ");
    classesAttended = sc.nextInt();
    if (classesConducted<classesAttended){
        System.out.println("Invalid attendance. Attended classes cannot exceed "+classesConducted);
    }
    }while(classesConducted<classesAttended);

    double attendancePercentage = ((double) classesAttended/classesConducted)*100;

    String attendanceStatus = attendancePercentage >= 75 ? "REGULAR" : "SHORTAGE";

    System.out.println("Attendance percentage: "+attendancePercentage+" %");
    System.out.println("Attendance status: "+attendanceStatus);

    System.out.print("How many assignment scores do you want to enter? ");
    int numOfAssign = sc.nextInt();
    sc.nextLine();

    int asignScore; int validAssignScore=0; int totalAssignScore=0;

    for(int i=1; i <= numOfAssign; i++){
        System.out.print("Enter score for assignemnt " + i +" (0-10, -1 to finish): ");
        asignScore = sc.nextInt();
        if (asignScore < -1 || asignScore > 10){
            System.out.println("Invalid score. Assignment " + i + " skipped");
            continue;
        }
        else if (asignScore==-1){
            System.out.println("Assignment entry completed early.");
            break;
        }
        else{
            System.out.println("Assignment score accepted.");
            totalAssignScore+=asignScore;
            validAssignScore++;
        }
    }

    double assignAvg = (double) totalAssignScore / validAssignScore;
    String assignStatus = (validAssignScore >= 1 && assignAvg >= 5)? "SATISFACTORY" : "NEEDS IMPROVEMENT";

    int scholarshipDiscount = 0; 
    if (grade != "F" && percentage >= 85 && attendancePercentage >= 85){
        scholarshipDiscount = 10;
    }
    else if (grade != "F" && percentage >= 75 && attendancePercentage >= 75){
        scholarshipDiscount = 5;
    } else{
        scholarshipDiscount = 0;
    }

    double scholarshipAmount = ((double) courseFee * scholarshipDiscount) / 100; 
    double finalFee = courseFee - scholarshipAmount;

    int amountPaid =0;
    do {
        System.out.print("Enter Amounnt Paid (0-"+finalFee+"):");
        amountPaid = sc.nextInt();
        if(amountPaid < 0 || amountPaid > finalFee){
            System.out.println("Invalid amount enter only range (0-"+finalFee+")");
        }
    } while (amountPaid < 0 || amountPaid > finalFee);

    double feeBalance = finalFee - amountPaid;
    String feeStatus = feeBalance == 0? "PAID" : "PENDING";
    
    String semClearance = (grade != "F" && percentage >= 40 && attendancePercentage >= 75 && assignStatus == "SATISFACTORY" && feeBalance == 0)? "CLEARED FOR NEXT SEMESTER" : "ACTION REQUIRED";

    String recommendation = " ";
    String applicableReason=" ";
    if (semClearance == "ACTION REQUIRED"){
        if (javaMarks < 35){
            applicableReason = "Java marks are below 35";
            recommendation = "Revisit the failed subject and complete additional practice";
        }
        else if (sqlMarks < 35){
            applicableReason = "SQL marks are below 35";
            recommendation = "Revisit the failed subject and complete additional practice";
        }
        else if (webTechMarks < 35){
            applicableReason = "Web Technology marks are below 35";
            recommendation = "Revisit the failed subject and complete additional practice";
        }
        else if (AptitudeMarks < 35){
            applicableReason = "Aptitude marks are below 35";
            recommendation = "Revisit the failed subject and complete additional practice";
        }
        else if (commMarks < 35){
            applicableReason = "Communication marks are below 35";
            recommendation = "Revisit the failed subject and complete additional practice";
        }
        else if (percentage < 40){
            applicableReason = "Overall percentage is below 40%";
            recommendation = "Improve overall academic performance";
        }
        else if (attendancePercentage < 75){
            applicableReason = "Attendance is below 75%";
            recommendation = "Attend classes regularly and clear the attendance shortage";
        }
        else if (assignAvg < 5){
            applicableReason = "Assignment average is below 5.0";
            recommendation = "Complete assignments & maintain an average of atleast 5.0";
        }
        else if(validAssignScore <= 0){
            applicableReason = "No Valid assinment score was entered";
            recommendation = "Complete assignments & maintain an average of atleast 5.0";
        }
        else{
            applicableReason = "Semester fee is pending";
            recommendation = "Pay the pending semester fee before clearance";
        }
    } else{
        applicableReason = "NONE";
        recommendation = "Maintain the current performance in the next semester";
    }

    System.out.println("========================================================");
    System.out.println("            STUDENT SEMESTER REPORT");
    System.out.println("========================================================");

    System.out.println("Student ID                 : "+id);
    System.out.println("Student Name               : "+name);
    System.out.println("Age                        : "+age);
    System.out.println("Email                      : "+email);
    System.out.println("Course                     : "+courseName);
    System.out.println("Semester                   : "+sem);
    System.out.println("Career Goal                : "+careerGoal);
    System.out.println();

    System.out.println("---------------- ACADEMIC SUMMARY --------------------");
    System.out.println("Java Marks                 : "+javaMarks);
    System.out.println("SQL Marks                  : "+sqlMarks);
    System.out.println("Web Technology Marks       : "+webTechMarks);
    System.out.println("Aptitude Marks             : "+AptitudeMarks);
    System.out.println("Communication Marks        : "+commMarks);
    System.out.println("Total Marks                : "+totalMarks);
    System.out.println("Percentage                 : "+percentage+"%");
    System.out.println("Academic Result            : "+academicResult);
    System.out.println("Grade                      : "+grade);
    System.out.println();

    System.out.println("---------------- ATTENDANCE SUMMARY ------------------");
    System.out.println("Classes Conducted          : "+classesConducted);
    System.out.println("Classes Attended           : "+classesAttended);
    System.out.println("Attendance Percentage      : "+attendancePercentage+"%");
    System.out.println("Attendance Status          : "+attendanceStatus);
    System.out.println();

    System.out.println("---------------- ASSIGNMENT SUMMARY ------------------");
    System.out.println("Valid Assignments          : "+validAssignScore);
    System.out.println("Assignment Total           : "+totalAssignScore);
    System.out.println("Assignment Average         : "+assignAvg);
    System.out.println("Assignment Status          : "+assignStatus);
    System.out.println();

    System.out.println("---------------- FEE SUMMARY -------------------------");
    System.out.println("Base Semester Fee          : Rs."+courseFee);
    System.out.println("Scholarship Percentage     : "+scholarshipDiscount+"%");
    System.out.println("Scholarship Amount         : Rs."+scholarshipAmount);
    System.out.println("Final Payable Fee          : Rs."+finalFee);
    System.out.println("Amount Paid                : Rs."+amountPaid);
    System.out.println("Fee Balance                : Rs."+feeBalance);
    System.out.println("Fee Status                 : "+feeStatus);
    System.out.println();

    System.out.println("---------------- FINAL STATUS ------------------------");
    System.out.println("Semester Clearance         : "+semClearance);
    System.out.println();

    System.out.println("---------------- FAILED CONDITIONS -------------------");
    System.out.println(applicableReason);
    System.out.println();

    System.out.println("---------------- RECOMMENDATIONS ---------------------");
    System.out.println(recommendation);
    System.out.println("========================================================");
    System.out.println();


    System.out.println("Do you want to process another?");
    System.out.println("1. Yes");
    System.out.println("0. No");
    System.out.print("Enter choice: ");
    anotherChoice = sc.nextInt();
    sc.nextLine();

   } while(anotherChoice==1);
 }
}
