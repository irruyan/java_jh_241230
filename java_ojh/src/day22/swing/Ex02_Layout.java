package day22.swing;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Layout {
	
	public static void main(String[] args) {
		
		//sampleBorderLayout();
		sampleGridLayout();
		//sampleBoxLayout();
		
		//sampleNullLayout();
		//sampleGridBagLayout();
		
		
	}
	
	
	
	private static void sampleGridBagLayout() {
		JFrame frame = new JFrame("Layout 예제");
		frame.setLayout(new GridBagLayout());
		frame.setSize(500, 500);
		
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.fill = GridBagConstraints.BOTH;
		gbc.weightx = 1.0;
		gbc.weighty = 1.0;
		
		gbc.gridx = 0;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		frame.add(new JButton("1"), gbc);
		
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 2;
		frame.add(new JButton("2"), gbc);
		
		gbc.gridx = 1;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		frame.add(new JButton("3"), gbc);
		
		gbc.gridx = 2;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		frame.add(new JButton("4"), gbc);
		
		gbc.gridx = 3;
		gbc.gridy = 0;
		gbc.gridwidth = 1;
		frame.add(new JButton("5"), gbc);
		
		frame.setVisible(true);
		
	}



	private static void sampleNullLayout() {
		JFrame frame = new JFrame("Layout 예제");
		frame.setLayout(null);
		frame.setSize(500, 500);
		
		JButton btn = new JButton("button!");
		btn.setBounds(50, 50, 200, 200);
		frame.add(btn);
		frame.setVisible(true);
	}



	private static void sampleBoxLayout() {
		JFrame frame = new JFrame("Layout 예제");
		frame.setSize(500, 500);

		JPanel panel = new JPanel();
		panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
		
		panel.add(new JButton("상"));
		panel.add(new JButton("하"));
		panel.add(new JButton("좌"));
		panel.add(new JButton("우"));
		panel.add(new JButton("중"));
		
		frame.add(panel);
		frame.setVisible(true);
		
	}



	private static void sampleGridLayout() {
		JFrame frame = new JFrame("Layout 예제");
		frame.setLayout(new GridLayout(3, 3));
		frame.setSize(500, 500);
		
		frame.add(new JButton("1"));
		frame.add(new JButton("2"));
		frame.add(new JButton("3"));
		frame.add(new JButton("4"));
		frame.add(new JButton("5"));
		frame.add(new JButton("6"));
		frame.add(new JButton("7"));
		frame.add(new JButton("8"));
		frame.add(new JButton("9"));
		
		frame.setVisible(true);
		
	}



	public static void sampleBorderLayout() {
		
		JFrame frame = new JFrame("Layout 예제");
		frame.setLayout(new BorderLayout());
		frame.setSize(500, 500);
		
		frame.add(new JButton("상"), BorderLayout.NORTH);
		frame.add(new JButton("하"), BorderLayout.SOUTH);
		frame.add(new JButton("좌"), BorderLayout.WEST);
		frame.add(new JButton("우"), BorderLayout.EAST);
		frame.add(new JButton("중"), BorderLayout.CENTER);
		
		frame.setVisible(true);
		
	}

}
