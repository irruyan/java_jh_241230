package day22.swing;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class Ex06_KeyEvent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void documentListener() {
		JFrame frame = new JFrame("키 입력 감지");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField textField = new JTextField(30);
		JLabel label = new JLabel("입력된 키 : ");
		
		textField.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		frame.setLayout(new FlowLayout());
		frame.add(textField);
		frame.add(label);
		frame.setVisible(true);
	}
	
	public static void keyListener() {
		JFrame frame = new JFrame("키 입력 감지");
		frame.setSize(500, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JTextField textField = new JTextField(30);
		JLabel label = new JLabel("입력된 키 : ");
		
		textField.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				label.setText("입력된 문자 : " + e.getKeyChar());
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("key Released : " + e.getKeyCode());
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				System.out.println("key Pressed : " + e.getKeyCode());
			}
		});
		frame.setLayout(new FlowLayout());
		frame.add(textField);
		frame.add(label);
		frame.setVisible(true);
	}

}
