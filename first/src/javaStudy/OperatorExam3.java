package javaStudy;

public class OperatorExam3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c);
		// -145�� ��µ�
		System.out.println((a - b) * c);
		// -75�� ��µ�
		
		System.out.println(a > 5 && b > 5);
		// > �񱳿�����
		// && ��������
		// a > 5 -> false 
		// b > 5 -> true
		// && (and) �̱� ������ ������ ��� true ���߸� true �̱� ������ false
		// false�� ���
		System.out.println(a > 5 || b > 5);
		// ||�� ��� �ϳ��� true ���� true �̱� ������ true
		// true�� ���
		
		System.out.println(++a - 5);
		// ++a�� ���� ���� -> 6
		// 6 - 5 = 1 �� ���
		
		System.out.println(a);
		// a�� ++a�� �Ǿ��� ������ 6�� ���
		
		System.out.println(a++ - 5);
		// a - 5 = 1�� ���
		// �Ŀ� a++�� �Ǿ� a�� 7�� ��
		
		System.out.println(a);
		// 7�� ���
		
	}

}
