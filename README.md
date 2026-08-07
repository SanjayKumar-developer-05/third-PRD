# third-PRD
# Third PRD — CampusTrack : Student Result Management System

> **Project type:** Individual Java console application  
> **Repository name:** `Third-PRD`  
> **Difficulty:** Easy / Beginner  
> **Input:** Runtime input using `Scanner`  
> **Solution code:** Not provided

## 1. Project Description

Colleges need a simple way to check a student's marks, attendance, and fee status.

In this project, you will build **CampusTrack**, a basic Student Result Management System. The program will accept the details of one student, calculate the result, and display a final semester report.

The project handles only **one student during one program execution**. It does not require a database, file storage, arrays, methods, or object-oriented programming.

## 2. Programming Task

Create a Java console program that:

1. Reads the student's basic details.
2. Uses a menu to select the course.
3. Accepts marks for three subjects.
4. Validates marks using loops.
5. Calculates total marks and average.
6. Checks whether the student passed every subject.
7. Assigns a grade using `if-else-if`.
8. Checks the student's attendance.
9. Calculates the pending semester fee.
10. Produces the final semester status.
11. Displays a clear student report.

## 3. Concepts Used

### Required concepts

- Java program structure
- Variables and primitive data types
- `String`
- `Scanner`
- Arithmetic operators
- Relational and logical operators
- `if`, `else if`, and `else`
- `switch`
- Ternary operator
- `while` loop for validation
- `print`, `println`, and `printf`

### Concepts not allowed

- Arrays
- Collections
- User-defined methods
- Additional classes
- Constructors
- Exception handling
- File handling
- Database connectivity
- Inheritance
- Streams and lambda expressions
- GUI or web development

Write the complete program inside the `main` method.

## 4. Application Flow

The application must follow this order:

```text
START

Display application heading
Read student ID
Read student name
Read and validate age

Display course menu
Read and validate course choice
Use switch to assign course name and semester fee

Read and validate Java marks
Read and validate SQL marks
Read and validate Aptitude marks

Calculate total and average
Check individual subject results
Determine overall academic result
Determine grade

Read and validate attendance
Determine attendance status

Read and validate fee paid
Calculate fee balance
Determine fee status

Determine final semester status
Display complete student report

STOP
```

## 5. Functional Requirements

### FR-01: Display the Welcome Screen

Display the following heading:

```text
==================================================
                 CAMPUSTRACK
==================================================
        Simple Student Result Management System
--------------------------------------------------
```

### FR-02: Read Student Details

Collect the following information:

| Field | Data type | Rule |
|---|---:|---|
| Student ID | `String` | Read as a single word |
| Student name | `String` | Read the complete name |
| Age | `int` | Must be from 16 to 30 |

#### Sample input

```text
Enter student ID: STU101
Enter student name: Ananya Rao
Enter age: 20
```

#### Complete-name requirement

The student name may contain spaces. Use `nextLine()` to read the complete name.

After reading the student ID using `next()`, consume the pending newline before reading the name.

Correct value:

```text
Student name: Ananya Rao
```

Incorrect value:

```text
Student name:
```

#### Age validation

The age must be between `16` and `30`, inclusive. If the entered age is invalid, use a `while` loop to request it again.

```text
Enter age: 14
Invalid age. Enter a value between 16 and 30.
Enter age: 20
```

### FR-03: Select the Course

Display this menu:

```text
Select Course
1. BCA
2. B.Sc Computer Science
3. B.E/B.Tech
```

The course choice must be between `1` and `3`. Use a `while` loop to request the value again when it is invalid.

Use a `switch` statement to assign the course name and semester fee.

| Choice | Course | Semester fee |
|---:|---|---:|
| 1 | BCA | ₹30,000 |
| 2 | B.Sc Computer Science | ₹35,000 |
| 3 | B.E/B.Tech | ₹50,000 |

#### Sample input

```text
Enter course choice: 3
Course selected: B.E/B.Tech
Semester fee: ₹50000.00
```

#### Invalid choice example

```text
Enter course choice: 5
Invalid course choice. Enter a value from 1 to 3.
Enter course choice: 2
Course selected: B.Sc Computer Science
```

### FR-04: Read Subject Marks

Collect marks for exactly three subjects:

1. Java
2. SQL
3. Aptitude

Each mark must be between `0` and `100`, inclusive.

Use three separate variables:

```text
javaMarks
sqlMarks
aptitudeMarks
```

Do not use an array.

#### Sample input

```text
Enter Java marks: 78
Enter SQL marks: 72
Enter Aptitude marks: 65
```

#### Marks validation

Use a `while` loop for each mark.

```text
Enter Java marks: 120
Invalid marks. Enter a value between 0 and 100.
Enter Java marks: -5
Invalid marks. Enter a value between 0 and 100.
Enter Java marks: 78
```

### FR-05: Calculate Total and Average

Calculate:

```text
Total marks = Java marks + SQL marks + Aptitude marks
```

```text
Average = Total marks / 3.0
```

Use `3.0` so that decimal division takes place.

Display the average with two decimal places.

#### Example

```text
Java marks     : 78
SQL marks      : 72
Aptitude marks : 65
Total marks    : 215/300
Average        : 71.67
```

### FR-06: Determine the Academic Result

The pass mark for each subject is `35`.

The student passes the academic requirement only when:

```text
Java marks >= 35
AND SQL marks >= 35
AND Aptitude marks >= 35
```

Use a compound condition to check all three marks.

Assign:

```text
PASSED
```

or:

```text
FAILED
```

#### Important rule

A high average must not hide a failed subject.

Example:

```text
Java marks     : 90
SQL marks      : 30
Aptitude marks : 90
Average        : 70.00
Academic Result: FAILED
```

The student fails because SQL marks are below `35`.

### FR-07: Determine the Grade

Use an `if-else-if` ladder.

| Condition | Grade |
|---|---|
| Student failed any subject | F |
| Average is 75 or above | A |
| Average is 60 to 74.99 | B |
| Average is 50 to 59.99 | C |
| Average is below 50 | D |

First check whether the student failed any subject. If yes, the grade must be `F` even when the average is high.

### FR-08: Check Attendance

Read the attendance percentage as a `double`.

Valid range:

```text
0 to 100
```

Use a `while` loop to request the value again when it is outside this range.

The attendance requirement is satisfied when:

```text
Attendance >= 75
```

Use a ternary operator to assign:

```text
SUFFICIENT
```

or:

```text
SHORTAGE
```

#### Example

```text
Enter attendance percentage: 82
Attendance status: SUFFICIENT
```

### FR-09: Calculate the Fee Balance

The semester fee is already decided by the selected course.

Read the amount paid by the student.

The paid amount must be:

```text
0 or more
AND not greater than the semester fee
```

Use a `while` loop when the value is invalid.

Calculate:

```text
Fee balance = Semester fee - Fee paid
```

Use a ternary operator to assign the fee status:

```text
Fee balance == 0 ? "CLEARED" : "PENDING"
```

#### Example

```text
Semester fee : ₹50000.00
Enter fee paid: 40000
Fee balance  : ₹10000.00
Fee status   : PENDING
```

### FR-10: Determine the Final Semester Status

The final semester status is `CLEARED` only when all three conditions are true:

```text
Academic result is PASSED
AND attendance is at least 75
AND fee balance is 0
```

Use a ternary operator to assign:

```text
SEMESTER CLEARED
```

or:

```text
SEMESTER NOT CLEARED
```

### FR-11: Display Exact Reasons

When the final status is `SEMESTER NOT CLEARED`, display the exact reason or reasons.

Possible reasons:

- Java marks are below 35.
- SQL marks are below 35.
- Aptitude marks are below 35.
- Attendance is below 75%.
- Semester fee is pending.

Use separate `if` statements so that every applicable reason is displayed.

Example:

```text
Reasons:
- SQL marks are below 35.
- Attendance is below 75%.
```

## 6. Expected Report Format

Display the report in this format:

```text
==================================================
              STUDENT SEMESTER REPORT
==================================================
Student ID          :
Student Name        :
Age                 :
Course              :

--------------- ACADEMIC DETAILS -----------------
Java Marks          :
SQL Marks           :
Aptitude Marks      :
Total Marks         :
Average             :
Academic Result     :
Grade               :

--------------- ATTENDANCE DETAILS ---------------
Attendance          :
Attendance Status   :

------------------ FEE DETAILS --------------------
Semester Fee        :
Fee Paid            :
Fee Balance         :
Fee Status          :

---------------- FINAL STATUS ---------------------
Semester Status     :

Reasons:
...
==================================================
```

Do not display the `Reasons` section when the semester is cleared.

## 7. Detailed Sample Run

### Sample input

```text
Enter student ID: STU101
Enter student name: Ananya Rao
Enter age: 20

Select Course
1. BCA
2. B.Sc Computer Science
3. B.E/B.Tech

Enter course choice: 3
Enter Java marks: 78
Enter SQL marks: 72
Enter Aptitude marks: 65
Enter attendance percentage: 82
Enter fee paid: 50000
```

### Expected output

```text
==================================================
              STUDENT SEMESTER REPORT
==================================================
Student ID          : STU101
Student Name        : Ananya Rao
Age                 : 20
Course              : B.E/B.Tech

--------------- ACADEMIC DETAILS -----------------
Java Marks          : 78
SQL Marks           : 72
Aptitude Marks      : 65
Total Marks         : 215/300
Average             : 71.67
Academic Result     : PASSED
Grade               : B

--------------- ATTENDANCE DETAILS ---------------
Attendance          : 82.00%
Attendance Status   : SUFFICIENT

------------------ FEE DETAILS --------------------
Semester Fee        : ₹50000.00
Fee Paid            : ₹50000.00
Fee Balance         : ₹0.00
Fee Status          : CLEARED

---------------- FINAL STATUS ---------------------
Semester Status     : SEMESTER CLEARED
==================================================
```

## 8. Test Cases

Students must test the program with at least the following five cases.

### Test Case 1: All conditions passed

| Input | Value |
|---|---:|
| Course | B.E/B.Tech |
| Java | 78 |
| SQL | 72 |
| Aptitude | 65 |
| Attendance | 82 |
| Semester fee | ₹50,000 |
| Fee paid | ₹50,000 |

Expected result:

```text
Average             : 71.67
Academic Result     : PASSED
Grade               : B
Attendance Status   : SUFFICIENT
Fee Status          : CLEARED
Semester Status     : SEMESTER CLEARED
```

### Test Case 2: One subject failed

| Input | Value |
|---|---:|
| Java | 90 |
| SQL | 30 |
| Aptitude | 90 |
| Attendance | 85 |
| Fee balance | ₹0 |

Expected result:

```text
Average             : 70.00
Academic Result     : FAILED
Grade               : F
Semester Status     : SEMESTER NOT CLEARED

Reasons:
- SQL marks are below 35.
```

### Test Case 3: Exact boundary values

| Input | Value |
|---|---:|
| Java | 35 |
| SQL | 35 |
| Aptitude | 35 |
| Attendance | 75 |
| Fee balance | ₹0 |

Expected result:

```text
Average             : 35.00
Academic Result     : PASSED
Grade               : D
Attendance Status   : SUFFICIENT
Fee Status          : CLEARED
Semester Status     : SEMESTER CLEARED
```

This verifies that the boundary values are included.

### Test Case 4: Attendance shortage and pending fee

| Input | Value |
|---|---:|
| Java | 70 |
| SQL | 68 |
| Aptitude | 72 |
| Attendance | 70 |
| Semester fee | ₹30,000 |
| Fee paid | ₹20,000 |

Expected result:

```text
Academic Result     : PASSED
Attendance Status   : SHORTAGE
Fee Balance         : ₹10000.00
Fee Status          : PENDING
Semester Status     : SEMESTER NOT CLEARED

Reasons:
- Attendance is below 75%.
- Semester fee is pending.
```

### Test Case 5: Invalid values are entered again

Sample input and output:

```text
Enter age: 12
Invalid age. Enter a value between 16 and 30.
Enter age: 20

Enter course choice: 7
Invalid course choice. Enter a value from 1 to 3.
Enter course choice: 1

Enter Java marks: 110
Invalid marks. Enter a value between 0 and 100.
Enter Java marks: 75

Enter attendance percentage: -10
Invalid attendance. Enter a value between 0 and 100.
Enter attendance percentage: 80
```

## 9. Pseudocode

```text
START

Create Scanner object
Display CampusTrack heading

Read student ID
Handle pending newline
Read complete student name

Read age
WHILE age is outside 16 to 30
    Display invalid-age message
    Read age again
END WHILE

Display course menu
Read course choice
WHILE course choice is outside 1 to 3
    Display invalid-choice message
    Read course choice again
END WHILE

SWITCH course choice
    CASE 1: Assign BCA and fee 30000
    CASE 2: Assign B.Sc Computer Science and fee 35000
    CASE 3: Assign B.E/B.Tech and fee 50000
END SWITCH

Read Java marks
Validate using WHILE
Read SQL marks
Validate using WHILE
Read Aptitude marks
Validate using WHILE

Calculate total marks
Calculate average using division by 3.0

Check whether all three subjects are passed
Assign academic result

IF any subject is failed
    Grade is F
ELSE IF average is at least 75
    Grade is A
ELSE IF average is at least 60
    Grade is B
ELSE IF average is at least 50
    Grade is C
ELSE
    Grade is D
END IF

Read attendance
Validate attendance using WHILE
Assign attendance status using ternary operator

Read fee paid
Validate fee paid using WHILE
Calculate fee balance
Assign fee status using ternary operator

Check academic result, attendance, and fee balance
Assign final semester status using ternary operator

Display student report

IF final semester status is not cleared
    Display each applicable reason using separate IF statements
END IF

STOP
```

## 10. Repository Structure

```text
Third-PRD/
├── README.md
├── src/
│   └── Main.java
├── pseudocode/
│   └── pseudocode.txt
└── output/
    ├── test-case-1.txt
    ├── test-case-2.txt
    ├── test-case-3.txt
    ├── test-case-4.txt
    └── test-case-5.txt
```

## 11. Student Instructions

1. Create a repository named `Third-PRD`.
2. Copy this requirement into `README.md`.
3. Write the Java program in `src/Main.java`.
4. Write the pseudocode in `pseudocode/pseudocode.txt`.
5. Run all five test cases.
6. Save each console output in the `output` folder.
7. Use meaningful variable names.
8. Do not copy another learner's code.
9. Do not add arrays, methods, classes, or advanced concepts.
10. Verify the output before submission.

## 12. Acceptance Criteria

The project is complete only when:

- All input is collected using `Scanner`.
- The complete student name is read correctly.
- Age is validated from 16 to 30.
- Course choice is validated from 1 to 3.
- A `switch` statement assigns the course and fee.
- Three separate variables store the three subject marks.
- Every mark is validated from 0 to 100.
- Total and decimal average are calculated correctly.
- Every subject requires at least 35 marks.
- One failed subject produces grade `F`.
- Grade classification follows the given table.
- Attendance is validated from 0 to 100.
- Attendance of exactly 75 is accepted.
- Fee balance is calculated correctly.
- Ternary operators assign attendance, fee, and final statuses.
- Every failed condition is displayed separately.
- The report is aligned and readable.
- All five test cases are executed and saved.
- No arrays, collections, methods, OOP, files, or databases are used.

## 13. Technical Note

The JDK is used to develop and compile the Java program. The Java compiler converts the source code into bytecode. The JRE provides the environment required to run the program, and the JVM executes the bytecode. The same bytecode can run on different operating systems with a compatible JVM, making Java platform-independent.

## 14. Expected Learning Outcome

After completing this project, the learner should be able to build a small Java console application using variables, `Scanner`, operators, decisions, a `switch` menu, validation loops, ternary operators, calculations, and formatted output.

The project is intentionally limited to one student, three subjects, one attendance value, and one fee calculation so that a beginner can complete it step by step.
