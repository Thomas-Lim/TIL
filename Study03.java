/* if, else, else if ���
 * �̿� �ٸ� �߰�ȣ ���
 * �׸��� and &&, or || ������ ���
 */


public class Study03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String aa = "�߻����";
		
		
		if(aa == "�������") { // ���࿡ () ��� �߰�ȣ {} ���θ� ����
			System.out.print("�����Դϴ�");
		}  // �߰�ȣ
		//else { // if������ ���ܵ� ��� ��Ȳ�� ������.
		//	System.out.print("�ƴմϴ� �߻�����.");
		//}
		
		else if (aa == "�������") {  // �߰�ȣ
			System.out.print("�����Դϴ�.");  
		} // �߰�ȣ
		else if (aa == "�������") {  // �߰�ȣ
			System.out.print("�����Դϴ�.");  
		} // �߰�ȣ
		else if (aa == "������") {  // �߰�ȣ
			System.out.print("�����Դϴ�.");  
		} // �߰�ȣ
		else if (aa == "�߻����") {  // �߰�ȣ
			System.out.println("�����Դϴ�.");  
		} // �߰�ȣ
		
		
		int a = 1;
		
		if(a == 0) {
			System.out.println("a�� 0 �Դϴ�.");
		} else if(a == 1) {
			System.out.println("a�� 1 �Դϴ�.");
		}
		
		
		
		// and ������, or ������
		if(a == 0 && a == 1) { // and ������ ���. �� �� ��ġ�ؾ� ��.
			System.out.println("TEST");
		}
		
		if(a == 0||a == 1) { // OR������. �� �� �ϳ��� ��ġ�ؾ� ��.
			System.out.println("TEST2");
		}
		
	}

}
