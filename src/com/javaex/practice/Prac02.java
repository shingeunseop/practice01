package com.javaex.practice;

import java.util.Scanner;

public class Prac02 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=sc.nextInt();
		for(int j=1;j<=i; j++) {
			for(char k=1;k<=j;k++) {
				System.out.print(j);
				
			}
			System.out.println("");
			
		}
		sc.close();
		

	}

}
