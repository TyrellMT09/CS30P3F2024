package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LatinPlantNames {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LatinPlantNames window = new LatinPlantNames();
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
	public LatinPlantNames() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel CN = new JLabel("");
		CN.setBounds(162, 62, 93, 14);
		panel.add(CN);
		
	
		JComboBox<String> PN = new JComboBox<String>();
		
		PN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				if (PN.getSelectedItem().equals("basil")) {
					CN.setText("Ocimum");
				}
				else if (PN.getSelectedItem().equals("lavender")) {
					CN.setText("Lavandula spica");
				}
				else if (PN.getSelectedItem().equals("parsley")) {
					CN.setText("Apium");
				}
				else if (PN.getSelectedItem().equals("peppermint")) {
					CN.setText("Mentha piperita");
				}
				else if (PN.getSelectedItem().equals("saffron")) {
					CN.setText("Crocus");
				}
				else if (PN.getSelectedItem().equals("sage")) {
					CN.setText("Salvia");
				}
			}
		});
		PN.setModel(new DefaultComboBoxModel<String>(new String[] {"List of Plants", "basil", "lavender", "parsley", "peppermint", "saffron", "sage"}));
		PN.setBounds(162, 11, 93, 22);
		panel.add(PN);
	
	}

}