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
public class Person {
    //Instance Fields
   // You need not use these names, but you must use these types
   String firstName;
   String lastName;
   String ssn;

//Constructors
   // Default -  Sets last name, first name and ssn to "unknown"
  Person() {
     firstName = "unknown";
     lastName = "unknown";
     ssn = "unknown";
  }
  

   // Three string parameters are first name, last name and ssn
   // Be certain that the parameters are in that order
   Person ( String fn, String ln , String social) {
       firstName = fn;
       lastName = ln;
       ssn = social;
   }

//Methods
   // Sets the person's first name, last name and ssn
   // Be certain that the parameters are in that order
    void setAttributes( String fn, String ln, String social ) {
       firstName = fn;
       lastName = ln;
       ssn = social;
       
   }

   // Returns a String containing the person’s first name
   String getFirstName() {
       return firstName;
   }

   // Returns a String containing the person’s last name
   String getLastName() {
       return lastName;
   }

   // Returns a String containing the person’s ssn
   String getSSN() {
       return ssn;
   }

   // This method is a member of the Comparable interface.
   //  Briefly, it compares the parameter Object to this object
   // and decides whether this object is less than, equal to or greater than
   // the parameter Object. It then returns an integer indicating the 
   // outcome of that comparison. The possible values for the return value
   // are a negative value, zero or a positive value.
   //
   // There are several things to consider here. First of all we need a policy.
   // This method is going to be used to assist in getting persons into
   // alphabetical order, so the policy will be that this method will 
   // look at both last name and first name when comparing persons. It
   // will not look at ssn. The first names need be  
   // compared only if the last names are the same. Remember that case
   // matters.  If ASCII codes are used to compare Strings, all uppercase
   // characters come before all lowercase characters.
   //    ASCII --- 'A' = 65, 'Z' = 90, 'a' = 97
   // (ex.   Zac comes before alice alphabetically)
   //
   // One option would be to convert all names to the same case for 
   // purposes of comparison. In this project we will simply assume that
   // all names are supplied correctly (always dangerous) and compare them
   // as is. (Let "Zac" come before "al" )
   // Finally, remember to indicate that Person implements the
   // comparable interface in your class declaration statement and
   // be sure that your parameter type is Object and not Student
   public int compareTo( Object o )
   {
       int val=0;
       if(!(lastName.equals(((Person)o).getLastName())))
           val=-1;
       else if(lastName.equals(((Person)o).getLastName()))
       {
           if(firstName.equals(((Person)o).getFirstName()))
               val=0;
           else
               val=1;
       }
           return val;
   }

   // Returns a boolean indicating whether the parameter Object is equal to 
   // this object
   // Note: the policy will be that two persons with the same ssn are duplicates
   // even if the names are different
   public boolean equals( Object p)
   {
       return((Person)p).getSSN().equals(ssn);
   }

   // Returns a String containing the person’s information
   // Use roughly the format shown below. You need not count spaces and make
   // everything line up perfectly. You might use a tab character to
   // separate the first name and the ssn.
  public String toString()
      // Here is the desired format
      // Smith, Julie   123-45-6789
   {
       return "Name: " + getLastName() + "\n" + getFirstName() + getSSN() ;
   }


}
