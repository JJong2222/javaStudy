package org.java.loop;

public class WhileEx1 {
	public static void main(String[] args) {
		System.out.println("While");
		
		
//		int num=0;
//		while(num<10) {
//			System.out.print(num+" ");
//		}
		
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("====================");
		
		int i = 0;
		
		while (i<10) {
			System.out.println(i);	
			i++;
		}
		
		System.out.println("====================");
		
		int i2=0;
		while(true) {
			System.out.print(i2);
			
			// if���� �̿��ؼ� 0~9������ ��µǰ�
			if(i2 >= 9) break;
			
			i2++;
			
		}
		
	}
}
