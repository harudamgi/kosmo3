package farm;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Farm extends JFrame {
	
	LoginView login;
	RegisterView register;
	FindIdView findId;
	FindPassView findPass;
	LandlordMainView llmain;
	LandlordInsertView llinsert;
	TenantMainView tmain;
	TenantSearchView tsearch;
	
	JPanel contentPane;
	
	public Farm () {
		
		login = new LoginView();
		register = new RegisterView();
		findId = new FindIdView();
		findPass = new FindPassView();
		llmain = new LandlordMainView();
		llinsert = new LandlordInsertView();
		tmain = new TenantMainView();
		tsearch = new TenantSearchView();
		
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(152, 251, 152));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		contentPane.add(login);
		contentPane.add(register);
		contentPane.add(findId);
		contentPane.add(findPass);
		contentPane.add(llmain);
		contentPane.add(llinsert);
		contentPane.add(tmain);
		contentPane.add(tsearch);
		
		// 화면 전환
		login.setVisible(true);
		register.setVisible(false);
		findId.setVisible(false);
		findPass.setVisible(false);
		llmain.setVisible(false);
		llinsert.setVisible(false);
		tmain.setVisible(false);
		tsearch.setVisible(false);
	}
	
	
	public static void main(String[] args) {
		Farm frame = new Farm();
		frame.setVisible(true);
	}
}
