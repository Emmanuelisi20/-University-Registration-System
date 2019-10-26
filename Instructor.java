/*In this project you will write five classes. The first will be a class that represents a person.
The second will be a class that represents a college student. The third will an instructor.
The fourth class will simulate a class membership list. The fifth will be a test class to
verify exhaustively the correctness of the other four classes; you should test at least once
for each method.
*/

public class Instructor {
	
	private String rank;

	private double salary;

	private static int ID = 10000;

	private int instructorID;

	public Instructor() {

	super();

	this.rank = "unknown";

	this.salary = 0;

	ID += 1;

	this.instructorID = ID;

	}

	public Instructor(String fName, String lName, String ssn, String rank) {

	super.setAttributes(fName, lName, ssn);

	this.rank = rank;

	ID++;

	this.instructorID = ID;

	if (this.rank.equalsIgnoreCase("Instructor")) {

	this.salary = 20000;

	} else if (this.rank.equalsIgnoreCase("Assistant")) {

	this.salary = 40000;

	} else if (this.rank.equalsIgnoreCase("Associate")) {

	this.salary = 60000;

	} else if (this.rank.equalsIgnoreCase("Professor")) {

	this.salary = 80000;

	} else {

	this.salary = 0;

	}

	}

	public void setAttributes(String fName, String lName, String SSN, String rank) {

	super.setAttributes(fName, lName, SSN);

	this.rank = rank;

	}

	public double getSalary() {

	return this.salary;

	}

	public int getID() {

	return this.instructorID;

	}

	public boolean equals(Object o) {

	if (o instanceof Instructor) {

	return this.instructorID == ((Instructor) o).getID();

	}

	return false;

	}

	public String toString() {

	return super.toString() + "\t" + this.rank + "\t" + this.salary;

	}

}
