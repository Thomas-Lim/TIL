import java.util.Scanner;

public class whileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner�� ���ڳ� ���� ���� �Է¹��� �� �ֵ��� ��
		Scanner sc = new Scanner(System.in);  
		
		int i = sc.nextInt(); // ����.nextInt(); �� ���ڰ� �Է� ����
		
		// int i = 0;         // 0���� ����
		while(i<10) {      // 10���� ���� �� ���� �ְ�
			System.out.println(i);   //10���� ���� �� ���� �ϳ��� �����.
			i++;          // �׸��� ����
		}
	}

}
