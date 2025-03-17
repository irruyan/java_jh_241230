package day22.swing;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Ex04_Todo {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("어플리케이션 예제");
		frame.setLayout(new FlowLayout());
		frame.setSize(400, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btn = new JButton("버튼");
		JTextField textField = new JTextField(20);
		
		textField.addActionListener(e->{
			String text = textField.getText();
			System.out.println(text);
			textField.setText("");
		});
		
		
		frame.add(textField);
		frame.add(btn);
		frame.setVisible(true);

	}

}
