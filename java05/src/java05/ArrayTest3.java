package java05;

public class ArrayTest3 {

	public static void main(String[] args) {
//		취미 리스트 5개를 넣어서 출력
		String[] hobby = {"독서","운동","청소","맛집탐방","잠자기"};
		
		
		for (int i = 0; i < hobby.length; i++) {
			System.out.println(hobby[i]);
			
		}
		for(String h: hobby) {
			System.out.println(h);
		}
	}

}
