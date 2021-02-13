import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		// Scanner는 숫자나 문자 등을 입력받을 수 있도록 함
		Scanner sc = new Scanner(System.in);  
		
		int i = sc.nextInt(); // 변수.nextInt(); 로 숫자값 입력 가능
		// int i = 0;         // 0으로 시작
		while(i<10) {      // 10보다 작을 때 까지 넣고
			System.out.println(i);   //10보다 작을  까지 하나씩 출력함.
			i++;          // 그리고 증가
		}
	}

}
