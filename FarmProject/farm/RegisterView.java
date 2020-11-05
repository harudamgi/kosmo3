package farm;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RegisterView extends JPanel {
	
	private JTextField tf_regi_id;
	private JTextField tf_regi_pw;
	private JTextField tf_regi_jumin;
	private JTextField tf_regi_name;
	private JTextField tf_regi_addr;
	private JTextField tf_regi_tel;
	private JTextField tf_regi_email;

	public RegisterView() {
		addLayout();
	}
	
	void addLayout() {

		setLayout(null);
		setBounds(18, 13, 410, 241);
		
		
		tf_regi_id = new JTextField();
		tf_regi_id.setHorizontalAlignment(SwingConstants.CENTER);
		tf_regi_id.setColumns(10);
		tf_regi_id.setBounds(61, 48, 115, 20);
		add(tf_regi_id);
		
		JLabel label_regi_id = new JLabel("아이디");
		label_regi_id.setHorizontalAlignment(SwingConstants.RIGHT);
		label_regi_id.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_regi_id.setBounds(17, 51, 35, 15);
		add(label_regi_id);
		
		JLabel label_regi_pw = new JLabel("비밀번호");
		label_regi_pw.setHorizontalAlignment(SwingConstants.RIGHT);
		label_regi_pw.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_regi_pw.setBounds(12, 76, 40, 15);
		add(label_regi_pw);
		
		tf_regi_pw = new JTextField();
		tf_regi_pw.setHorizontalAlignment(SwingConstants.CENTER);
		tf_regi_pw.setColumns(10);
		tf_regi_pw.setBounds(61, 73, 115, 20);
		add(tf_regi_pw);
		
		JRadioButton rdbtn_select_ll = new JRadioButton("농장주");
		rdbtn_select_ll.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		rdbtn_select_ll.setBounds(17, 19, 61, 23);
		add(rdbtn_select_ll);
		
		JRadioButton rdbtn_select_customer = new JRadioButton("체험자");
		rdbtn_select_customer.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		rdbtn_select_customer.setBounds(107, 19, 61, 23);
		add(rdbtn_select_customer);
		
		tf_regi_jumin = new JTextField();
		tf_regi_jumin.setHorizontalAlignment(SwingConstants.CENTER);
		tf_regi_jumin.setColumns(10);
		tf_regi_jumin.setBounds(61, 123, 115, 20);
		add(tf_regi_jumin);
		
		JLabel label_regi_jumin = new JLabel("주민번호");
		label_regi_jumin.setBackground(Color.WHITE);
		label_regi_jumin.setHorizontalAlignment(SwingConstants.RIGHT);
		label_regi_jumin.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_regi_jumin.setBounds(12, 126, 40, 15);
		add(label_regi_jumin);
		
		tf_regi_name = new JTextField();
		tf_regi_name.setHorizontalAlignment(SwingConstants.CENTER);
		tf_regi_name.setColumns(10);
		tf_regi_name.setBounds(61, 98, 115, 20);
		add(tf_regi_name);
		
		JLabel label_regi_name = new JLabel("이름");
		label_regi_name.setHorizontalAlignment(SwingConstants.RIGHT);
		label_regi_name.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_regi_name.setBounds(17, 101, 35, 15);
		add(label_regi_name);
		
		tf_regi_addr = new JTextField();
		tf_regi_addr.setHorizontalAlignment(SwingConstants.CENTER);
		tf_regi_addr.setColumns(10);
		tf_regi_addr.setBounds(61, 198, 115, 20);
		add(tf_regi_addr);
		
		JLabel label_regi_addr = new JLabel("주소");
		label_regi_addr.setHorizontalAlignment(SwingConstants.RIGHT);
		label_regi_addr.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_regi_addr.setBackground(Color.WHITE);
		label_regi_addr.setBounds(12, 201, 40, 15);
		add(label_regi_addr);
		
		JLabel label_regi_tel = new JLabel("전화번호");
		label_regi_tel.setHorizontalAlignment(SwingConstants.RIGHT);
		label_regi_tel.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_regi_tel.setBounds(12, 176, 40, 15);
		add(label_regi_tel);
		
		tf_regi_tel = new JTextField();
		tf_regi_tel.setHorizontalAlignment(SwingConstants.CENTER);
		tf_regi_tel.setColumns(10);
		tf_regi_tel.setBounds(61, 173, 115, 20);
		add(tf_regi_tel);
		
		tf_regi_email = new JTextField();
		tf_regi_email.setHorizontalAlignment(SwingConstants.CENTER);
		tf_regi_email.setColumns(10);
		tf_regi_email.setBounds(61, 148, 115, 20);
		add(tf_regi_email);
		
		JLabel label_regi_email = new JLabel("이메일");
		label_regi_email.setHorizontalAlignment(SwingConstants.RIGHT);
		label_regi_email.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_regi_email.setBounds(12, 151, 40, 15);
		add(label_regi_email);
		
		JButton btn_register_confirm = new JButton("");
		btn_register_confirm.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_register_confirm.setBounds(211, 198, 60, 20);
		add(btn_register_confirm);
		
		JButton btn_backToHome = new JButton("");
		btn_backToHome.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_backToHome.setBounds(368, 10, 30, 30);
		add(btn_backToHome);
	}
	
}
