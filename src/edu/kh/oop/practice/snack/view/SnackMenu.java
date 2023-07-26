package edu.kh.oop.practice.snack.view;

import java.util.Scanner;

import edu.kh.oop.practice.snack.controller.SnackController;

public class SnackMenu {
	
	Scanner sc = new Scanner(System.in);
	
	SnackController scr = new SnackController();
	
	public void menu() {
		
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String input1 = sc.next();
		
		System.out.print("이름 : ");
		String input2 = sc.next();
		
		System.out.print("맛 : ");
		String input3 = sc.next();
		
		System.out.print("개수 : ");
		int input4 = sc.nextInt();
		
		System.out.print("가격 : ");
		int input5 = sc.nextInt();
		
		System.out.println(scr.saveData(input1, input2, input3, input4, input5));
		
		System.out.print("저장한 정보를 확인하시겠습니까?(y/n) : ");
		char input6 = sc.next().charAt(0);
		
		
		if(input6 == 'y') {
			System.out.println(scr.confirmData());
		}
	}

}
