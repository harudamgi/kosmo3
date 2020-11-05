package farm;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FindPassView extends JPanel {
	private JTextField tf_findPw_id;
	private JTextField tf_findPw_email;
	private JTextField tf_findPw_result;
	
	public FindPassView () {
		addLayout();
	}
	
	void addLayout() {
		
		setLayout(null);
		setBounds(18, 13, 410, 241);
		
		tf_findPw_id = new JTextField();
		tf_findPw_id.setHorizontalAlignment(SwingConstants.CENTER);
		tf_findPw_id.setColumns(10);
		tf_findPw_id.setBounds(141, 109, 115, 20);
		add(tf_findPw_id);
		
		JLabel label_findPw_id = new JLabel("아이디");
		label_findPw_id.setHorizontalAlignment(SwingConstants.RIGHT);
		label_findPw_id.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_findPw_id.setBounds(97, 112, 35, 15);
		add(label_findPw_id);
		
		JLabel label_findPw_email = new JLabel("이메일");
		label_findPw_email.setHorizontalAlignment(SwingConstants.RIGHT);
		label_findPw_email.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_findPw_email.setBounds(92, 141, 40, 15);
		add(label_findPw_email);
		
		tf_findPw_email = new JTextField();
		tf_findPw_email.setHorizontalAlignment(SwingConstants.CENTER);
		tf_findPw_email.setColumns(10);
		tf_findPw_email.setBounds(141, 139, 115, 20);
		add(tf_findPw_email);
		
		JButton btn_findPw_send = new JButton("");
		btn_findPw_send.setBounds(266, 108, 40, 53);
		add(btn_findPw_send);
		
		JLabel label_findPw = new JLabel("비밀번호 찾기");
		label_findPw.setHorizontalAlignment(SwingConstants.CENTER);
		label_findPw.setFont(new Font("한컴산뜻돋움", Font.BOLD, 22));
		label_findPw.setBounds(137, 23, 132, 38);
		add(label_findPw);
		
		JLabel label_findPw_1 = new JLabel("가입하신 아이디와 이메일주소를 입력하세요.");
		label_findPw_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_findPw_1.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		label_findPw_1.setBounds(84, 71, 236, 15);
		add(label_findPw_1);
		
		JButton btn_backToHome_3 = new JButton("");
		btn_backToHome_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_backToHome_3.setBounds(368, 10, 30, 30);
		add(btn_backToHome_3);
		
		tf_findPw_result = new JTextField();
		tf_findPw_result.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		tf_findPw_result.setEditable(false);
		tf_findPw_result.setColumns(10);
		tf_findPw_result.setBounds(117, 183, 170, 28);
		add(tf_findPw_result);
	}
}
