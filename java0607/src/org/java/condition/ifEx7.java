package org.java.condition;

public class ifEx7 {
	public static void main(String[] args) {

		int num1 = 10;

		if (num1 > 10) {
			System.out.println("10���� Ů�ϴ�.");
		}

		if (num1 > 10) {
			System.out.println("10���� Ů�ϴ�.");
		} else {
			System.out.println("10���� ũ���ʽ��ϴ�.");
		}
		System.out.println("============");

		if (num1 > 10)
			System.out.println("10���� Ů�ϴ�.");
		else
			System.out.println("10���� ũ�� �ʽ��ϴ�.");

		System.out.println("==========");
		if (num1 > 10) {
			System.out.println("10���� Ů�ϴ�.");
		} else if (num1 > 0) {
			System.out.println("0���� Ů�ϴ�");
		} else {
			System.out.println("0���� ũ���ʽ��ϴ�.");
		}

		System.out.println("java2022".charAt(0));// ���ڿ�0����
		System.out.println("java2022".charAt(1));// ���ڿ�1����
		System.out.println("java2022".charAt(2));// ���ڿ�2����
		System.out.println("java2022".charAt(3));// ���ڿ�3����
		System.out.println("java2022".charAt(4));// ���ڿ�4����

	}
}
