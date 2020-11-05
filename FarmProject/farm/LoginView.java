package farm;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LoginView extends JPanel {

	private JTextField tf_login_id;
	private JTextField tf_login_pw;
	
	public LoginView () {
		addLayout();
	}
	
	void addLayout(){
		
		
		setBounds(18, 13, 410, 241);
		setLayout(null);
		
		tf_login_id = new JTextField();
		tf_login_id.setHorizontalAlignment(SwingConstants.CENTER);
		tf_login_id.setBounds(145, 122, 115, 20);
		add(tf_login_id);
		tf_login_id.setColumns(10);
		
		JLabel label_login_id = new JLabel("아이디");
		label_login_id.setHorizontalAlignment(SwingConstants.RIGHT);
		label_login_id.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_login_id.setBounds(101, 125, 35, 15);
		add(label_login_id);
		
		JLabel label_login_pw = new JLabel("비밀번호");
		label_login_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		label_login_pw.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_login_pw.setBounds(96, 157, 40, 15);
		add(label_login_pw);
		
		tf_login_pw = new JTextField();
		tf_login_pw.setHorizontalAlignment(SwingConstants.CENTER);
		tf_login_pw.setColumns(10);
		tf_login_pw.setBounds(145, 155, 115, 20);
		add(tf_login_pw);
		
		JButton btnLogin = new JButton("");
		btnLogin.setBounds(270, 122, 40, 53);
		add(btnLogin);
		
		JButton btnRegister = new JButton("");
		btnRegister.setBounds(100, 191, 60, 20);
		add(btnRegister);
		
		JButton btnFindId = new JButton("");
		btnFindId.setBounds(172, 191, 60, 20);
		add(btnFindId);
		
		JButton btnFindPw = new JButton("");
		btnFindPw.setBounds(244, 191, 60, 20);
		add(btnFindPw);
		
	}
	
}
