package org.java.condition;

import java.util.Scanner;

public class SwitchEx7 {

	public static void main(String[] args) {

		System.out.println("�������� �Է��ϼ���");

		Scanner scn = new Scanner(System.in);
		String str = scn.next();

		switch (str) {
		case "insert":
			System.out.println("ȸ������ �������� �̵��մϴ�");
			break;
		case "update":
			System.out.println("ȸ������ �������� �̵��մϴ�");
			break;
		case "select":
			System.out.println("ȸ����ȸ �������� �̵��մϴ�");
			break;
		case "delete":
			System.out.println("ȸ��Ż�� �������� �̵��մϴ�");
			break;
		default:
			System.out.println("������ �Է� ����");

		}

	}
}