package org.java.condition;

import java.util.Scanner;

public class ifEx5 {
	public static void main(String[] args) {
		System.out.println("������ ������");

		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int i1 = scn.nextInt();

		if (i1 >= 90) {
			System.out.println("����� :" + "A" + "�Դϴ�");
		} else if (i1 >= 80) {
			System.out.println("����� :" + "B" + "�Դϴ�");
		} else if (i1 >= 70) {
			System.out.println("����� :" + "C" + "�Դϴ�");
		} else if (i1 >= 60) {
			System.out.println("����� :" + "D" + "�Դϴ�");
		} else {
			System.out.println("����� :" + "F" + "�Դϴ�");
		}

	}
}
