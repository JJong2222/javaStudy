package org.java.varable2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("if�� ����");

		System.out.println("����, ����, ���� ������ �Է�, ����, ��� ,����(���) ");
		// ��ĳ�� �̿��ؼ� if�� �̿�
		// ����,����,����(0~100����) , ����(����), ���(double)
		// ���(double)�� �̿��ؼ� ���� ���
		// 95�̻� A+ 90�̻� A

		Scanner scn = new Scanner(System.in);
		System.out.println("���������� �Է��ϼ���");
		int kor = scn.nextInt();

		System.out.println("���������� �Է��ϼ���");
		int eng = scn.nextInt();

		System.out.println("���������� �Է��ϼ���");
		int math = scn.nextInt();

		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);

		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("����� :" + "A+" + "�Դϴ�");
			} else {
				System.out.println("����� :" + "A" + "�Դϴ�");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("����� :" + "B+" + "�Դϴ�");

			} else {
				System.out.println("����� :" + "B" + "�Դϴ�");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("����� :" + "C+" + "�Դϴ�");
			} else {
				System.out.println("����� :" + "C" + "�Դϴ�");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("����� :" + "D+" + "�Դϴ�");
			} else {
				System.out.println("����� :" + "D" + "�Դϴ�");
			}

		} else {
			System.out.println("����� :" + "F" + "�Դϴ�");
		}
	}
}
