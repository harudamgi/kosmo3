package farm;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FindIdView extends JPanel {
	private JTextField tf_findId_name;
	private JTextField tf_findId_email;
	private JTextField tf_findId_result;
	
	public FindIdView() {
		addLayout();
	}
	
	void addLayout() {

		setLayout(null);
		setBounds(18, 13, 410, 241);
		
		
		tf_findId_name = new JTextField();
		tf_findId_name.setHorizontalAlignment(SwingConstants.CENTER);
		tf_findId_name.setColumns(10);
		tf_findId_name.setBounds(141, 109, 115, 20);
		add(tf_findId_name);
		
		JLabel label_findId_name = new JLabel("이름");
		label_findId_name.setHorizontalAlignment(SwingConstants.RIGHT);
		label_findId_name.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_findId_name.setBounds(97, 112, 35, 15);
		add(label_findId_name);
		
		JLabel label_findId_email = new JLabel("이메일");
		label_findId_email.setHorizontalAlignment(SwingConstants.RIGHT);
		label_findId_email.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_findId_email.setBounds(92, 141, 40, 15);
		add(label_findId_email);
		
		tf_findId_email = new JTextField();
		tf_findId_email.setHorizontalAlignment(SwingConstants.CENTER);
		tf_findId_email.setColumns(10);
		tf_findId_email.setBounds(141, 139, 115, 20);
		add(tf_findId_email);
		
		JButton btn_findId_send = new JButton("");
		btn_findId_send.setBounds(266, 108, 40, 53);
		add(btn_findId_send);
		
		JLabel label_findId = new JLabel("ID 찾기");
		label_findId.setFont(new Font("한컴산뜻돋움", Font.BOLD, 22));
		label_findId.setHorizontalAlignment(SwingConstants.CENTER);
		label_findId.setBounds(160, 23, 87, 38);
		add(label_findId);
		
		JLabel label_findId2 = new JLabel("가입하신 이름과 이메일주소를 입력하세요.");
		label_findId2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		label_findId2.setHorizontalAlignment(SwingConstants.CENTER);
		label_findId2.setBounds(84, 71, 236, 15);
		add(label_findId2);
		
		JButton btn_backToHome_2 = new JButton("");
		btn_backToHome_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_backToHome_2.setBounds(368, 10, 30, 30);
		add(btn_backToHome_2);
		
		tf_findId_result = new JTextField();
		tf_findId_result.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		tf_findId_result.setEditable(false);
		tf_findId_result.setBounds(117, 183, 170, 28);
		add(tf_findId_result);
		tf_findId_result.setColumns(10);
	}
}
