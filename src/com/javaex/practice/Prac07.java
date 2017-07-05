package com.javaex.practice;

import java.util.Scanner;

public class Prac07 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("=========================");
		System.out.println("      [숫자맞추기게임 시작]");
		System.out.println("=========================");
		int num=(int)(Math.random()*100)+1;
		
		while(true) {
			
			System.out.print(">>");
			int i=sc.nextInt();
			if(num>i) {
				System.out.println("더 높게");
				continue;
			}else if(num<i) {
				System.out.println("더 낮게");
				continue;
			}else {
				System.out.println("맞았습니다.");				
				System.out.print("게임을 종료하시겠습니까?(y/n)>>");
				String ch = sc.next();
				
				if("y".equals(ch)) {
					System.out.println("=========================");
					System.out.println("      [숫자맞추기게임 종료]");
					System.out.println("=========================");
					break;
				}
			}
		
			
		}

		sc.close();
		
	}

}
