package com.javaex.practice;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("      [���ڸ��߱���� ����]");
		System.out.println("=========================");
		int num=(int)(Math.random()*100)+1;
		
		while(true) {
			
			System.out.print(">>");
			int i=sc.nextInt();
			if(num>i) {
				System.out.println("�� ����");
				continue;
			}else if(num<i) {
				System.out.println("�� ����");
				continue;
			}else {
				System.out.println("�¾ҽ��ϴ�.");				
				System.out.print("������ �����Ͻðڽ��ϱ�?(y/n)>>");
				String ch = sc.next();
				
				if("y".equals(ch)) {
					System.out.println("=========================");
					System.out.println("      [���ڸ��߱���� ����]");
					System.out.println("=========================");
					break;
				}
			}
		
			
		}

		sc.close();
		
	}

}
