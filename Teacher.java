//Group project 
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

//package universityregistrationsystem;

/**
 *
 * @Emmanuel Isidahomen
 */
 {
   // Instructor Class (a subclass of Person)

//Instance Fields
   // You need not use these names, but you must use these types

   // rank can be one of four values: instructor, assistant, associate or professor
   String rank;

   // the salary will depend on the rank of the instructor
   double salary;
   static int instructorID=0;
   
   // Note: The instructor id should be unique for each instructor and starts at 10000
   // The instructor id is not their ssn
   // Look at the definition for student for ideas on unique IDs.
   // But remember, this is a different id than the student id.
   int id;
   String firstName;
   String lastName;
   String ssn;


//Constructors
   // Default -  sets the salary to zero and sets rank to "unknown"
   //         -  Sets last name, first name and ssn to "unknown"
   Instructor()
   {
       super();// calls super class
       id=instructorID;
       instructorID++;
       salary=0;
       rank="uknown";
       
   }

   // Four string parameters are first name, last name, ssn and rank
   // Be certain that the parameters are in that order
   // This constructor should also assign salary based on rank
   // if the rank is      the salary is
   //    instructor           20,000
   //    assistant             40,000
   //    associate            60,000
   //    professor            80,000
   // creates an unique, consecutive id for the instructor
   Instructor( String fn, String ln, String social, String rk )
   {
       
       super(fn, ln, social);
           rank=rk;
        switch(rk)
        {
            case "instructor":
			salary = 20000;
			break;
		case "assistant":
			salary = 40000;
			break;
		case "associate":
			salary = 60000;
			break;
		case "professor":
			salary = 80000;
			break;
		default:
			salary = 0;
			break;   
         }
              id=instructorID;
              instructorID++;
   }

//Methods
   // Sets the instructor's first name, last name, ssn, rank and salary
   // Be certain that the parameters are in that order
   void setAttributes( String fn , String ln, String social , String rk )
   {
      
       firstName= fn;
       lastName=ln;
       ssn=social;
       rank=rk;
        
       switch (rk)
        {
            case "instructor":
			salary = 20000;
			break;
		case "assistant":
			salary = 40000;
			break;
		case "associate":
			salary = 60000;
			break;
		case "professor":
			salary = 80000;
			break;
		default:
			salary = 0;
			break;   
         }
   }

   // Returns an double containing the instructor's salary
  double getSalary()
  {
      return salary;
  }
  // Retuns an int containing the instructor's id
	int getID()
        {
		return id;
	}
  // Returns a string of the instructor's rank
	String getRank()
        {
		return rank;
	}
   // Returns a boolean indicating whether the parameter Object is equal to 
   // this object
   // Note: the policy will be that two instructors with the same ID are duplicates
   // even if the names are different
   public boolean equals( Object p )
   {
       Instructor instructor=(Instructor)p;
       if(instructor.getID()==id)
           return true;
       else
           return false;
   }

   // Returns a String containing the student information
   // Use roughly the format shown below. You need not count spaces 
   // and make everything line up perfectly, use tabs instead.
  public String toString()
      // here is the desired format
      //      Ken, isijah   123-45-6789   Instructor  20093.00
  {
      return lastName + ", " + firstName + "\t" + ssn + "\t" + rank + "\t" +
				salary;
  }
}
