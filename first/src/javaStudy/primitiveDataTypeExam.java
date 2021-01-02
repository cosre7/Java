package javaStudy;

public class primitiveDataTypeExam {

	public static void main(String[] args) {
		boolean isFun = true;
		// boolean 은 논리형 데이터 타입 true/false
		System.out.println(isFun);
		// boolean은 true와 false의 값만 가질 수 있다.
		// 다른 값을 넣으면 오류가 생긴다
//		boolean isFun_2 = aaa;
		
		char c = 'f';
		// char는 문자타입이다.
		// char는 무조건 작음 따옴표' '를 사용해야 한다
		// char에는 문자 '하나'만 넣을 수 있다.
//		char d = 'ffff';
		// 문자 여러개가 들어가면 오류가 생긴다.
		
		int x = 59;
		// int: 타입
		// x: 변수
		// 59: 값(리터럴)
		
		long big = 3456789L;
		// int 보다 더 큰 정수값을 넣어주고 싶을 때에는 long을 사용한다.
		// long 의 경우 값을 적을 때 뒤에 소문자 l 이나 대문자 L을 적어야 한다.
		
		float f = 32.5f;
		// 실수값을 넣어주고 싶을 때에는 float 을 사용한다.
		// float 의 경우 값을 적을 때 뒤에 소문자 f나 대문자 F를 적어야 한다.
		
		double d = 23.34;
		// float 보다 더 큰 실수값을 넣어주고 싶을 때에는 double 을 사용한다.
	}

}
