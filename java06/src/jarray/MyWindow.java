package jarray;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("���� ù �׷��� ���α׷�");
		f.setSize(500, 500); // ũ�⼳��
		JButton button = new JButton();
//		��ư �����
		button.setText("���� ������^_^");
		f.add(button);  //�����ӿ� ��ư�� ����
//		�ٸ� ���̾ƿ����� ��ư�� ����.
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
//		��ư �ϳ� �� �����
		JButton button2 = new JButton();
		button2.setText("����  �ǿ� ������^_^");
		f.add(button2);  
	
//      ����ش޶�(��� ���� �� �� �������� ���)
		f.setVisible(true); 
		

	}

}
