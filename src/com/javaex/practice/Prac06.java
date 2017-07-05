package com.javaex.practice;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int i=sc.nextInt();
		while(true) {
			total=total+i;
			i=i-2;
			if(i<0)
				break;
		}
		System.out.println("결과값:"+total);
		sc.close();

	}
	

}
