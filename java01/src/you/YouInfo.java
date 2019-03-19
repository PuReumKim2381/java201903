package you;

public class YouInfo {

	public static void main(String[] args) {
		// 친구에 대한 정보 
		int height = 180; //4byte
		double eye = 1.5; //float, double 8byte
		float weight = 50.5f; //4byte
		char gender ='남';  //2byte
		boolean lastTime = true; //1byte
		System.out.println("내 친구의 키는"+height+"cm");
		System.out.println("내 친구의 시력은"+eye+"이다");
		System.out.println("내 친구의 성별은"+gender+"이다");
	}

}
