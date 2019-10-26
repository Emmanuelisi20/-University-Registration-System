/*In this project you will write five classes. The first will be a class that represents a person.
The second will be a class that represents a college student. The third will an instructor.
The fourth class will simulate a class membership list. The fifth will be a test class to
verify exhaustively the correctness of the other four classes; you should test at least once
for each method.
*/
public class College_Student {

	
	private String year;

	private int studentID;

	private static int ID=1000;

	public College_Student() 
	
	{

	super();

	this.year = "unknown";

	ID++;

	this.studentID = ID;

	}

	public College_Student(String fName, String lName, String ssn, String year)
	{

	super.setAttributes(fName, lName, ssn);

	this.year = year;

	ID++;

	this.studentID = ID;

	}

	public void setAttributes(String fName, String lName, String SSN, String year) {

	super.setAttributes(fName, lName, SSN);

	this.year = year;

	}

	public int getID() {

	return this.studentID;

	}

	public boolean equals(Object o) {

	if (o instanceof College_Student) {

	return this.studentID == ((College_Student) o).getID();

	}

	return false;

	}

	public String toString() {

	return super.toString() + "\t" + this.year + "\t" + this.studentID;

	}
}


