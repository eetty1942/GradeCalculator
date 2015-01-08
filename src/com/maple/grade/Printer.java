package com.maple.grade;

import java.io.*;
import java.util.ArrayList;

public class Printer {
	 
	public void print_grade(String final_grade){
		System.out.println("당신의 학점은 : "+final_grade+" 입니다.");	
	}
	
	public void print_average(float avg){
		System.out.println("당신의 평균 평점은 : "+avg+" 입니다.");	
	}
	
	public void print_text(ArrayList<Integer> score_list, float average, ArrayList<String> grade_list){
		FileWriter fw = null;
		File test = new File("D:\\winter_study\\GradeCaclulator\\src\\test.txt");
		
		try{
			fw = new FileWriter(test);
			
			for(int i=0; i < score_list.size(); i++){
				fw.write("\r\n");
				fw.write(score_list.get(i) + grade_list.get(i) + "\r\n");
			}
		
 			fw.write("평점 평균: " + average + "\r\n");
			fw.close();
		}catch(Exception e){
			
			System.out.println(e);
		}
	}

}
