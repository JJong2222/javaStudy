package org.java.operator;

public class OperatorEx3 {
	public static void main(String[] args) {
		System.out.println("��������");
		System.out.println("&& ��� ������ true�϶��� true");

		String userId = "m1111";
		String userPw = "b1111";

		System.out.println(userId == "m1111" && userPw == "b1111");
		System.out.println(userId == "m1111" && userPw == "21111");
		System.out.println(userId == "m1112" && userPw == "11111");
		System.out.println(userId == "m1112" && userPw == "21111");

		if (userId == "m1111" && userPw == "b1111") {
			System.out.println("�α��� ����");
		} else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���.");
		}

		System.out.println("|| �ϳ��̻��� ������ true�϶� true");

		// != id�� m1111�� �ƴϳ�? != pw�� b1111�� �ƴϳ�?
		if (userId != "m1111" || userPw != "b1111") {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ȯ���ϼ���.");
		} else {
			System.out.println("�α��� ����");
		}
	}
}