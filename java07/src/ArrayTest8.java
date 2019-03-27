import java.awt.Image;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest8 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 그림");
		JLabel	l  = new JLabel(); // 글자
		f.setSize(500, 400);
		f.add(l); 

		ImageIcon icon = new ImageIcon("ham.jpg");
		l.setIcon(icon);
		
		f.setVisible(true);
	}// main

}// class
