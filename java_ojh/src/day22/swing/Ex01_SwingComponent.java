package day22.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ex01_SwingComponent {

	public static void main(String[] args) {
		/*
		 * 컴포넌트
		 *  
		 */
		
		JFrame frame = new JFrame("어플리케이션 예제");
		
		frame.setLayout(new FlowLayout());
		
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		//frame.add(btn);
		
		JLabel label = new JLabel("라벨");
		//frame.add(label);
		
		JTextField textField = new JTextField(30);
		//frame.add(textField);
		
		JTextArea textArea = new JTextArea(20, 30);
		textArea.append("안녕하세요\n");
		textArea.append("반갑습니다");
		textArea.setEditable(false);
		//frame.add(textArea);
		
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.add(btn);
		panel.add(label);
		panel.add(textField);
		panel.add(textArea);
		
		frame.add(panel);
		
		frame.setVisible(true);

	}

}
