package java08;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalWindow {
	private static JTextField n1;
	private static JTextField n2;

	public static void main(String[] args) {
		JFrame f = new JFrame();    // 기본 틀을 만들고 윈도우 빌더가서 만든다.
		f.getContentPane().setBackground(Color.BLACK);
		f.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("숫자1>>  ");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 21));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBackground(Color.BLACK);
		f.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setFont(new Font("굴림", Font.PLAIN, 21));
		f.getContentPane().add(n1);
		n1.setColumns(10);
		
		JLabel label = new JLabel("숫자2>>  ");
		label.setFont(new Font("굴림", Font.BOLD, 21));
		label.setForeground(Color.WHITE);
		label.setBackground(Color.BLACK);
		f.getContentPane().add(label);
		
		n2 = new JTextField();
		n2.setFont(new Font("굴림", Font.PLAIN, 21));
		n2.setColumns(10);
		f.getContentPane().add(n2);
		
		JButton add = new JButton("더하기연산");
		
		add.setFont(new Font("궁서체", Font.BOLD | Font.ITALIC, 21));
		add.setForeground(Color.DARK_GRAY);
		add.setBackground(Color.PINK);
		f.getContentPane().add(add);
		
		
		JButton result = new JButton();
		result.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button = new JButton("빼기연산");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("빼기 버튼을 누르셨군요");
				String num1 = n1.getText();  // 입력값을 가지고 옴
				String num2 = n2.getText();  // 입력값을 가지고 옴
				System.out.println("입력한 숫자값1: "+ num1);
				System.out.println("입력한 숫자값2: "+ num2);
				
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sum = n11 - n22;
				System.out.println("두 수를 뺀 값은" + sum );
				result.setText(sum + "");
				
			}
		});
		button.setFont(new Font("궁서체", Font.BOLD, 21));
		button.setForeground(Color.DARK_GRAY);
		button.setBackground(Color.PINK);
		f.getContentPane().add(button);
		result.setText("             ");
		result.setForeground(Color.WHITE);
		result.setFont(new Font("궁서체", Font.PLAIN, 21));
		result.setBackground(Color.GRAY);
		f.getContentPane().add(result);
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\kpr\\java08\\cal.jpg"));
		f.setTitle("나의 계산기");

		
		add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("더하기 버튼을 누르셨군요");
				String num1 = n1.getText();  // 입력값을 가지고 옴
				String num2 = n2.getText();  // 입력값을 가지고 옴
				System.out.println("입력한 숫자값1: "+ num1);
				System.out.println("입력한 숫자값2: "+ num2);
				
				int n11 = Integer.parseInt(num1);
				int n22 = Integer.parseInt(num2);
				int sum = n11 + n22;
				System.out.println("두 수를 더한 값은" + sum );
				result.setText(sum + "");
			}
		});
		
		f.setSize(347, 494);
		f.setVisible(true);

	}

}
