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

public class UniversityRegistrationSystem {

 /**
     */
    public static void main(String[] args)
    {
       //i need to create an instance of an object by calling the contructor(instiantiate it)
       //created instructor object 
     Instructor instructor1= new Instructor("Ken", "Anny", "255-89-6555", "instructor");
       
     // calls the toString method from the Instructor class
     System.out.println(instructor1.toString());
       
       //call setInstructor method on course and give it an instructor
       //create an instructor and pass it in to the setInstructor method as an argument
       Course course1= new Course ("computer Sceince", 0012);
       course1.setInstructor(instructor1); 
    
       //calls the toString method from Course class
       System.out.println(course1.toString());
       
       //Since i need multiple students for a course, i made multiple student objects
         Student student1= new Student("Emmanuel", "Isidahomen", "256-76-9899", "Senior");
        System.out.println(student1.toString());
        
        Student student2= new Student("Fita", "wared","251-06-9334", "Senior");
        System.out.println(student2.toString());
        
         Student student3= new Student("sam", "Connor", "265-45-9334", "freshman");
        System.out.println(student3.toString());
       
        Student student4= new Student("Milky", "Ash","332-56-7654", "jr");
        System.out.println(student4.toString());
        
        course1.setAttributes("courseName",2144,4);
        course1.addStudent(student1);
        course1.addStudent(student2);
        course1.addStudent(student3);
        course1.addStudent(student4);
       
    }
    
}
