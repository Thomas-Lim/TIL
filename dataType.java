
public class dataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자형
		char var1 = '홍'; // 따움표 1개. 보통 절약을 위해서 이걸로 씀
		String var2 = "호호호호호" ;// 따옴표 2개. 보통 이걸로 많이 선언함.
		
		// 숫자정수형
		byte var3 = -128;   // -128 ~ +127 까지.
		short var4 = -32768;   // -32768 ~ +32767 까지.
		int var5 = 99999999; // -21억 ~ +21억 까지
		long var6 = 999999999; // 8바이트 사용. 스트링과 비슷.
		
		// 숫자실수형
		float var7 = 0.5f; // 4바이트 사용해서 입력. 꼭 소숫점 뒤에 f를 넣어줘야 함.
		double var8 = 0.5;  // 실수 뒤 f 없어도 에러나지 않음.
		
		// 불리언 형(Y/N)
		boolean isStart = false; // true 또는 false만 입력하여 조건식에서 많이 사용.
		
		System.out.println(var1);
		System.out.println(var2);
		
		System.out.println(var3);
		System.out.println(var4);
		System.out.println(var5);
		System.out.println(var6);
		
		System.out.println(var7);
		System.out.println(var8);
		
		System.out.println(isStart);
	}

}
