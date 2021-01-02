package javaStudy;

public class OperatorExam {

	public static void main(String[] args) {
		// 단항 연산
		int i1 = -5;
		// - 는 부호연산자
		// 5 는 피연산자
		// 위의 코드는 하나의 부호연산자를 사용해본 것.
		int i2 = +i1;
		int i3 = -i1;
		
		System.out.println(i1);
		// -5 가 출력됨
		System.out.println(i2);
		// 그대로 -5가 출력됨
		System.out.println(i3);
		// -(-5)가 되기 때문에 5가 출력됨
		
		int i4 = ++i3;
		// 증감 연산자는 값의 앞, 뒤 모두에 붙을 수 있다.
		// ++i3 -> i3 = i3+1;
		// ++가 값의 앞에 붙어 있을 때에는 먼저 더하고 그 값을 i4에 넣어준다.
		
		System.out.println(i4);
		// i3의 값인 5에 1을 더한 6이 출력된다.
		System.out.println(i3);
		// i3에도 +1을 하라고 했기 때문에 6이 출력된다.
		int i5 = i3++;
		// i3 = i3 + 1;
		// ++가 값의 뒤에 붙어 있을 때에는 값을 먼저 넣어주고 더한다.
		System.out.println(i5);
		// i5 = 6이 출력된다. 
		System.out.println(i3);
		// i3 = 7이 출력된다.
		
		// 산술 연산
		int i = 5;
		int j = 2;
		
		System.out.println(i + j);
		// 7이 출력된다.
		System.out.println(i - j);
		// 3이 출력된다.
		System.out.println(i * j);
		// 10이 출력된다.
		System.out.println(i / j);
		// 2가 출력된다. -> 정수와 정수를 나눈 값에서 정수의 값만 나오는 것.
		// 수학에서의 답인 2.5를 얻기를 원하면 i 와 j 중 하나가 실수가 되어야 한다. (캐스팅 연산)
		System.out.println(i / (double) j);
		// 2.5가 출력된다.
		System.out.println(i % j);
		// 1이 출력된다.
	}

}












