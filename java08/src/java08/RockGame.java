package java08;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;

public class RockGame { // 글로벌 변수(전체 적용을 원하면 class 바로 밑에 입력)
	static int s = 0;
	static int r = 1;
	static int p = 2;
	static int count = 0;
	static int mewin = 0;
	static int computerwin = 0;
	static int nowin = 0;

	private static JTextField intro;
	private static JTextField result;

	public static void main(String[] args) {

//		1.화면
//		2.액션처리
		JFrame f = new JFrame();
		f.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\kpr\\java08\\b.png"));
		f.setTitle("나의가위바위보게임");

		f.setSize(800, 500);

		intro = new JTextField();
		intro.setText("가위 바위 보 게임을 시작합니다. 원하는 버튼을 눌러주세요.");
		f.getContentPane().add(intro, BorderLayout.NORTH);
		intro.setColumns(10);

		result = new JTextField();
		result.setForeground(Color.DARK_GRAY);
		result.setBackground(Color.PINK);
		result.setFont(new Font("돋움체", Font.BOLD, 21));
		result.setText("아직 게임 시작 전 입니다.");
		f.getContentPane().add(result, BorderLayout.SOUTH);
		result.setColumns(10);

		JPanel panel = new JPanel();
		f.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(1, 0, 0, 0));

		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위 바위 보 게임  (총 게임 횟수 : " + count + "회)");

				System.out.println("가위를 선택하셨군요!!");
				int me = 0; // 가위
				Random random = new Random();
				int computer = random.nextInt(3);
				if (computer == me) { // 컴퓨터가 s(가위)
					result.setText("무승부");
					nowin++;
				} else if (computer == r) { // 컴퓨터가 r(바위)
					result.setText("컴퓨터가 승리");
					computerwin++;
				} else { // 컴퓨터가 p(보)
					result.setText("내가 승리");
					mewin++;
				}
				intro.setText("내가 승리 횟수: " + mewin + ", 컴퓨터가 승리 횟수 : " + computerwin + "무승부" + nowin);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\kpr\\java08\\b.png"));
		btnNewButton.setBackground(Color.GRAY);
		panel.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위 바위 보 게임  (총 게임 횟수 : " + count + "회)");

				System.out.println("바위를 선택하셨군요!!");
				int me = 1; // 바위
				Random random = new Random();
				int computer = random.nextInt(3);
				if (computer == me) { // 컴퓨터가 r(바위)
					result.setText("무승부");
					nowin++;
				} else if (computer == s) { // 컴퓨터가 s(가위)
					result.setText("내가 승리");
					mewin++;
				} else { // 컴퓨터가 p(보)
					result.setText("컴퓨터가 승리");
					computerwin++;
				}
				intro.setText("내가 승리 횟수: " + mewin + ", 컴퓨터가 승리 횟수 : " + computerwin + "무승부" + nowin);
			}

		});
		btnNewButton_1.setIcon(new ImageIcon("D:\\kpr\\java08\\g.png"));
		btnNewButton_1.setBackground(Color.DARK_GRAY);
		panel.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				count++;
				f.setTitle("나의 가위 바위 보 게임  (총 게임 횟수 : " + count + "회)");

				System.out.println("보를 선택하셨군요!!");
				int me = 2; // 보
				Random random = new Random();
				int computer = random.nextInt(3);
				if (computer == me) { // 컴퓨터가 p(보)
					result.setText("무승부");
					nowin++;
				} else if (computer == s) { // 컴퓨터가 s(가위)
					result.setText("컴퓨터가 승리");
					computerwin++;
				} else { // 컴퓨터가 r(바위)
					result.setText("내가 승리");
					mewin++;
				}
				intro.setText("내가 승리 횟수: " + mewin + ", 컴퓨터가 승리 횟수 : " + computerwin + "무승부" + nowin);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon("D:\\kpr\\java08\\bo.png"));
		btnNewButton_2.setBackground(Color.GRAY);
		panel.add(btnNewButton_2);

		f.setVisible(true);

	}

}
