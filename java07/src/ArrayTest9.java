import java.awt.FlowLayout;
import java.awt.Image;
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ArrayTest9 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("나의 그림2");
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		JButton button = new JButton();
		ImageIcon icon = new ImageIcon("ham.jpg");
		button.setIcon(icon);
		f.add(button);

		f.setSize(1500, 1500);
		f.setVisible(true);
	}// main

}// class
