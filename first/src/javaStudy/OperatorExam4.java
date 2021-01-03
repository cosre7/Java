package javaStudy;

public class OperatorExam4 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		boolean b3 = true;
		
		System.out.println(b1 && b2);
		// b2가 false 이기 때문에 false 가 출력된다.
		
		System.out.println(b1 && b3);
		// 둘 다 true 이기 때문에 true 가 출력된다.
		
		System.out.println(b1 || b2);
		// b1이 true 이기 때문에 true가 출력된다
		
		System.out.println(b1 || b3);
		// 둘 다 true 이기 때문에 true가 출력된다.
		
		System.out.println(b2 || b2);
		// 둘 다 false 이기 때문에 false가 출력된다.
		
		int score = 88;
		if(score <= 100 && score >= 70) {
			// score가 100 이하 이고 70 이상이면 true
			System.out.println("성공");
		}else {
			// 아니면 false
			System.out.println("실패");
		}
		// 88은 100 이하이고 70이상이기 때문에 true 이므로 "성공"이 출력된다.
		
		System.out.println(b1 ^ b3);
		// 두 값이 true로 같기 때문에 false가 출력된다.
		
		System.out.println(b1 ^ b2);
		// 두 값이 다르기 때문에 true가 출력된다.
		
		System.out.println(!b1);
		// b1의 반대인 false가 출력된다.
	}

}






















