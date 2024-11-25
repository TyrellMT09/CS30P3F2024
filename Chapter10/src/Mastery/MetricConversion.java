package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetricConversion {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 406, 155);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel POP_UP = new JLabel("Select a conversion type:");
		POP_UP.setFont(new Font("Tahoma", Font.BOLD, 12));
		POP_UP.setBounds(32, 11, 322, 15);
		panel.add(POP_UP);
		
		JLabel CON_info = new JLabel("");
		CON_info.setFont(new Font("Tahoma", Font.BOLD, 12));
		CON_info.setBounds(32, 73, 322, 14);
		panel.add(CON_info);
		
		JComboBox<String> Convert = new JComboBox<String>();
		Convert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (Convert.getSelectedItem().equals("Inches To Centimeters")) {
					CON_info.setText("1 inch = 2.54 centimeters");
				}
				else if (Convert.getSelectedItem().equals("Feet To Meters")) {
					CON_info.setText("1 foot = 0.3048 meters");
				}
				else if (Convert.getSelectedItem().equals("Gallon To Liters")) {
					CON_info.setText("1 gallon = 4.5461 liters");
				}
				else if (Convert.getSelectedItem().equals("Pound To Kilograms")) {
					CON_info.setText("1 pound = 0.4536 liters");
				}
			}
		});
		Convert.setFont(new Font("Tahoma", Font.BOLD, 10));
		Convert.setModel(new DefaultComboBoxModel<String>(new String[] {"None", "Inches To Centimeters", "Feet To Meters", "Gallon To Liters", "Pound To Kilograms"}));
		Convert.setBounds(32, 32, 322, 22);
		panel.add(Convert);
		

	}
}
