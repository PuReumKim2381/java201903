package variable;

/*
 * ���α׷���: �Ӿƹ���
 * ���� ���� ��¥ : 2019.03.19
 * ���� ���� : ���� Ȯ��
 */
public class VarTest {

	public static void main(String[] args) {
		// �ڹ��� �⺻(1�� �ּ�)
		// sysout ��Ʈ�� + �����̽���
		// run ��Ʈ�� +F11
		System.out.println("������ �ι�° ���Դϴ�.");
		System.out.println("----------------");
		System.out.println();
		
		
		byte time = 15; // = ���Կ�����, �Ҵ翬����
		// ������Ÿ�� ������ = ��;
		int seconds = 51245315;
		
		final double pi = 3.14; //���
		//PI =3;  ����� ���� ������ �� ����.
		// ����� �Ϲ������� ������� �빮�ڷ� ����.(final)
		
		
		
		char lastName ='��';
		boolean lunch = true; //��: true, ����: false
		System.out.println("���� ������ :"+time);
		// + => ���Ῥ����
		System.out.println("��ħ���� ���� �ʴ�:"+seconds);
		System.out.println("Pi�� ����: "+ pi);
		System.out.println("���� �̸� ù ���ڴ�: "+ lastName);
		System.out.println("������ �Ծ�����:"+lunch);
		
		String name = "��ȿ����"; //String => "
		System.out.println("���� ��ü �̸���"+name);

	}

}
