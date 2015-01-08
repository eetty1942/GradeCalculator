package com.maple.grade;

public class Calculator {
	
	String temp_grade;
	int sum =0;
	int averagevalue = 0;

	public String grade(int score){
		
		if(score >=90)
			temp_grade = "A";
		else if(score >= 80)
			temp_grade = "B";
		else if(score >= 70)
			temp_grade = "C";
		else if(score >= 60)
			temp_grade = "D";
		else
			temp_grade = "F";
		
		return temp_grade;
	}
	public float average(int score, int count){
		//int sum =0;
		//int averagevalue = 0;
		sum = sum+score;
		averagevalue = sum/count;
		return averagevalue;
	}
		
}
