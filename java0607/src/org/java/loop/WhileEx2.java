package org.java.loop;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		System.out.println("While�� ������");
		
		int i=2;
		while(i<10) {
			System.out.println(i+"���Դϴ�.");
			
			int j=1;
			while(j<10) {
				System.out.println(i+"*"+j+"="+(i*j));
				j++;
			}
			i++;
		}
		System.out.println("==============");
		
		// ��ĳ�ʿ��� �Է´�(����)�� �̿��ؼ� �������� ���
		// ��)4�Է��ϸ� 4�ܺ��� 9�ܱ��� ���
		
//		System.out.println("���� �Է��ϼ���.");
//		Scanner scn=new Scanner(System.in);
//		int x = scn.nextInt();
//		
//		int i2=x;
//		while(i2<10) {
//			System.out.println(i2+"���Դϴ�.");
//			
//			int y=1;
//			while(y<10) {
//				System.out.println(i2+"*"+y+"="+(i2*y));
//				y++;
//			}
//		}
//		x++;
		
	}
}
