package org.java.loop;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		System.out.println("For��");
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "���Դϴ�.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		// 9�ܺ��� 2�ܱ��� �������� ���, for
		// 9*9 ~ 2*1 , ���� i--
		for (int x = 9; x > 1; x--) {
			System.out.println(x + "���Դϴ�.");
			for (int y = 9; y > 0; y--) {
				System.out.println(x + " * " + y + " = " + (x * y));
			}
		}

		System.out.println("==========");

		// Scanner Ŭ���� �̿��ؼ� ���۴��� �Է¹޾Ƽ� �������� �Է´�~9�ܱ��� ���

		Scanner scn = new Scanner(System.in);
		System.out.println("���� �Է��ϼ���");
		int i1 = scn.nextInt();

		System.out.println("������ �Է��ϼ���");
		int q = scn.nextInt();

		System.out.println(i1 + " " + q);
		if (i1 > q) {
			System.out.println("���۴��� ���ܺ��� ũ�ų� ���ƾߵ˴ϴ�");
		} else {
			for (int i = i1; i <= q; i++) {
				System.out.println(i1 + "���Դϴ�.");
				for (int z = 1; z < 10; z++) {
					System.out.println(i + " * " + z + " = " + (i * z));
				}
			}
		}
	}
}
