package whileTest;

public class WhileTest {

	public static void main(String[] args) {
		
//	1���� 10���� ���ϱ�	
	int num = 1;   
	int sum = 0;   //������ų ���� ����
    while(num <= 1000) {   
    	sum = sum + num;
    	num++; 
    	}
    System.out.println("�� ���� :"+ sum);
	}

}
