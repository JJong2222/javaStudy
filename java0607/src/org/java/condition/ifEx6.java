package org.java.condition;

import java.util.Scanner;

public class ifEx6 {
	public static void main(String[] args) {
		System.out.println("���ǹ� if");

		Scanner scn = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int i1 = scn.nextInt();

		if (i1 >= 90) {
			if (i1 >= 95) {
				System.out.println("����� :" + "A+" + "�Դϴ�");
			} else {
				System.out.println("����� :" + "A" + "�Դϴ�");
			}
		} else if (i1 >= 80) {
			if (i1 >= 85) {
				System.out.println("����� :" + "B+" + "�Դϴ�");
			} else {
				System.out.println("����� :" + "B" + "�Դϴ�");
			}
		}

		else if (i1 >= 70) {
			if (i1 >= 75) {
				System.out.println("����� :" + "C+" + "�Դϴ�");
			} else {
				System.out.println("����� :" + "C" + "�Դϴ�");
			}
		} else if (i1 >= 60) {
			if (i1 >= 65) {
				System.out.println("����� :" + "D+" + "�Դϴ�");
			} else {
				System.out.println("����� :" + "D" + "�Դϴ�");
			}
		} else {
			System.out.println("����� :" + "F" + "�Դϴ�");
		}
	}
}
