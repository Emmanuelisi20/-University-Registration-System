// Group Project
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

//universityregistrationsystem;

/**
 * Emmanuel Isidahomen
 */
public class Course {
   // Course Class

//Instance Fields
   // You need not use these names, but you must use these types
   
   String courseName;
   int room;
   Instructor instructor;
   int numberStudents;
   Student [] studentList;
   int studentsAdded;
//Constructors
   // Default -  set the name to "unknown", the room number to 0,
   //         the number of students to zero and the instructor will be set
   //         to "unknown"    
   Course()
   {
       
       
       courseName="unknown";
       room=0;
       numberStudents=0;
         //instructor will be set
   //         to "unknown"    
   }

   // sets the name, the room number for the course. Number of students will
   // be set to zero and the instructor will be set to "unknown"
   Course( String cn, int rn)
   {
      
       courseName=cn;
       room=rn;
       numberStudents=0;
      instructor= null; //instructor to "uknown"
   }

//Methods
   // Sets the course name, room number and number of students. Be certain
   // that the parameters are in that order. Initializes the size of the array
   // to hold 30 students. Note that it is empty at this point.
   void setAttributes( String cn, int rn, int ns )
   {
       courseName=cn;
       room=rn;
       numberStudents=ns;
       studentList = new Student[30];
       
   }

   // Returns the instructor assigned to this course
 Instructor getInstructor()
   {
       return instructor;
   }
   
   // Assigns an instructor to the course
   void setInstructor( Instructor newInstructor )
   {
       instructor=newInstructor;
   }

   // Returns the name of this course
   String getCourseName()
   {
       return courseName;
   }
   // Assigns new name to the course
   void setCourseName( String newCourse)
   {
       courseName=newCourse;
   }

   // Returns the room number assigned to this course
   int getRoomNumber()
   {
       return room;
   }

   // Assigns a room number to the course
   void setRoomNumber( int newRoom)
   {
       room=newRoom;
   }

   // Adds a student to the course
   void addStudent(Student student)   
   {
       studentList[studentsAdded]=student;
       studentsAdded++;
   }

   // Sorts all the students in the course
   void sortStudents()  
   {
       int n= studentList.length;
       for (int i=0;i<n-1;i++)
           for(int j=0;j<n-i-1;j++)
               if(studentList[j].compareTo(studentList[j +1])>0)
                       {
                          Student temp=studentList[j];
                           studentList[j]=studentList[j+1];
                           studentList[j+1]=temp;
                       }
   }

   // Returns a boolean indicating whether the parameter Object is equal to 
   // this object
   // Note: the policy will be that courses with the same name and the same
   // instructor are duplicates even if the student in the course are different
   public boolean equals( Object obj)
   {
      Course course=(Course)obj;
       if (course.getCourseName().equals(courseName)&& course.getInstructor().equals(instructor))
           return true;
       else
           return false;
               
	
            
   }

   // Returns a String containing the studentís information
   // Use roughly the format shown below. You need not count spaces 
   // and make everything line up perfectly
   public String toString()
   {
      String finalString="";
      for(int i=0; i<52; i++)
      {
          finalString+="+";
      }
      finalString+="\n";
      finalString+="course:"+ courseName+ " Room:" + room +"\n";
      finalString+="Instructor:" + instructor.getLastName() + ","+instructor.getFirstName()+","+instructor.getSSN() + " " + instructor.getRank() + " "
				+ instructor.getSalary() + "\n";
       
		for (int i = 0; i < 52; i++) {
			finalString += "+";
		}

		finalString += "\nStudents:\n";
		for (int j = 0; j < numberStudents; j++) {
			finalString += studentList[j].getLastName() + ", "
					+ studentList[j].getFirstName() + " "
					+ studentList[j].getSSN() + " " + studentList[j].getYear()
					+ " " + studentList[j].getID() + "\n";
		}
       return finalString;

	}
}
