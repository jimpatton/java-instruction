package Model;

public class Student {
	public String lastName;
	public String firstName;
	public int score;
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student() {
		super();
	}
	public Student(String lastName, String firstName, int score) {
		super();
		this.lastName = lastName;
		this.firstName = firstName;
		this.score = score;
	}
	@Override
	public String toString() {
		return lastName + ", " + firstName + ": " + score ;
	}
	
	

}
