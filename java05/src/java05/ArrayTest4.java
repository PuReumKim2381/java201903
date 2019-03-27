package java05;

public class ArrayTest4 {

	public static void main(String[] args) {
// 배열
		String[] names = new String[3];  // 배열의 특징 : 크기를 변경불가
		names[0] = "박아무개";
		names[1] = "김아무개";
		names[2] = "이아무개";
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
