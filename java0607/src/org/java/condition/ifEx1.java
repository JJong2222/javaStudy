package org.java.condition;

import java.util.Scanner;

public class ifEx1 {
	public static void main(String[] args) {
		System.out.println("if��");

		// ������ true�� ���� ����
		System.out.println("������ �ϳ��� ��");

		int num1 = 10;
		if (num1 >= 10) {
			System.out.println("10���� ũ�ų� �����ϴ�");
		}
		if (num1 >= 10)
			System.out.println("10���� ũ�ų� �����ϴ�");
		if (num1 >= 10)
			System.out.println("10���� ũ�ų� �����ϴ�");

		Scanner scn = new Scanner(System.in);
		int key = scn.nextInt();
		if (key > 100) {
			System.out.println("100���� ũ��");
		}
		// Scanner ���̵� �Է��ؼ� ���̵� "root"�̸� "��ſ� ���εǼ���" ǥ��
		// if�� �ϳ��� �̿��ؼ� ���α׷� �غ���
		System.out.println("���̵� �Է�");
		String userId = scn.next();
		if (userId.equals("root"))
			System.out.println("��ſ� ���εǼ���");
	}

}
