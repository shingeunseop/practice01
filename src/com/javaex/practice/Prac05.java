package com.javaex.practice;

import java.util.Scanner;

public class Prac05 {

	public static void main(String[] args) {
		int a=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i=0; i<5; i++) {
			System.out.print("숫자: ");
			int b=sc.nextInt();
			if(b>a)
				a=b;
			
		}
		System.out.println(a);
		sc.close();
	

	}

}
