package javaStudy;

public class OperatorExam4 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		// b2�� false �̱� ������ false �� ��µȴ�.
		
		System.out.println(b1 && b3);
		// �� �� true �̱� ������ true �� ��µȴ�.
		
		System.out.println(b1 || b2);
		// b1�� true �̱� ������ true�� ��µȴ�
		
		System.out.println(b1 || b3);
		// �� �� true �̱� ������ true�� ��µȴ�.
		
		System.out.println(b2 || b2);
		// �� �� false �̱� ������ false�� ��µȴ�.
		
		int score = 88;
		if(score <= 100 && score >= 70) {
			// score�� 100 ���� �̰� 70 �̻��̸� true
			System.out.println("����");
		}else {
			// �ƴϸ� false
			System.out.println("����");
		}
		// 88�� 100 �����̰� 70�̻��̱� ������ true �̹Ƿ� "����"�� ��µȴ�.
		
		System.out.println(b1 ^ b3);
		// �� ���� true�� ���� ������ false�� ��µȴ�.
		
		System.out.println(b1 ^ b2);
		// �� ���� �ٸ��� ������ true�� ��µȴ�.
		
		System.out.println(!b1);
		// b1�� �ݴ��� false�� ��µȴ�.
	}

}






















