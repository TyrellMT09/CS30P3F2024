package Skillbuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.TextField;
import java.awt.Button;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class semesterAvg {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					semesterAvg window = new semesterAvg();
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
	public semesterAvg() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 536, 405);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 500, 344);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Grade #1");
		lblNewJgoodiesLabel.setBounds(47, 50, 51, 14);
		panel.add(lblNewJgoodiesLabel);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Grade #2");
		lblNewJgoodiesLabel_1.setBounds(47, 100, 51, 14);
		panel.add(lblNewJgoodiesLabel_1);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Grade #3");
		lblNewJgoodiesLabel_2.setBounds(44, 150, 51, 14);
		panel.add(lblNewJgoodiesLabel_2);
		
		TextField gr1 = new TextField();
		gr1.setBounds(104, 50, 83, 22);
		panel.add(gr1);
		
		TextField gr2 = new TextField();
		gr2.setBounds(104, 100, 83, 22);
		panel.add(gr2);
		
		TextField gr3 = new TextField();
		gr3.setBounds(104, 150, 83, 22);
		panel.add(gr3);
		
		
		Label disp = new Label("");
		disp.setBounds(123, 229, 194, 22);
		panel.add(disp);
		
		Button button = new Button("Submit ");
		button.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				DecimalFormat dc = new DecimalFormat("0.00");
				
				double grTx1 = Double.parseDouble(gr1.getText());
				double grTx2 = Double.parseDouble(gr2.getText());
				double grTx3 = Double.parseDouble(gr3.getText());
				
				double average = (grTx1 + grTx2 + grTx3)/3;
				
				disp.setText(dc.format (average));
				
				
			}
		});
		button.setBounds(47, 229, 70, 22);
		panel.add(button);
		
		
	}
}
