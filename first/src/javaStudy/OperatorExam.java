package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		// ���� ����
		int i1 = -5;
		// - �� ��ȣ������
		// 5 �� �ǿ�����
		// ���� �ڵ�� �ϳ��� ��ȣ�����ڸ� ����غ� ��.
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		// -5 �� ��µ�
		System.out.println(i2);
		// �״�� -5�� ��µ�
		System.out.println(i3);
		// -(-5)�� �Ǳ� ������ 5�� ��µ�
		
		int i4 = ++i3;
		// ���� �����ڴ� ���� ��, �� ��ο� ���� �� �ִ�.
		// ++i3 -> i3 = i3+1;
		// ++�� ���� �տ� �پ� ���� ������ ���� ���ϰ� �� ���� i4�� �־��ش�.
		
		System.out.println(i4);
		// i3�� ���� 5�� 1�� ���� 6�� ��µȴ�.
		System.out.println(i3);
		// i3���� +1�� �϶�� �߱� ������ 6�� ��µȴ�.
		int i5 = i3++;
		// i3 = i3 + 1;
		// ++�� ���� �ڿ� �پ� ���� ������ ���� ���� �־��ְ� ���Ѵ�.
		System.out.println(i5);
		// i5 = 6�� ��µȴ�. 
		System.out.println(i3);
		// i3 = 7�� ��µȴ�.
		
		// ��� ����
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		// 7�� ��µȴ�.
		System.out.println(i - j);
		// 3�� ��µȴ�.
		System.out.println(i * j);
		// 10�� ��µȴ�.
		System.out.println(i / j);
		// 2�� ��µȴ�. -> ������ ������ ���� ������ ������ ���� ������ ��.
		// ���п����� ���� 2.5�� ��⸦ ���ϸ� i �� j �� �ϳ��� �Ǽ��� �Ǿ�� �Ѵ�. (ĳ���� ����)
		System.out.println(i / (double) j);
		// 2.5�� ��µȴ�.
		System.out.println(i % j);
		// 1�� ��µȴ�.
	}

}












