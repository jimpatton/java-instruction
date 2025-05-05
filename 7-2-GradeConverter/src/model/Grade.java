package model;

public class Grade {
	
	private int grade;
	private String letterGrade;
	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getLetterGrade() {
		return letterGrade;
	}
	public void setLetterGrade(String letterGrade) {
		this.letterGrade = letterGrade;
	}
	
	public static String getLetterGrade(int grade) 
	{
		String letterGrade;
		if (grade >= 88) 
		{
			letterGrade = "A";
		}
		else if (grade >= 80) 
		{
			letterGrade ="B";
		}
		else if (grade >= 68) 
		{
			letterGrade = "C";
		}
		else if (grade >= 60) 
		{
			letterGrade = "D";
		}
		else 
		{
			letterGrade = "F";
		}
		return letterGrade;
	}
	

}
