package org.java.varable2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		System.out.println("����,���");

		Scanner scn = new Scanner(System.in);

		System.out.println("�������� :");
		int kor = scn.nextInt();

		System.out.println("�������� :");
		int eng = scn.nextInt();

		System.out.println("�������� :");
		int math = scn.nextInt();

		/*
		 * int sum=kor+eng+math; 
		 * double avg=(double)sum/3;
		 * System.out.println("���� : "+sum); 
		 * System.out.println("��� : "+avg);
		 */

		System.out.println("���� :" + (kor + eng + math) + "��");
		System.out.println("��� :" + (kor + eng + math) / 3 + "��");

	}
}
