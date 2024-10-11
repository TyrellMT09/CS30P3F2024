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
	private JTextField acctNum;
	private JTextField amt;
	private JTextField fName;
	private JTextField lName;
	private JTextField begBalance;
	
	Bank easySave = new Bank();
	private JLabel ALTpoor;
	private JLabel ALTfname;
	private JLabel ALTlname;
	private JLabel ALToclock;

	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the application.
	 */
	public LocalBankGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 521, 459);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Account Number:");
		lblNewLabel.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		lblNewLabel.setBounds(34, 68, 210, 19);
		frame.getContentPane().add(lblNewLabel);
		
		ALTpoor = new JLabel("Amount of deposit/withdrawal:\r\n");
		ALTpoor.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		ALTpoor.setBounds(34, 114, 210, 19);
		frame.getContentPane().add(ALTpoor);
	
		ALTfname = new JLabel("First Name:");
		ALTfname.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		ALTfname.setBounds(34, 160, 210, 19);
		frame.getContentPane().add(ALTfname);
		
		ALTlname = new JLabel("Last Name:");
		ALTlname.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		ALTlname.setBounds(34, 206, 210, 19);
		frame.getContentPane().add(ALTlname);
		
		ALToclock = new JLabel("Beginning Balance: ");
		ALToclock.setFont(new Font("Yu Gothic UI", Font.BOLD, 14));
		ALToclock.setBounds(34, 252, 210, 19);
		frame.getContentPane().add(ALToclock);
		
		acctNum = new JTextField();
		acctNum.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				acctNum.setText(null);
			}
		});
		
		acctNum.setForeground(Color.BLACK);
		acctNum.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		acctNum.setBounds(34, 88, 436, 19);
		frame.getContentPane().add(acctNum);
		acctNum.setColumns(10);
		
		amt = new JTextField();
		
		amt.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				amt.setText("");
				ALTpoor.setText("Amount of deposit/withdrawal: ");
				
				
			}
		});
		
		amt.setForeground(Color.BLACK);
		amt.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		amt.setColumns(10);
		amt.setBounds(34, 134, 436, 19);
		frame.getContentPane().add(amt);
		
		fName = new JTextField();
		
		fName.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				fName.setText("");
				ALTfname.setText("First Name: ");
				
			}
		});
		
		fName.setForeground(Color.BLACK);
		fName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		fName.setColumns(10);
		fName.setBounds(34, 180, 436, 19);
		frame.getContentPane().add(fName);
		
		
		lName = new JTextField();
		
		lName.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				lName.setText("");
				ALTlname.setText("Last Name: ");
				
			}
		});
		
		lName.setForeground(Color.BLACK);
		lName.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		lName.setColumns(10);
		lName.setBounds(34, 226, 436, 19);
		frame.getContentPane().add(lName);
		
		begBalance = new JTextField();
		
		begBalance.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent e) 
			{
				
				begBalance.setText("");
				ALToclock.setText("Beginning Balance: ");
				
				
			}
		});
		
		begBalance.setForeground(Color.BLACK);
		begBalance.setFont(new Font("Yu Gothic UI", Font.PLAIN, 13));
		begBalance.setColumns(10);
		begBalance.setBounds(34, 272, 436, 19);
		frame.getContentPane().add(begBalance);
		
		JLabel acctinfo = new JLabel("Account info displayed here");
		acctinfo.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 16));
		acctinfo.setBounds(34, 296, 436, 52);
		frame.getContentPane().add(acctinfo);
		
		JComboBox<String> bankActivities = new JComboBox<String>();
		
		JButton btnNewButton = new JButton("Process Transaction");
		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String amount, message;
		        try {
		            if(bankActivities.getSelectedItem().equals("Deposit")) 
		            {
		                amount = amt.getText();
		                message = easySave.transaction(1, acctNum.getText(), Double.parseDouble(amount));
		                acctinfo.setText(message);
		            } 
		            
		            else if(bankActivities.getSelectedItem().equals("Withdrawal")) 
		            {
		                amount = amt.getText();
		                message = easySave.transaction(2, acctNum.getText(), Double.parseDouble(amount));
		                acctinfo.setText(message);
		            }
		            else if(bankActivities.getSelectedItem().equals("Check Balance")) 
		            {
		                message = easySave.checkBalance(acctNum.getText());
		                acctinfo.setText(message);
		            } 
		            else if(bankActivities.getSelectedItem().equals("Add Account")) 
		            {
		                amount = begBalance.getText();
		                message = easySave.addAccount(fName.getText(), lName.getText(), Double.parseDouble(amount));
		                acctinfo.setText("New Account ID: " + message);
		            } 
		            else if(bankActivities.getSelectedItem().equals("Remove Account")) 
		            {
		                message = easySave.deleteAccount(acctNum.getText());
		                acctinfo.setText(message);
		            }
		            
		        } catch (NumberFormatException ex) 
		        
		        {
		            acctinfo.setText("Invalid input. Please enter a valid number.");
		        }
		    }
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(34, 355, 210, 43);
		frame.getContentPane().add(btnNewButton);
		
		
		
		bankActivities.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				
				if(bankActivities.getSelectedItem().equals("Deposit"))
				{
					acctNum.setForeground(Color.red);
					amt.setForeground(Color.red);
				}
				else if(bankActivities.getSelectedItem().equals("Withdrawal"))
				{
					acctNum.setForeground(Color.red);
					amt.setForeground(Color.red);
				}
				else if(bankActivities.getSelectedItem().equals("Check Balance"))
				{
					acctNum.setForeground(Color.red);		
				}
				else if(bankActivities.getSelectedItem().equals("Add Account"))
				{
					fName.setForeground(Color.red);
					lName.setForeground(Color.red);
					begBalance.setForeground(Color.red);	
				}
				else if(bankActivities.getSelectedItem().equals("Remove Account"))
				{
					acctNum.setForeground(Color.red);		
				}
			}
		});
		bankActivities.setFont(new Font("Yu Gothic UI Light", Font.BOLD, 14));
		bankActivities.setModel(new DefaultComboBoxModel<String>(new String[] {"Select an action:", "Deposit", "Withdrawal", "Check Balance", "Add Account", "Remove Account"}));
		bankActivities.setBounds(34, 30, 436, 29);
		frame.getContentPane().add(bankActivities);
	}
}