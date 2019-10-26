/*In this project you will write five classes. The first will be a class that represents a person.
The second will be a class that represents a college student. The third will an instructor.
The fourth class will simulate a class membership list. The fifth will be a test class to
verify exhaustively the correctness of the other four classes; you should test at least once
for each method.
*/


/*The first will be a class that represents a person. */

public class Person {
	
	
	public String firstName;

	public String lastName;

	public String ssn;

	public Person() 
	
	// The person first and last name listed on here 
	{

	this.firstName="unknown";

	this.lastName="unknown";

	this.ssn="unknown";

	}

	public Person(String fName, String lName, String SSN) {

	this.firstName=fName;

	this.lastName=lName;

	this.ssn=SSN;

	}

	public void setAttributes(String fName, String lName, String SSN) {

	this.firstName=fName;

	this.lastName=lName;

	this.ssn=SSN;

	}

	public String getFirstName() {

	return this.firstName;

	}

	public String getLastName() {

	return this.lastName;

	}

	public String getSSN() {

	return this.ssn;

	}

	public int compareTo(Object o) 
	
	{

	if(o instanceof Person)
	
	{

	Person otherPerson = (Person)o;

	if(this.lastName.equals(otherPerson.getLastName())) 
	
	{

	return this.firstName.compareTo(otherPerson.getFirstName());

	}
	
	else
		
	{

	return this.lastName.compareTo(otherPerson.getLastName());

	}

	}

	return -1;

	}

	public boolean equals(Object o) 
	
	{

	if (o instanceof Person) 
	
	{

	return this.ssn.equals(((Person) o).getSSN());

	}

	return false;

	}

	public String toString() 
	
	{

	return this.lastName+", "+this.firstName+"\t "+this.ssn;

	}
	
}

