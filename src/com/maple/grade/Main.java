package com.maple.grade;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		int score = 0;
		String grade = null;
		int count = 0;
		float avg = 0;

		Scanner scan = new Scanner(System.in);
		Calculator cal = new Calculator();
		Printer print = new Printer();
		ArrayList<Integer> score_list = new ArrayList<Integer>();
		ArrayList<String> grade_list = new ArrayList<String>();

		while(true){
			System.out.printf("학생의 점수 입력 (루프 종료 원하면 100보다 큰 수 입력): ");
			score = scan.nextInt();
			
			if(score > 100)
				break;
			
			score_list.add(score);
			count++;
			
			grade = cal.grade(score);
			grade_list.add(grade);
			
			avg = cal.average(score, count);
			
			print.print_grade(grade);
			
		}
		//print.print_grade(grade);
		print.print_average(avg);

		scan.close();
	}

}
