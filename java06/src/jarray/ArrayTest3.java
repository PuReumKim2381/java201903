package jarray;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] eyes = {2,1.5,0.8,0.5,1.2}; 
		System.out.println(eyes.length);
		eyes[0] = 1.7;
		
		for (double d : eyes) {    // for each 문
			System.out.println(d);
		}
		double[] eyes2 = {2,1.5,0.8,0.5,1.2}; 
		String[] names = {"김효진","김이슬","배재현","박상혁","이병훈"};
		
		for (int i = 0; i < eyes2.length; i++) {
			System.out.println(names[i]+"의 시력은 : "+eyes[i]);
		}
		String[] test = {"A","B","C","A","F"};
		String[] names2 = {"김효진","김이슬","배재현","박상혁","이병훈"};
		for (int i = 0; i < names2.length; i++) {
			System.out.println(names[i]+"의 성적은 : "+test[i]);
			
		}

	}

}
