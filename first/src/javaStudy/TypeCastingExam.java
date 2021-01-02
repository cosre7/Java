package javaStudy;

public class TypeCastingExam {

	public static void main(String[] args) {
		int x = 50000;
		long y = x;
		// 작은 데이터타입인 int 에 담긴 값 50000을 큰 데이터타입인 long에 담을 때에는
		// 컴파일러에서 아무런 문제가 발생하지 않는다.
		// int x 에 있는 값이 long y로 들어갔기 때문에 형변환이 일어난 것이다.
		// 묵시적 형변환
		
		long x2 = 5;
//		int y2 = x2;
		// 큰 데이터타입인 long 에 담긴 값 5를 작은 데이터타입인 int 에 담을 때에는
		// 컴파일러에서 에러가 발생한다.
		// long x2에 담긴 값 5는 int y2에 충분히 담길 수 있는 값이지만 
		// 컴파일러 입장에서는 long의 값을 int에 담을 수 없기 때문에 일어나는 오류이다.
		int y2 = (int) x2;
		// long 데이터타입인 x2의 앞에 (int)라는 표시를 해주게 되면
		// 이 값을 int의 형태로 int y2에 담으라는 표현이 된다.
		// 때문에 오류가 사라지게 된다.
		// 강제(명시적) 형변환
		
		
	}

}
