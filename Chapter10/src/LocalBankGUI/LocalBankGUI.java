package LocalBankGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LocalBankGUI {

	private JFrame frame;
	private JTextField Act_us;
	private JTextField Wth_Dpt_us;
	private JTextField Fname_us;
	private JTextField Lname_us;
	private JTextField BegB_us;
	
	Bank easySave = new Bank();
	private JLabel up_Wth_Dpt;
	private JLabel up_Fname;
	private JLabel up_Lname;
	private JLabel up_BegB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBankGUI window = new LocalBankGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LocalBankGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Complete the information in RED");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
		lblNewLabel.setBounds(254, 381, 182, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel up_Act = new JLabel("Account Number:");
		up_Act.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		up_Act.setBounds(34, 68, 210, 19);
		frame.getContentPane().add(up_Act);
		
		up_Wth_Dpt = new JLabel("Amount of deposit/withdrawal:\r\n");
		up_Wth_Dpt.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		up_Wth_Dpt.setBounds(34, 114, 210, 19);
		frame.getContentPane().add(up_Wth_Dpt);
	
		up_Fname = new JLabel("First Name:");
		up_Fname.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		up_Fname.setBounds(34, 160, 210, 19);
		frame.getContentPane().add(up_Fname);
		
		up_Lname = new JLabel("Last Name:");
		up_Lname.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		up_Lname.setBounds(34, 206, 210, 19);
		frame.getContentPane().add(up_Lname);
		
		up_BegB = new JLabel("Beginning Balance: ");
		up_BegB.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		up_BegB.setBounds(34, 252, 210, 19);
		frame.getContentPane().add(up_BegB);
		
		Act_us = new JTextField();
		Act_us.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				Act_us.setText(null);
			}
		});
		
		Act_us.setForeground(Color.BLACK);
		Act_us.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		Act_us.setBounds(34, 88, 436, 19);
		frame.getContentPane().add(Act_us);
		Act_us.setColumns(10);
		
		Wth_Dpt_us = new JTextField();
		Wth_Dpt_us.setForeground(Color.BLACK);
		Wth_Dpt_us.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		Wth_Dpt_us.setColumns(10);
		Wth_Dpt_us.setBounds(34, 134, 436, 19);
		frame.getContentPane().add(Wth_Dpt_us);
		
		Fname_us = new JTextField();
		Fname_us.setForeground(Color.BLACK);
		Fname_us.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		Fname_us.setColumns(10);
		Fname_us.setBounds(34, 180, 436, 19);
		frame.getContentPane().add(Fname_us);
		
		
		Lname_us = new JTextField();
		Lname_us.setForeground(Color.BLACK);
		Lname_us.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		Lname_us.setColumns(10);
		Lname_us.setBounds(34, 226, 436, 19);
		frame.getContentPane().add(Lname_us);
		
		BegB_us = new JTextField();
		BegB_us.setForeground(Color.BLACK);
		BegB_us.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		BegB_us.setColumns(10);
		BegB_us.setBounds(34, 272, 436, 19);
		frame.getContentPane().add(BegB_us);
		
		JLabel Act_dis = new JLabel("Account info displayed here");
		Act_dis.setFont(new Font("Yu Gothic UI", Font.PLAIN, 16));
		Act_dis.setBounds(34, 296, 436, 52);
		frame.getContentPane().add(Act_dis);
		
		JComboBox<String> bankActivities = new JComboBox<String>();
		
		JButton Submit = new JButton("Process Transaction");
		Submit.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String amount, message;
		        try {
		            if(bankActivities.getSelectedItem().equals("Deposit")) 
		            {
		                amount = Wth_Dpt_us.getText();
		                message = easySave.transaction(1, Act_us.getText(), Double.parseDouble(amount));
		                Act_dis.setText(message);
		            } 
		            
		            else if(bankActivities.getSelectedItem().equals("Withdrawal")) 
		            {
		                amount = Wth_Dpt_us.getText();
		                message = easySave.transaction(2, Act_us.getText(), Double.parseDouble(amount));
		                Act_dis.setText(message);
		            }
		            else if(bankActivities.getSelectedItem().equals("Check Balance")) 
		            {
		                message = easySave.checkBalance(Act_us.getText());
		                Act_dis.setText(message);
		            } 
		            else if(bankActivities.getSelectedItem().equals("Add Account")) 
		            {
		                amount = BegB_us.getText();
		                message = easySave.addAccount(Fname_us.getText(), Lname_us.getText(), Double.parseDouble(amount));
		                Act_dis.setText("New Account ID: " + message);
		            } 
		            else if(bankActivities.getSelectedItem().equals("Remove Account")) 
		            {
		                message = easySave.deleteAccount(Act_us.getText());
		                Act_dis.setText(message);
		            }
		            
		        } catch (NumberFormatException ex) 
		        
		        {
		            Act_dis.setText("Invalid input. Please enter a valid number.");
		        }
		    }
		});
		Submit.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		Submit.setBounds(34, 355, 210, 43);
		frame.getContentPane().add(Submit);
		
		
		
		bankActivities.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					up_Act.setForeground(Color.red);
					up_Wth_Dpt.setForeground(Color.red);
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawal"))
				{
					up_Act.setForeground(Color.red);
					up_Wth_Dpt.setForeground(Color.red);
				}
				else if(bankActivities.getSelectedItem().equals("Check Balance"))
				{
					up_Act.setForeground(Color.red);		
				}
				else if(bankActivities.getSelectedItem().equals("Add Account"))
				{
					up_Fname.setForeground(Color.red);
					up_Lname.setForeground(Color.red);
					up_BegB.setForeground(Color.red);	
				}
				else if(bankActivities.getSelectedItem().equals("Remove Account"))
				{
					up_Act.setForeground(Color.red);		
				}
			}
		});
		
		bankActivities.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					up_Fname.setForeground(Color.black);
					up_Lname.setForeground(Color.black);
					up_BegB.setForeground(Color.black);
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawal"))
				{
					up_Fname.setForeground(Color.black);
					up_Lname.setForeground(Color.black);
					up_BegB.setForeground(Color.black);
				}
				else if(bankActivities.getSelectedItem().equals("Check Balance"))
				{
					up_Wth_Dpt.setForeground(Color.black);
					up_Fname.setForeground(Color.black);
					up_Lname.setForeground(Color.black);
					up_BegB.setForeground(Color.black);		
				}
				else if(bankActivities.getSelectedItem().equals("Add Account"))
				{
					up_Act.setForeground(Color.black);
					up_Wth_Dpt.setForeground(Color.black);
				}
				else if(bankActivities.getSelectedItem().equals("Remove Account"))
				{
					up_Wth_Dpt.setForeground(Color.black);
					up_Fname.setForeground(Color.black);
					up_Lname.setForeground(Color.black);
					up_BegB.setForeground(Color.black);	
				}
			}
		});
		bankActivities.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		bankActivities.setModel(new DefaultComboBoxModel<String>(new String[] {"Select an action:", "Deposit", "Withdrawal", "Check Balance", "Add Account", "Remove Account"}));
		bankActivities.setBounds(34, 30, 436, 29);
		frame.getContentPane().add(bankActivities);
	}
}
