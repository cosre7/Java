package javaStudy;

public class IfExam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
		if(x < y) {
			// x < y �� ����
			// x < y �� true �� �� �� if ���� ����ȴ�.
			System.out.println("x �� y ���� �۽��ϴ�.");
			// ������ true �̱� ������ "x�� y ���� �۽��ϴ�." ���
		}
		if(x > y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		}
		// ������ false �̱� ������ if ���� ������� �ʴ´�.
		
		if(x == y) {
			System.out.println("x�� y�� �����ϴ�.");
			// ������ false �̱� ������ if ���� ������� �ʴ´�.
		}else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
			// else ������ true �̱� ������ else ���� ����ȴ�.
		}
		
		if(x == y) {
			System.out.println("x�� y�� �����ϴ�.");
		}else if(x < y) {
			System.out.println("x�� y���� �۽��ϴ�.");
		}else {
			System.out.println("x�� y�� �ٸ��ϴ�.");
		}
		// x < y�� true�̱� ������ "x�� y���� �۽��ϴ�"�� ��µȴ�.
	}

}











