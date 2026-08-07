# Third PRD — CampusTrack: Student Academic Management System

> **Project type:** Individual Java console application  
> **Repository name:** `Third-PRD`  
> **Difficulty:** Beginner  
> **Input:** Runtime input using `Scanner`  
> **Solution code in this document:** Not provided

## 1. Project Introduction

A college regularly needs to review a student's academic progress. The college must maintain the student's basic details, marks, attendance, assignment performance, scholarship eligibility, fee payment and semester-clearance status.

In this project, you will build **CampusTrack**, a beginner-friendly Student Academic Management System.

The application handles one student at a time and generates a complete semester report. After displaying the report, it allows the operator to process another student.

This is a console-based learning project. No database, graphical interface or file storage is required.

## 2. Problem Statement

Develop a Java program that collects and processes the following information:

1. Student profile
2. Course and semester details
3. Marks in five subjects
4. Overall result, percentage and grade
5. Attendance information
6. Assignment scores
7. Scholarship eligibility
8. Semester-fee payment
9. Final clearance status
10. Detailed recommendations

The application must validate every numeric input, perform the required calculations and display the exact reason whenever a student does not satisfy a rule.

## 3. Learning Objectives

After completing this project, the learner should be able to:

- Write a properly structured Java program.
- Use `Scanner` to accept runtime input.
- Read integers, decimal values, single words and complete lines.
- Handle the pending newline before using `nextLine()`.
- Declare and initialize variables using suitable data types.
- Use meaningful variable names.
- Apply arithmetic, assignment, relational and logical operators.
- Perform integer and decimal calculations.
- Use explicit type casting while calculating percentages.
- Use `if`, `else if`, `else` and nested conditions.
- Build compound Boolean expressions.
- Use `switch` for menu-based selection.
- Use a ternary operator for simple status assignment.
- Use `while` loops for input validation.
- Use a `for` loop to process assignment scores.
- Use `break` and `continue` correctly.
- Use a `do-while` loop to process another student.
- Print a clear and aligned report using `printf`.

## 4. Technical Scope

### 4.1 Allowed concepts

- Java program structure
- Variables and primitive data types
- `String`
- `Scanner`
- Arithmetic operators
- Assignment operators
- Relational operators
- Logical operators
- Type conversion and explicit casting
- `if`, `else if` and `else`
- Nested and compound conditions
- `switch`
- Ternary operator
- `for`, `while` and `do-while`
- `break` and `continue`
- `print`, `println` and `printf`

### 4.2 Concepts not allowed

- Arrays
- Collections
- User-defined methods
- Additional user-defined classes
- Constructors
- Exception handling
- File handling
- Database connectivity
- Inheritance or other advanced OOP concepts
- Streams and lambda expressions
- GUI or web development

All program logic may be written inside the `main` method.

## 5. Application Flow

The program must complete these modules in the given order:

1. Display the welcome screen.
2. Read the student's profile.
3. Select the course using a menu.
4. Read and validate five subject marks.
5. Calculate total, percentage, subject result and grade.
6. Read attendance data and calculate the attendance percentage.
7. Process assignment scores.
8. Calculate the scholarship discount.
9. Read the fee amount paid and calculate the balance.
10. Determine the final semester-clearance status.
11. Display failed conditions and recommendations.
12. Print the complete student report.
13. Ask whether another student must be processed.

## 6. Functional Requirements

### FR-01: Welcome Screen

Display the following heading when the program starts:

```text
========================================================
                    CAMPUSTRACK
========================================================
       Student Academic Management System
--------------------------------------------------------
```

### FR-02: Student Profile

Collect the following information:

| Field | Data type | Validation |
|---|---:|---|
| Student ID | `String` | Required single-word input |
| Full name | `String` | Complete-line input |
| Age | `int` | 15–35 |
| Email | `String` | Single-word input |
| Course choice | `int` | 1–5 |
| Semester | `int` | 1–8 |
| Career goal | `String` | Complete-line input |

#### Sample profile input

```text
Enter student ID: STU101
Enter full name: Ananya Rao
Enter age: 20
Enter email: ananya@gmail.com

Select course:
1. BCA
2. B.Sc Computer Science
3. B.E/B.Tech
4. MCA
5. Other

Enter course choice: 3
Enter semester (1-8): 4
Enter career goal: Become a Java backend developer
```

#### Age validation

The age must be from `15` to `35`, inclusive. Use a `while` loop to request the value again when it is invalid.

```text
Enter age: 12
Invalid age. Enter a value between 15 and 35.
Enter age: 20
Age accepted.
```

#### Course selection

Use a `switch` statement to convert the course choice into the course name and base semester fee.

| Choice | Course name | Base semester fee |
|---:|---|---:|
| 1 | BCA | ₹35,000 |
| 2 | B.Sc Computer Science | ₹30,000 |
| 3 | B.E/B.Tech | ₹50,000 |
| 4 | MCA | ₹45,000 |
| 5 | Other | ₹25,000 |

Any value outside `1–5` is invalid. Use a loop to display the menu and request the choice again.

```text
Enter course choice: 7
Invalid course choice. Select a value from 1 to 5.
Enter course choice: 3
Course selected: B.E/B.Tech
```

#### Complete-line input requirement

The full name and career goal may contain spaces. They must be read using `nextLine()`.

The student ID is read as a single word before the full name. Consume the pending newline after reading the student ID, and then read the full name using `nextLine()`.

The career goal is entered after the numeric semester input. The pending newline must be consumed before reading the career goal.

Correct value:

```text
Career goal: Become a Java backend developer
```

Incorrect value:

```text
Career goal:
```

### FR-03: Subject Marks

Collect marks for exactly five subjects:

1. Java
2. SQL
3. Web Technology
4. Aptitude
5. Communication

Every mark must be from `0` to `100`, inclusive.

Store the marks in five separate variables. Arrays are not allowed.

#### Sample marks input

```text
Enter Java marks: 82
Enter SQL marks: 76
Enter Web Technology marks: 71
Enter Aptitude marks: 68
Enter Communication marks: 73
```

#### Marks validation

Use a `while` loop for every subject mark.

```text
Enter Java marks: 120
Invalid marks. Enter a value between 0 and 100.
Enter Java marks: -10
Invalid marks. Enter a value between 0 and 100.
Enter Java marks: 82
Java marks accepted.
```

### FR-04: Total and Percentage

Calculate:

```text
Total marks = Java + SQL + Web Technology + Aptitude + Communication
```

The maximum total is `500`.

Calculate the percentage using decimal division:

```text
Percentage = (double) total marks / 5
```

The explicit cast ensures that the result is calculated as a decimal value.

Display the percentage with exactly two digits after the decimal point.

#### Example

```text
Total marks: 370
Percentage: 74.00%
```

### FR-05: Subject and Academic Result

The minimum pass mark in every subject is `35`.

The student passes the academic criteria only when:

```text
Java marks >= 35
AND SQL marks >= 35
AND Web Technology marks >= 35
AND Aptitude marks >= 35
AND Communication marks >= 35
AND Percentage >= 40
```

A high percentage must not hide a failed subject.

Example:

```text
Java: 90
SQL: 90
Web Technology: 90
Aptitude: 30
Communication: 90
Percentage: 78.00%
```

The academic result must be `FAILED` because Aptitude is below `35`.

The report must display every failed subject separately.

### FR-06: Grade Classification

Use an `if-else-if` ladder.

| Condition | Grade |
|---|---|
| Academic criteria failed | F |
| Percentage is 85 or above | A+ |
| Percentage is 75–84.99 | A |
| Percentage is 65–74.99 | B |
| Percentage is 50–64.99 | C |
| Percentage is 40–49.99 | D |

Grade classification must happen only after the academic result has been checked.

### FR-07: Attendance

Collect:

| Field | Data type | Validation |
|---|---:|---|
| Total classes conducted | `int` | 1–300 |
| Classes attended | `int` | 0 to total classes conducted |

Calculate:

```text
Attendance percentage =
((double) classes attended / total classes conducted) * 100
```

The attendance criteria is passed when:

```text
Attendance percentage >= 75
```

Use a ternary operator to assign:

```text
REGULAR
```

or:

```text
SHORTAGE
```

#### Example

```text
Enter total classes conducted: 100
Enter classes attended: 82
Attendance percentage: 82.00%
Attendance status: REGULAR
```

Classes attended must never be greater than classes conducted.

```text
Enter total classes conducted: 80
Enter classes attended: 90
Invalid attendance. Attended classes cannot exceed 80.
Enter classes attended: 68
Attendance accepted.
```

### FR-08: Assignment Score Processing

Ask how many assignment scores the operator wants to enter.

Valid range:

```text
1–10 assignments
```

Use a `for` loop to process the requested entries.

For each assignment, accept a score from `0` to `10`.

Special input:

```text
-1 = Finish assignment entry early
```

#### Assignment rules

1. If the score is `-1`, stop the assignment loop using `break`.
2. If the score is below `-1` or above `10`, display a warning and skip the entry using `continue`.
3. A valid score from `0` to `10` must be added to the assignment total.
4. Increase the valid-assignment count only for an accepted score.
5. Invalid and skipped entries must not affect the total or average.
6. If no valid score is entered, the assignment average must be `0.00`.

Calculate:

```text
Assignment average =
(double) total assignment score / valid assignment count
```

The assignment criteria is passed when:

```text
At least one valid assignment was entered
AND Assignment average >= 5
```

Use a ternary operator to assign:

```text
SATISFACTORY
```

or:

```text
NEEDS IMPROVEMENT
```

#### Sample assignment input

```text
How many assignment scores do you want to enter? 5

Enter score for assignment 1 (0-10, -1 to finish): 8
Assignment score accepted.

Enter score for assignment 2 (0-10, -1 to finish): 15
Invalid score. Assignment 2 skipped.

Enter score for assignment 3 (0-10, -1 to finish): 7
Assignment score accepted.

Enter score for assignment 4 (0-10, -1 to finish): -1
Assignment entry completed early.
```

Result:

```text
Valid assignments: 2
Assignment total: 15
Assignment average: 7.50
Assignment status: SATISFACTORY
```

### FR-09: Scholarship Calculation

The scholarship is calculated using academic performance and attendance.

| Condition | Scholarship discount |
|---|---:|
| Academic criteria passed, percentage ≥ 85 and attendance ≥ 85 | 10% |
| Academic criteria passed, percentage ≥ 75 and attendance ≥ 75 | 5% |
| All other cases | 0% |

Check the `10%` condition first. Otherwise, a student eligible for `10%` may incorrectly receive only `5%`.

Calculate:

```text
Scholarship amount = Base semester fee × Scholarship percentage / 100
```

```text
Final payable fee = Base semester fee - Scholarship amount
```

#### Example

```text
Base semester fee: ₹50000.00
Scholarship: 5%
Scholarship amount: ₹2500.00
Final payable fee: ₹47500.00
```

### FR-10: Fee Payment

Read the amount already paid by the student.

Valid range:

```text
0 to final payable fee
```

The amount cannot be negative and cannot be greater than the final payable fee. Use a loop to request an invalid value again.

Calculate:

```text
Fee balance = Final payable fee - Amount paid
```

Use a ternary operator to assign the fee status:

```text
Fee balance == 0 ? "PAID" : "PENDING"
```

All monetary values must be displayed with exactly two decimal places.

### FR-11: Final Semester Clearance

The student is cleared for the next semester only when all the following conditions are true:

```text
Academic criteria passed
AND Attendance percentage >= 75
AND Assignment criteria passed
AND Fee balance == 0
```

Use a compound Boolean expression to calculate the result.

Use a ternary operator to assign:

```text
CLEARED FOR NEXT SEMESTER
```

or:

```text
ACTION REQUIRED
```

Academic performance, attendance, assignments and fees must be checked independently. Passing one condition must not hide failure in another condition.

### FR-12: Failed Conditions

If the final status is `ACTION REQUIRED`, display every applicable reason.

Possible reasons include:

- Java marks are below 35.
- SQL marks are below 35.
- Web Technology marks are below 35.
- Aptitude marks are below 35.
- Communication marks are below 35.
- Overall percentage is below 40%.
- Attendance is below 75%.
- Assignment average is below 5.00.
- No valid assignment score was entered.
- Semester fee is pending.

Do not display only a generic message such as `Student failed`.

### FR-13: Recommendations

Display recommendations based on the failed conditions.

| Failed condition | Recommendation |
|---|---|
| Any subject below 35 | Revisit the failed subject and complete additional practice. |
| Percentage below 40 | Improve overall academic performance. |
| Attendance below 75% | Attend classes regularly and clear the attendance shortage. |
| Assignment criteria failed | Complete assignments consistently and maintain an average of at least 5.00. |
| Fee pending | Pay the pending semester fee before clearance. |
| All conditions passed | Maintain the current performance in the next semester. |

If more than one condition fails, display all relevant recommendations.

### FR-14: Process Another Student

After displaying the report, ask:

```text
Do you want to process another student?
1. Yes
0. No
Enter choice:
```

Accept only `1` or `0`. Use a validation loop when another value is entered. Use a `do-while` loop to repeat the complete process when the choice is `1`.

If the choice is `0`, display:

```text
Thank you for using CampusTrack.
```

## 7. Required Processing Logic

```text
START

Create Scanner object
Display CampusTrack heading

DO
    Read student ID
    Read full name

    Read age
    WHILE age is outside 15 to 35
        Display error
        Read age again
    END WHILE

    Read email

    DO
        Display course menu
        Read course choice
        Use switch to assign course name and base semester fee
    WHILE course choice is invalid

    Read and validate semester
    Consume pending newline
    Read complete career goal

    Read and validate five subject marks separately
    Calculate total marks
    Calculate decimal percentage using explicit casting

    Check every subject pass condition
    Check overall academic criteria
    Determine grade

    Read and validate total classes
    Read and validate attended classes
    Calculate attendance percentage
    Use ternary operator to determine attendance status

    Read and validate number of assignment entries
    Set assignment total and valid count to zero

    FOR every requested assignment entry
        Read assignment score

        IF score is -1
            Display early-finish message
            BREAK
        END IF

        IF score is invalid
            Display skipped-entry warning
            CONTINUE
        END IF

        Add score to assignment total
        Increase valid-assignment count
    END FOR

    IF valid-assignment count is greater than zero
        Calculate decimal assignment average
    ELSE
        Set assignment average to zero
    END IF

    Determine assignment criteria and status
    Determine scholarship percentage
    Calculate scholarship amount
    Calculate final payable fee

    Read and validate amount paid
    Calculate fee balance
    Use ternary operator to determine fee status

    Check academic, attendance, assignment and fee conditions
    Use ternary operator to determine final clearance status

    Display the complete student report
    Display every failed condition
    Display relevant recommendations

    Ask whether another student must be processed
    Validate that the choice is 1 or 0
WHILE choice is 1

Display closing message
Close Scanner

STOP
```

## 8. Expected Report Format

The final report must follow this structure:

```text
========================================================
                 STUDENT SEMESTER REPORT
========================================================
Student ID                 :
Student Name               :
Age                        :
Email                      :
Course                     :
Semester                   :
Career Goal                :

---------------- ACADEMIC SUMMARY --------------------
Java Marks                 :
SQL Marks                  :
Web Technology Marks       :
Aptitude Marks              :
Communication Marks        :
Total Marks                :
Percentage                 :
Academic Result            :
Grade                      :

---------------- ATTENDANCE SUMMARY ------------------
Classes Conducted          :
Classes Attended           :
Attendance Percentage      :
Attendance Status          :

---------------- ASSIGNMENT SUMMARY ------------------
Valid Assignments          :
Assignment Total           :
Assignment Average         :
Assignment Status          :

---------------- FEE SUMMARY -------------------------
Base Semester Fee          :
Scholarship Percentage     :
Scholarship Amount         :
Final Payable Fee          :
Amount Paid                :
Fee Balance                :
Fee Status                 :

---------------- FINAL STATUS ------------------------
Semester Clearance         :

---------------- FAILED CONDITIONS -------------------
...

---------------- RECOMMENDATIONS ---------------------
...
========================================================
```

If no condition fails, display:

```text
Failed Conditions: None
```

## 9. Detailed Sample Run

### Sample input

```text
Enter student ID: STU101
Enter full name: Ananya Rao
Enter age: 20
Enter email: ananya@gmail.com

Select course:
1. BCA
2. B.Sc Computer Science
3. B.E/B.Tech
4. MCA
5. Other

Enter course choice: 3
Enter semester (1-8): 4
Enter career goal: Become a Java backend developer

Enter Java marks: 88
Enter SQL marks: 82
Enter Web Technology marks: 79
Enter Aptitude marks: 76
Enter Communication marks: 80

Enter total classes conducted: 120
Enter classes attended: 102

How many assignment scores do you want to enter? 5
Enter score for assignment 1 (0-10, -1 to finish): 8
Enter score for assignment 2 (0-10, -1 to finish): 9
Enter score for assignment 3 (0-10, -1 to finish): 7
Enter score for assignment 4 (0-10, -1 to finish): 8
Enter score for assignment 5 (0-10, -1 to finish): 9

Final payable fee: ₹47500.00
Enter amount paid: 47500
```

### Expected output

```text
========================================================
                 STUDENT SEMESTER REPORT
========================================================
Student ID                 : STU101
Student Name               : Ananya Rao
Age                        : 20
Email                      : ananya@gmail.com
Course                     : B.E/B.Tech
Semester                   : 4
Career Goal                : Become a Java backend developer

---------------- ACADEMIC SUMMARY --------------------
Java Marks                 : 88
SQL Marks                  : 82
Web Technology Marks       : 79
Aptitude Marks              : 76
Communication Marks        : 80
Total Marks                : 405/500
Percentage                 : 81.00%
Academic Result            : PASSED
Grade                      : A

---------------- ATTENDANCE SUMMARY ------------------
Classes Conducted          : 120
Classes Attended           : 102
Attendance Percentage      : 85.00%
Attendance Status          : REGULAR

---------------- ASSIGNMENT SUMMARY ------------------
Valid Assignments          : 5
Assignment Total           : 41
Assignment Average         : 8.20
Assignment Status          : SATISFACTORY

---------------- FEE SUMMARY -------------------------
Base Semester Fee          : ₹50000.00
Scholarship Percentage     : 5%
Scholarship Amount         : ₹2500.00
Final Payable Fee          : ₹47500.00
Amount Paid                : ₹47500.00
Fee Balance                : ₹0.00
Fee Status                 : PAID

---------------- FINAL STATUS ------------------------
Semester Clearance         : CLEARED FOR NEXT SEMESTER

---------------- FAILED CONDITIONS -------------------
None

---------------- RECOMMENDATIONS ---------------------
Maintain the current performance in the next semester.
========================================================
```

## 10. Test Cases

At least five test cases must be executed. Save the console output of each test case in the `output` folder.

### Test Case 1: All conditions passed

| Field | Value |
|---|---|
| Course | B.E/B.Tech |
| Marks | 88, 82, 79, 76, 80 |
| Percentage | 81.00% |
| Attendance | 102/120 = 85.00% |
| Assignment scores | 8, 9, 7, 8, 9 |
| Assignment average | 8.20 |
| Base fee | ₹50,000 |
| Scholarship | 5% |
| Amount paid | ₹47,500 |

Expected main results:

```text
Academic Result     : PASSED
Grade               : A
Attendance Status   : REGULAR
Assignment Status   : SATISFACTORY
Fee Status          : PAID
Semester Clearance  : CLEARED FOR NEXT SEMESTER
```

### Test Case 2: One subject failed despite a high percentage

Use these marks:

```text
Java: 90
SQL: 90
Web Technology: 90
Aptitude: 30
Communication: 90
```

Expected calculation:

```text
Total Marks         : 390/500
Percentage          : 78.00%
Academic Result     : FAILED
Grade               : F
Semester Clearance  : ACTION REQUIRED
```

Expected failed condition:

```text
- Aptitude marks are below 35.
```

This test verifies that a high percentage cannot hide a failed subject.

### Test Case 3: Exact boundary values

Use:

| Field | Value |
|---|---:|
| All five subject marks | 40 |
| Classes conducted | 100 |
| Classes attended | 75 |
| Assignment scores | 5, 5, 5 |
| Amount paid | Complete payable fee |

Expected result:

```text
Percentage             : 40.00%
Academic Result        : PASSED
Grade                  : D
Attendance Percentage  : 75.00%
Attendance Status      : REGULAR
Assignment Average     : 5.00
Assignment Status      : SATISFACTORY
Semester Clearance     : CLEARED FOR NEXT SEMESTER
```

This test confirms that boundary values are included.

### Test Case 4: Attendance shortage and pending fee

Use:

| Field | Value |
|---|---:|
| Academic result | Passed |
| Classes conducted | 100 |
| Classes attended | 70 |
| Assignment average | 7.00 |
| Final payable fee | ₹35,000 |
| Amount paid | ₹20,000 |

Expected result:

```text
Attendance Percentage  : 70.00%
Attendance Status      : SHORTAGE
Fee Balance            : ₹15000.00
Fee Status             : PENDING
Semester Clearance     : ACTION REQUIRED
```

Expected failed conditions:

```text
- Attendance is below 75%.
- Semester fee is pending.
```

### Test Case 5: Assignment `continue` and `break`

Input:

```text
Number of assignment scores: 5

Assignment 1: 8
Assignment 2: 15
Assignment 3: 6
Assignment 4: -1
```

Expected processing:

```text
Assignment 1 accepted.
Assignment 2 skipped: Score must be from 0 to 10.
Assignment 3 accepted.
Assignment entry completed early.

Valid Assignments      : 2
Assignment Total       : 14
Assignment Average     : 7.00
Assignment Status      : SATISFACTORY
```

This test verifies that an invalid entry uses `continue` and `-1` uses `break`.

### Test Case 6: No valid assignment entered

Input:

```text
Number of assignment scores: 3
Assignment 1: 15
Assignment 2: 12
Assignment 3: -1
```

Expected result:

```text
Valid Assignments      : 0
Assignment Total       : 0
Assignment Average     : 0.00
Assignment Status      : NEEDS IMPROVEMENT
Semester Clearance     : ACTION REQUIRED
```

Expected failed condition:

```text
- No valid assignment score was entered.
```

The program must not divide by zero.

### Test Case 7: Ten-percent scholarship

Use:

| Field | Value |
|---|---:|
| Course | MCA |
| Base semester fee | ₹45,000 |
| Percentage | 88% |
| Attendance | 90% |
| Academic criteria | Passed |

Expected result:

```text
Scholarship Percentage : 10%
Scholarship Amount     : ₹4500.00
Final Payable Fee      : ₹40500.00
```

### Test Case 8: Invalid input re-entry

Input and expected validation:

```text
Enter age: 10
Invalid age. Enter a value between 15 and 35.
Enter age: 20
Age accepted.

Enter course choice: 8
Invalid course choice. Select a value from 1 to 5.
Enter course choice: 1
Course selected: BCA

Enter Java marks: 110
Invalid marks. Enter a value between 0 and 100.
Enter Java marks: 75
Java marks accepted.

Enter total classes conducted: 0
Invalid value. Total classes must be between 1 and 300.
Enter total classes conducted: 100

Enter classes attended: 120
Invalid attendance. Attended classes cannot exceed 100.
Enter classes attended: 80
Attendance accepted.
```

## 11. Required Project Documentation

The submitted `README.md` must contain:

1. Project title
2. Problem statement
3. Features
4. Concepts used
5. Input details
6. Validation rules
7. Academic-result rules
8. Attendance rules
9. Assignment rules
10. Scholarship and fee rules
11. Final-clearance rules
12. Pseudocode
13. Test cases
14. Sample input and output
15. Screenshots or copied console outputs of completed tests

Also include this short technical explanation:

> The JDK is used to develop and compile the Java program. The Java compiler converts source code into bytecode. The JRE provides the environment required to run the program. The JVM executes the generated bytecode. The same bytecode can run on different operating systems that have a compatible JVM, making Java platform-independent.

## 12. Repository Structure

Create the repository using this exact structure:

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

Students may add `test-case-6.txt`, `test-case-7.txt` and `test-case-8.txt` when all optional tests are executed.

## 13. Submission Instructions

1. Create a public GitHub repository named `Third-PRD`.
2. Follow the required repository structure exactly.
3. Write the complete program in `src/Main.java`.
4. Write the pseudocode in `pseudocode/pseudocode.txt` before completing the Java program.
5. Execute at least five test cases.
6. Copy each test result into a separate file inside the `output` folder.
7. Update the project `README.md` with the completed project details.
8. Verify that the program compiles and runs without errors.
9. Submit the GitHub repository URL using the instructed submission channel.

## 14. Student Coding Guidelines

- Understand every requirement before writing code.
- Write the pseudocode first.
- Use your own meaningful variable names.
- Keep the output aligned and readable.
- Add short comments only where the logic needs explanation.
- Do not copy another student's program.
- Do not paste generated code without understanding it.
- Test each module before combining the complete program.
- Do not use concepts listed under “Concepts not allowed.”
- Do not include real personal, financial or confidential information in test data.

## 15. Acceptance Criteria

The project is complete only when all the following conditions are satisfied:

- [ ] The program uses `Scanner` for runtime input.
- [ ] Full name and career goal accept spaces correctly.
- [ ] The pending newline before `nextLine()` is handled.
- [ ] Age is validated from 15 to 35.
- [ ] Course choice is validated from 1 to 5.
- [ ] A `switch` statement assigns the course name and fee.
- [ ] Semester is validated from 1 to 8.
- [ ] Five subject marks are stored in separate variables.
- [ ] Every subject mark is validated from 0 to 100.
- [ ] Total marks are calculated out of 500.
- [ ] Percentage uses decimal division and explicit casting.
- [ ] Percentage is displayed with two decimal places.
- [ ] Every subject must have at least 35 marks.
- [ ] A high percentage does not hide a failed subject.
- [ ] Grade is calculated using an `if-else-if` ladder.
- [ ] Attendance percentage is calculated correctly.
- [ ] Attended classes cannot exceed conducted classes.
- [ ] Attendance status uses a ternary operator.
- [ ] Assignment entries are processed using a `for` loop.
- [ ] Invalid assignment scores use `continue`.
- [ ] Assignment input `-1` uses `break`.
- [ ] The program safely handles zero valid assignments.
- [ ] Scholarship rules are calculated correctly.
- [ ] Fee balance and fee status are calculated correctly.
- [ ] Fee status uses a ternary operator.
- [ ] Final clearance checks academics, attendance, assignments and fees.
- [ ] Final clearance uses a ternary operator.
- [ ] Every failed condition is displayed separately.
- [ ] Relevant recommendations are displayed.
- [ ] Monetary values use two decimal places.
- [ ] A `do-while` loop allows another student to be processed.
- [ ] At least five test cases are executed and saved.
- [ ] No arrays, collections, user-defined methods or advanced concepts are used.
- [ ] The output is clearly aligned and readable.

## 16. Final Expected Outcome

After completing this project, the learner will have built a complete beginner-level Student Management System using only core Java fundamentals.

The final application should demonstrate that the learner can collect data, validate input, apply business rules, perform calculations, control program flow and generate a meaningful real-world report.
