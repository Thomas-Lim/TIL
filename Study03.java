/* if, else, else if 사용
 * 이에 다른 중괄호 사용
 * 그리고 and &&, or || 연산자 사용 */

public class Study03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "잘생겻다";
		
		if(aa == "못생겼다") { // 만약에 () 라면 중괄호 {} 내부를 실행
			System.out.print("정답입니다");
		}  // 중괄호
		//else { // if문에서 제외된 모든 상황을 가져옴.
		//	System.out.print("아닙니다 잘생겼어요.");
		//}
		
		else if (aa == "진생겻다") {  // 중괄호
			System.out.print("정답입니다.");  
		} // 중괄호
		else if (aa == "질생겻다") {  // 중괄호
			System.out.print("정답입니다.");  
		} // 중괄호
		else if (aa == "즐생겻다") {  // 중괄호
			System.out.print("정답입니다.");  
		} // 중괄호
		else if (aa == "잘생겻다") {  // 중괄호
			System.out.println("정답입니다.");  
		} // 중괄호
		
		
		int a = 1;
		
		if(a == 0) {
			System.out.println("a는 0 입니다.");
		} else if(a == 1) {
			System.out.println("a는 1 입니다.");
		}
		
		
		
		// and 연산자, or 연산자
		if(a == 0 && a == 1) { // and 연산자 사용. 둘 다 일치해야 함.
			System.out.println("TEST");
		}
		
		if(a == 0||a == 1) { // OR연산자. 둘 중 하나라도 일치해야 함.
			System.out.println("TEST2");
		}
		
	}

}
