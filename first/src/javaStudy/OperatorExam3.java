package javaStudy;

public class OperatorExam3 {

	public static void main(String[] args) {
		int a = 5;
		int b = 10;
		int c = 15;
		
		System.out.println(a - b * c);
		// -145가 출력됨
		System.out.println((a - b) * c);
		// -75가 출력됨
		
		System.out.println(a > 5 && b > 5);
		// > 비교연산자
		// && 논리연산자
		// a > 5 -> false 
		// b > 5 -> true
		// && (and) 이기 때문에 양쪽이 모두 true 여야만 true 이기 때문에 false
		// false가 출력
		System.out.println(a > 5 || b > 5);
		// ||의 경우 하나만 true 여도 true 이기 때문에 true
		// true가 출력
		
		System.out.println(++a - 5);
		// ++a가 먼저 수행 -> 6
		// 6 - 5 = 1 이 출력
		
		System.out.println(a);
		// a는 ++a가 되었기 때문에 6이 출력
		
		System.out.println(a++ - 5);
		// a - 5 = 1이 출력
		// 후에 a++가 되어 a는 7이 됨
		
		System.out.println(a);
		// 7이 출력
		
	}

}
