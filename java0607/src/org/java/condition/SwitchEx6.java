package org.java.condition;

import java.util.Scanner;

public class SwitchEx6 {
	public static void main(String[] args) {

		System.out.println("switch�� 3");

		Scanner scn = new Scanner(System.in);
		System.out.println("ù��° ����(����) �Է�");
		int num1 = scn.nextInt();

		System.out.println("�ι�° ����(����) �Է�");
		int num2 = scn.nextInt();

		System.out.println("���� ��ȣ�� �Է��ϼ���(+-*/)");
		char op = scn.next().charAt(0);

		int result = 0;

		switch (op) {
		case '+':
			result = (num1 + num2);
			break;
		case '-':
			result = (num1 - num2);
			break;
		case '*':
			result = (num1 * num2);
			break;
		case '/':
			result = (num1 % num2);
			break;
		default:
		}
		System.out.println("������ ��� : " + num1 + " " + op + " " + num2 + " = " + result);
	}
}