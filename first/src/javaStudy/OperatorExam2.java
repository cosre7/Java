package javaStudy;

public class OperatorExam2 {

	public static void main(String[] args) {
		int i = 10;
		int j = 10;
		// = 는 단순대입연산자
		
		// == 는 비교연산자
		System.out.println(i == j);
		// true가 출력
		System.out.println(i != j);
		// false가 출력
		System.out.println(i < j);
		// false가 출력
		System.out.println(i <= j);
		// true가 출력
		System.out.println(i > j);
		// false가 출력
		System.out.println(i >= j);
		// true가 출력
		
		i += 10; // i = i + 10;
		// += 는 복합 대입 연산자
		
		System.out.println(i);
		// 20이 출력
		System.out.println(i -= 5);
		// 15가 출력
		System.out.println(i);
		// 15가 출력
	}

}











