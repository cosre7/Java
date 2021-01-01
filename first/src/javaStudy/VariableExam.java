package javaStudy;

public class VariableExam {

	public static void main(String[] args) {
		// 변수 선언하기
		// 맨 앞쪽에 나오는 것이 어떠한 종류 (type) 의 값을 담을 것인지를 정하는 것.
		// type 의 뒤에 나오는 것이 변수의 이름
		// type 은 정해진 것을 사용해야 하고, 이름의 경우 마음껏 사용.
		int count;
		// int 를 담을 수 있는 count 라는 그릇
		// 여기서 int 는 정수
		// -> count 라는 그릇에는 정수만 담길 수 있다는 뜻.
		
		count = 10;
		// count에 10이라는 값을 담은 것
		
		count = 20;
		// 변수이기 때문에 count 라는 그릇에 10, 20 등 여러 음식을 담을 수 있다.
		
		System.out.println(count);
		// count 안에 들어있는 음식을 확인하기 위해 print
		
		// 여러 값들을 담을 수 있지만 마지막엔 하나의 값만 남는다.
		
//		count = 11.1;
		// 정수가 아닌 11.1을 정수를 담는 그릇인 count에 담게 되면
		// 컴파일에러가 발생한다.
		
		double avg = 11.1;
		// 실수를 담을 수 있는 double 타입에 avg 변수 그릇
		// 실수인 11.1 을 담기 위해서는 double을 사용하여야 한다.
		
		String name = "carami";
		// 글자를 담을 수 있는 String 타입
		
		// 변수의 이름을 지을 때 규칙
		//  1. 첫글자가 소문자
		//  2. 두 개 이상의 단어를 쓰고자 할 때에는 반드시 두번째 단어의 첫글자를 대문자로
		int totalCount;
		// -> 어떠한 글자인지 식별이 가능하도록 해준다.
	}

}
