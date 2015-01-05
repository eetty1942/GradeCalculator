package com.maple.grade;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int score = 0;
		char grade = 0;
		
		Scanner scan = new Scanner(System.in);
		Calculator cal = new Calculator();
		Printer print = new Printer();
		
		System.out.printf("학생의 점수 입력 : ");
		score = scan.nextInt();
		grade = cal.grade(score);
		print.print(grade);
		
		scan.close();
	}

}
