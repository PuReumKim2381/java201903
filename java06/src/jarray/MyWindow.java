package jarray;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 첫 그래픽 프로그램");
		f.setSize(500, 500); // 크기설정
		JButton button = new JButton();
//		버튼 만들기
		button.setText("나를 눌러욤^_^");
		f.add(button);  //프레임에 버튼을 넣음
//		다른 레이아웃으로 버튼을 넣음.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
//		버튼 하나 더 만들기
		JButton button2 = new JButton();
		button2.setText("나를  또오 눌러욤^_^");
		f.add(button2);  
	
//      출력해달라(모든 설정 후 맨 마지막에 출력)
		f.setVisible(true); 
		

	}

}
