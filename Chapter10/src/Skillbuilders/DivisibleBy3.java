package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisibleBy3 {

	private JFrame frame;
	private JTextField USER;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisibleBy3 window = new DivisibleBy3();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DivisibleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 445, 155);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel Popup = new JLabel("Enter an integer:");
		Popup.setFont(new Font("Tahoma", Font.BOLD, 14));
		Popup.setBounds(35, 30, 150, 24);
		panel.add(Popup);
		
		USER = new JTextField();
		USER.setFont(new Font("Tahoma", Font.PLAIN, 13));
		USER.setBounds(215, 34, 130, 20);
		panel.add(USER);
		USER.setColumns(10);
		
		JLabel DoN = new JLabel("");
		DoN.setFont(new Font("Tahoma", Font.BOLD, 10));
		DoN.setBounds(215, 76, 150, 14);
		panel.add(DoN);
		
		
		JButton SoN = new JButton("Check");
		SoN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				double dis3 = Double.parseDouble(USER.getText());
				
				if (dis3 % 3 == 0) {
					DoN.setText("Number is divisible By 3");
				}
				else {
					DoN.setText("Number is not divisible By 3");
				}
			}
		});
		SoN.setFont(new Font("Tahoma", Font.BOLD, 12));
		SoN.setBounds(35, 75, 130, 15);
		panel.add(SoN);
		
	}
}
