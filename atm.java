import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class atm implements ActionListener{
	
	JFrame mainframe=new JFrame("ATM");
	JFrame options=new JFrame("OPTIONS");
	JLabel label=new JLabel("Enter your pin");
	JTextField text=new JTextField();
	JButton btn=new JButton("Confirm");
	
	//options
	JButton wbtn=new JButton("WITHDRAWL");
	JButton dbtn=new JButton("DEPOSIT");
	JButton ebtn=new JButton("EXIT");
	JButton pcbtn=new JButton("PINCHANGE");
	
	//withdraw frame
	JFrame withdrawframe=new JFrame("WITHDRAW");
	JLabel avamount=new JLabel("Available amount");
	JTextField ava=new JTextField("1000");
	JLabel pamn=new JLabel("Enter amount to be withdrawl:");
	JTextField pamn1=new JTextField();
	JButton cnfrm=new JButton("Confirm");
	
	//deposit
	JFrame dframe=new JFrame("DEPOSIT");
	JLabel davamount=new JLabel("Available amount");
	JTextField dava=new JTextField("1000");
	JLabel dpamn=new JLabel("Enter amount to be Deposit:");
	JTextField dpamn1=new JTextField();
	JButton dcnfrm=new JButton("Confirm");
	
	//change
	JFrame change=new JFrame("Pin change");
	JLabel op=new JLabel("Old Password");
	JTextField ope=new JTextField();
	JLabel on=new JLabel("New Password");
	JTextField one=new JTextField();
	JLabel cp=new JLabel("Confirm Password");
	JTextField ncp=new JTextField();
	JButton cnfrmpass=new JButton("CONFIRM");
	atm()
	{
		//options.setVisible(true);
		options.setSize(400,300);
		mainframe.setVisible(true);//tr
		mainframe.setSize(400,300);
		mainframe.setLayout(new GridLayout(10, 1));
		label.setBounds(50,10,10,20);
		text.setBounds(50,20,10,20);
		btn.setBounds(50,30,10,20);
		mainframe.add(label);
		mainframe.add(text);
		mainframe.add(btn);
		options.setVisible(false);
		btn.addActionListener(this);
		
		options.setLayout(new FlowLayout());
		options.add(wbtn);
		options.add(dbtn);
		options.add(pcbtn);
		options.add(ebtn);
		ebtn.setBounds(50,10,10,20);
		wbtn.setBounds(50,20,10,20);
		pcbtn.setBounds(50,30,10,20);
		dbtn.setBounds(50,30,10,20);
		
		//withdraw
		withdrawframe.setVisible(false);
		withdrawframe.setSize(400,400);
		withdrawframe.setLayout(new GridLayout(10,1));
		avamount.setBounds(50,10,10,20);
		ava.setBounds(50,10,10,20);
		ava.setEditable(false);
		pamn.setBounds(50,20,10,20);
		pamn1.setBounds(50,30,10,20);
		cnfrm.setBounds(50,40,10,20);
		withdrawframe.add(avamount);
		withdrawframe.add(ava);
		withdrawframe.add(pamn);
		withdrawframe.add(pamn1);
		withdrawframe.add(cnfrm);
		wbtn.addActionListener(this);
		cnfrm.addActionListener(this);
		
		dframe.setVisible(false);
		dframe.setSize(400,400);
		dframe.setLayout(new GridLayout(10,1));
		davamount.setBounds(50,10,10,20);
		dava.setBounds(50,10,10,20);
		dava.setEditable(false);
		dpamn.setBounds(50,20,10,20);
		dpamn1.setBounds(50,30,10,20);
		dcnfrm.setBounds(50,40,10,20);
		dframe.add(davamount);
		dframe.add(dava);
		dframe.add(dpamn);
		dframe.add(dpamn1);
		dframe.add(dcnfrm);
		dbtn.addActionListener(this);
		dcnfrm.addActionListener(this);
		
		op.setBounds(50,10,10,20);
		ope.setBounds(50,10,10,20);
		on.setBounds(50,10,10,20);
		one.setBounds(50,10,10,20);
		cp.setBounds(50,10,10,20);
		ncp.setBounds(50,10,10,20);
		
		change.setVisible(false);//tr
		change.setSize(400,300);
		change.setLayout(new GridLayout(10, 1));
		change.add(op);
		change.add(ope);
		change.add(on);
		change.add(one);
		change.add(cp);
		change.add(ncp);
		change.add(cnfrmpass);
		cnfrmpass.addActionListener(this);
		pcbtn.addActionListener(this);
		ebtn.addActionListener(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new atm();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==ebtn)
		{
			mainframe.dispose();
			options.dispose();
			withdrawframe.dispose();
			dframe.dispose();
			change.dispose();
		}
		int pin=4495;
		if(e.getSource()==btn)
		{
			int pin1=Integer.parseInt(text.getText());
			if(pin==pin1)
			{
				mainframe.dispose();
				options.setVisible(true);
			}
			else
				JOptionPane.showMessageDialog(mainframe, "Incorrect PIN", "Error", JOptionPane.ERROR_MESSAGE);
		}
		if(e.getSource()==wbtn)
		{
			options.dispose();
			withdrawframe.setVisible(true);
		}
		if(e.getSource()==cnfrm)
		{
			//JOptionPane.showInputDialog(this,"Enter a valid Number","ERROR",JOptionPane.ERROR_MESSAGE);
			int ava1=Integer.parseInt(ava.getText());
			System.out.println(ava);
			int pava=Integer.parseInt(pamn1.getText());
			//ava pamn1
			System.out.println(pava);
			if(pava<=ava1)
				{
				int choice = JOptionPane.showConfirmDialog(
	                    withdrawframe,
	                    "Are you sure you want to continue?",
	                    "Confirmation",
	                    JOptionPane.YES_NO_OPTION);
				if(choice==JOptionPane.YES_OPTION)
				{
					JOptionPane.showMessageDialog(
		                    withdrawframe,
		                    
		                    
		                    "Collect Cash",
		                    "Information",
		                    JOptionPane.INFORMATION_MESSAGE
		            );
				
				}
				else
				{
					JOptionPane.showMessageDialog(
		                    withdrawframe,
		                    "Transaction Fails",
		                    "Information",
		                    JOptionPane.INFORMATION_MESSAGE
		            );
					mainframe.setVisible(true);
					withdrawframe.setVisible(false);
					dframe.setVisible(false);
				}
				}
			else
			{
				JOptionPane.showMessageDialog(withdrawframe, "Insufficient Funds", "Error", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		///
		if(e.getSource()==dbtn)
		{
			withdrawframe.dispose();
			dframe.setVisible(true);
		}
		if(e.getSource()==dcnfrm)
		{
			
			int amount=Integer.parseInt(dpamn1.getText());
			System.out.println(amount);
			int ss=1000+amount;
			int choice = JOptionPane.showConfirmDialog(
                    dframe,
                    "The available amount : "+ss,
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);
			if(choice==JOptionPane.YES_OPTION)
			{
				JOptionPane.showMessageDialog(
	                    dframe,
	                    "Visit again",
	                    "Information",
	                    JOptionPane.INFORMATION_MESSAGE
	            );
				mainframe.setVisible(true);
				withdrawframe.setVisible(false);
				dframe.setVisible(false);
			}
			else
			{
				JOptionPane.showMessageDialog(
	                    dframe,
	                    "Transaction Fails",
	                    "Information",
	                    JOptionPane.INFORMATION_MESSAGE
	            );
				mainframe.setVisible(true);
				withdrawframe.setVisible(false);
				dframe.setVisible(false);
				
			}
		}
		if(e.getSource()==pcbtn)
		{
			change.setVisible(true);
		}
		int pop=Integer.parseInt(ope.getText());
		int pon=Integer.parseInt(one.getText());
		int pncp=Integer.parseInt(ncp.getText());
		if(e.getSource()==cnfrmpass)
		{
			if(pon==pncp)
			{
				if(pin==pop)
				{
					pin=pncp;
					JOptionPane.showMessageDialog(
		                    change,
		                    "Password Changed",
		                    "Information",
		                    JOptionPane.INFORMATION_MESSAGE
		            );
				}
				pop=pin;
				mainframe.setVisible(true);
				System.out.println(pin);
				System.out.println(pop);
			}
		}
	}
}
