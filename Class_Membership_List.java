/*In this project you will write five classes. 
 *The first will be a class that represents a person. 
 *The second will be a class that represents a college student. The third will an instructor.
 *The fourth class will simulate a class membership list. 
 *The fifth will be a test class to verify exhaustively the correctness of the other four classes;
 * you should test at least once for each method.
*/


public class Class_Membership_List {
	
	private String courseName;

	private int room;

	private Instructor instructor;

	private int numberStudents;

	private College_Student[] College_StudentList;

	public Class_Membership_List() {

	this.courseName = "unknown";

	this.room = 0;

	this.numberStudents = 0;

	this.instructor = new Instructor();

	}

	public Class_Membership_List(String name, int roomNo) {

	this.courseName = name;

	this.room = roomNo;

	this.numberStudents = 0;

	this.instructor = new Instructor();

	}

	public void setAttributes(String name, int room, int count) {

	this.courseName = name;

	this.room = room;

	this.numberStudents = count;

	}

	public Instructor getInstructor() {

	return this.instructor;

	}

	public void setInstructor(Instructor i) {

	this.instructor = i;

	}

	public String getCourseName() {

	return this.courseName;

	}

	public int getRoomNumber() {

	return this.room;

	}

	public void setRoomNumber(int room) {

	this.room = room;

	}

	public void addStudent(College_Student s) {

	if (College_StudentList == null) {

		College_StudentList = new College_Student[100];

		College_StudentList[numberStudents] = s;

	numberStudents++;

	}

	}

	public void sortStudents() {

	Arrays.sort(College_StudentList);

	}

	public boolean equals(Object c) {

	if (c instanceof Class_Membership_List) {

	Class_Membership_List temp = (Class_Membership_List) c;

	return this.courseName.equals(temp.getCourseName()) && this.instructor.equals(((Class_Membership_List) c).getInstructor());

	} else 
	
	{

	return false;

	}

	}

	public String toString() {

	String returnString = "";

	returnString = "Course: " + this.courseName + "\t" + "Room: " + this.room + "\n";

	returnString += instructor.toString()+"\n";

	for(College_Student student: this.College_StudentList) {

	returnString += student.toString()+"\n";

	}

	return returnString;

	}

}
