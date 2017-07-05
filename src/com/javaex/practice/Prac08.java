package com.javaex.practice;

import java.util.Scanner;

public class Prac08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int balance=0;
		while(true) {
			System.out.println("---------------------------");
			System.out.println("  1.예금|2.출금|3.잔고|4.종료");
			System.out.println("---------------------------");
			
			
			System.out.print("선택>");
			int num=sc.nextInt();
			
			if(num==1) {
				System.out.println("예금액>");
				int money=sc.nextInt();
				balance=balance+money;
			}else if(num==2) {
				System.out.println("출금액>");
				int money1=sc.nextInt();
				balance=balance-money1;
			}else if(num==3) {
				System.out.print("잔액:");
				System.out.println(balance);
			}else if(num==4) {
				System.out.println("프로그램 종료");
				break;
			}else {
				System.out.println("다시 입력해 주세요.");
			}
				
			
		}
		sc.close();

	}

}
