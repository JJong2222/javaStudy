package org.java.loop;

public class ForEx3 {
	public static void main(String[] args) {
		System.out.println("1부터 100까지 짝수를 출력해보세요(for)");

		for (int i = 2; i <= 100; i += 2) {
			System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		System.out.println("===========");

		for (int i = 2; i <= 100; i = i + 2) {
			System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		System.out.println("===========");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}
		System.out.println("===========");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 1)
				System.out.print(i + " ");
			if (i % 10 == 0)
				System.out.println();
		}

		System.out.println("1부터 100까지 짝수의 합을 출력(for)");
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("짝수의 합(1~100):"+ sum);
	}
}
