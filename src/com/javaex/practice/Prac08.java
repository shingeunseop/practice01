package com.javaex.practice;

import java.util.Scanner;

public class Prac08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=0;
		while(true) {
			System.out.println("---------------------------");
			System.out.println("  1.����|2.���|3.�ܰ�|4.����");
			System.out.println("---------------------------");
			
			
			System.out.print("����>");
			int num=sc.nextInt();
			
			if(num==1) {
				System.out.println("���ݾ�>");
				int money=sc.nextInt();
				balance=balance+money;
			}else if(num==2) {
				System.out.println("��ݾ�>");
				int money1=sc.nextInt();
				balance=balance-money1;
			}else if(num==3) {
				System.out.print("�ܾ�:");
				System.out.println(balance);
			}else if(num==4) {
				System.out.println("���α׷� ����");
				break;
			}else {
				System.out.println("�ٽ� �Է��� �ּ���.");
			}
				
			
		}
		sc.close();

	}

}
