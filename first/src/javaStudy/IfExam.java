package javaStudy;

public class IfExam {

	public static void main(String[] args) {
		int x = 50;
		int y = 60;
		
		if(x < y) {
			// x < y 가 조건
			// x < y 가 true 일 때 이 if 문이 실행된다.
			System.out.println("x 는 y 보다 작습니다.");
			// 조건이 true 이기 때문에 "x는 y 보다 작습니다." 출력
		}
		if(x > y) {
			System.out.println("x는 y보다 작습니다.");
		}
		// 조건이 false 이기 때문에 if 문이 실행되지 않는다.
		
		if(x == y) {
			System.out.println("x는 y와 같습니다.");
			// 조건이 false 이기 때문에 if 문이 실행되지 않는다.
		}else {
			System.out.println("x와 y는 다릅니다.");
			// else 조건이 true 이기 때문에 else 문이 실행된다.
		}
		
		if(x == y) {
			System.out.println("x와 y는 같습니다.");
		}else if(x < y) {
			System.out.println("x는 y보다 작습니다.");
		}else {
			System.out.println("x는 y와 다릅니다.");
		}
		// x < y만 true이기 때문에 "x는 y보다 작습니다"가 출력된다.
	}

}











