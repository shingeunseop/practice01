package com.javaex.practice;

import java.util.Scanner;

public class Prac06 {

	public static void main(String[] args) {
		int total=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
		int i=sc.nextInt();
		while(true) {
			total=total+i;
			i=i-2;
			if(i<0)
				break;
		}
		System.out.println("�����:"+total);
		sc.close();

	}
	

}
