package java08;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SecondWindow {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setTitle("나의 메뉴판");
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\kpr\\java08\\ham.jpg"));
		f.setBackground(Color.YELLOW);
		f.setSize(900, 900);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		JButton button = new JButton("나를 눌러욤");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("나를 눌렀군요");
			}
		});

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\kpr\\java08\\ham2.jpg"));
		f.getContentPane().add(btnNewButton);
		button.setFont(new Font("궁서체", Font.BOLD, 18));
		button.setToolTipText("내가보이나요");
		f.getContentPane().add(button);

		f.setVisible(true);
	}

}
