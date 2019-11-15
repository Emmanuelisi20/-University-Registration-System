// Written By: Emmanuel Isidahomen
// CSDP 398: Programming Assignment 5 
// Date: November 13, 2019
// Compiler: jGRASP 2.0.1
// Purpose: To modify a class so that each object can print out 3 test scores and the avreage of the test scores.  


//********************************************************************
//  Student.java       Author: Emmanuel Isidahomebn
//
//  Represents a college student.
//********************************************************************
 
public class Student
{
   private String firstName, lastName;
   private Address homeAddress, schoolAddress;
   private int test1, test2, test3;
   private double averageScore; // retreives the average of the 3 test scores 

   //-----------------------------------------------------------------
   //  Constructor: Sets up this student with the specified values.
   //-----------------------------------------------------------------
   public Student(String first, String last, Address home,
                  Address school)
   {
      firstName = first;
      lastName = last;
      homeAddress = home;
      schoolAddress = school;
      test1 = test2 = test3 = 0; // the initial scores of the 3 tests from both students is set to 0 
   }
   
   
   public void setTestScore(int testNumber, int testScore)
      {
         if (testNumber == 1) 
            test1 = testScore; // test 1, followed by the test score
         else if (testNumber == 2)
            test2 = testScore; // test 2, followed by the test score 
         else
            test3 = testScore; // test 3, followed by the test score 
      }
 
 
   public int getTestScore(int testNumber)
      {
         if (testNumber == 1)
            return test1; // test 1, prints score of test 1
         else if (testNumber == 2)
            return test2; // test 2, prints score of test 2
         else
            return test3; // test 3, prints score of test 3 
      }
      
   public void average()
   {
      averageScore = (test1 + test2 + test3)/3;
      return; // calculates average of the 3 test scores by summing up the 3 test scores and dividing by 3 (the number of tests)
   }
   //-----------------------------------------------------------------
   //  Returns a string description of this Student object.
   //-----------------------------------------------------------------
   public String toString()
   {
      String result;

      result = firstName + " " + lastName + "\n"; // prints student's name 
      result += "Home Address:\n" + homeAddress + "\n"; // prints student's home address
      result += "School Address:\n" + schoolAddress + "\n"; // prints student's school address 
      result += "Test Scores:\n"; 
      result += "Test #1: " + test1 + "\n"; // prints test 1 score 
      result += "Test #2: " + test2 + "\n"; // prints test 2 score
      result += "Test #3: " + test3 + "\n"; // prints test 3 score 
      result += "Average Score: " + averageScore ; // prints average of the 3 tests for each student 
      
      return result;
   }
}
