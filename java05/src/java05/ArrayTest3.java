package java05;

public class ArrayTest3 {

	public static void main(String[] args) {
//		��� ����Ʈ 5���� �־ ���
		String[] hobby = {"����","�","û��","����Ž��","���ڱ�"};
		
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(hobby[i]);
			
		}
		for(String h: hobby) {
			System.out.println(h);
		}
	}

}
