package edu.kh.array.practice;

import java.util.Scanner;

public class ArrayPractice {

	Scanner sc = new Scanner(System.in);
	
	
	/** 
	 * 실습문제 1
	 */
	public void practice1() {

		// 길이가 9인 배열을 선언 및 할당하고,
		int[] arr = new int[9];
		
		// 1부터 9까지의 값을 반복문을 이용하여
		// 순서대로 배열의 각 인덱스 요소에 대입
		for(int i=0 ; i<arr.length ; i++) {
			arr[i] = i+1;
		}
		
		
		
	}
	
	
	
	
}
