package org.java.condition;

import java.util.Scanner;

public class SwitchEx2 {
	public static void main(String[] args) {

		System.out.println("switch�� 2");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("���ĺ��� �Է��ϼ���");

		String ch = scn.nextLine();
		switch (ch) {
		case "A":
		case "a":
			System.out.println("A�Դϴ�");
			break;
		case "B":
		case "b":
			System.out.println("B�Դϴ�");
			break;
		case "C":
		case "c":
			System.out.println("C�Դϴ�");
			break;
		default:
			System.out.println("A,B,C�̿��� ���ĺ��Դϴ�");
		}
	}
}
