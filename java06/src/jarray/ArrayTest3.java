package jarray;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] eyes = {2,1.5,0.8,0.5,1.2}; 
		System.out.println(eyes.length);
		eyes[0] = 1.7;
		
		for (double d : eyes) {    // for each ��
			System.out.println(d);
		}
		double[] eyes2 = {2,1.5,0.8,0.5,1.2}; 
		String[] names = {"��ȿ��","���̽�","������","�ڻ���","�̺���"};
		
		for (int i = 0; i < eyes2.length; i++) {
			System.out.println(names[i]+"�� �÷��� : "+eyes[i]);
		}
		String[] test = {"A","B","C","A","F"};
		String[] names2 = {"��ȿ��","���̽�","������","�ڻ���","�̺���"};
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names[i]+"�� ������ : "+test[i]);
			
		}

	}

}
