package farm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class LandlordInsertView extends JPanel {

	private JTable farm_table;
	private JTextField tf_region;
	private JTextField tf_size;
	private JTextField tf_cropable;
	private JTextField tf_charge;
	
	public LandlordInsertView () {
		addLayout();
	}
	
	void addLayout() {

		setLayout(null);
		setBounds(18, 13, 410, 241);
		
		
		JLabel label_landlord_insert_1 = new JLabel("농장 추가");
		label_landlord_insert_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_landlord_insert_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 22));
		label_landlord_insert_1.setBounds(12, 10, 196, 38);
		add(label_landlord_insert_1);
		
		tf_region = new JTextField();
		tf_region.setHorizontalAlignment(SwingConstants.CENTER);
		tf_region.setColumns(10);
		tf_region.setBounds(84, 58, 115, 20);
		add(tf_region);
		
		JLabel label_region = new JLabel("지역");
		label_region.setHorizontalAlignment(SwingConstants.RIGHT);
		label_region.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_region.setBounds(42, 61, 35, 15);
		add(label_region);
		
		tf_size = new JTextField();
		tf_size.setHorizontalAlignment(SwingConstants.CENTER);
		tf_size.setColumns(10);
		tf_size.setBounds(84, 82, 50, 20);
		add(tf_size);
		
		JLabel label_size = new JLabel("면적");
		label_size.setHorizontalAlignment(SwingConstants.RIGHT);
		label_size.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		label_size.setBounds(42, 84, 35, 15);
		add(label_size);
		
		JLabel label_size_m = new JLabel("m²");
		label_size_m.setHorizontalAlignment(SwingConstants.LEFT);
		label_size_m.setFont(new Font("한컴산뜻돋움", Font.BOLD, 13));
		label_size_m.setBounds(136, 84, 23, 15);
		add(label_size_m);
		
		JLabel label_cropable = new JLabel("재배\r\n가능작물");
		label_cropable.setHorizontalAlignment(SwingConstants.RIGHT);
		label_cropable.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 9));
		label_cropable.setBounds(30, 92, 50, 43);
		add(label_cropable);
		
		tf_cropable = new JTextField();
		tf_cropable.setHorizontalAlignment(SwingConstants.CENTER);
		tf_cropable.setColumns(10);
		tf_cropable.setBounds(84, 106, 115, 40);
		add(tf_cropable);
		
		JLabel label_period = new JLabel("등록기간");
		label_period.setHorizontalAlignment(SwingConstants.RIGHT);
		label_period.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 9));
		label_period.setBounds(30, 143, 50, 43);
		add(label_period);
		
		JRadioButton rdbtn_period_1y = new JRadioButton("1년");
		rdbtn_period_1y.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		rdbtn_period_1y.setBounds(88, 152, 43, 23);
		add(rdbtn_period_1y);
		
		JRadioButton rdbtn_period_2y = new JRadioButton("2년");
		rdbtn_period_2y.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		rdbtn_period_2y.setBounds(152, 152, 43, 23);
		add(rdbtn_period_2y);
		
		JLabel label_charge = new JLabel("이용료 책정");
		label_charge.setHorizontalAlignment(SwingConstants.RIGHT);
		label_charge.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 9));
		label_charge.setBounds(30, 173, 50, 28);
		add(label_charge);
		
		tf_charge = new JTextField();
		tf_charge.setHorizontalAlignment(SwingConstants.CENTER);
		tf_charge.setColumns(10);
		tf_charge.setBounds(84, 178, 50, 20);
		add(tf_charge);
		
		JLabel label_charge_2 = new JLabel("원 / 6개월");
		label_charge_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_charge_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		label_charge_2.setBounds(138, 180, 61, 15);
		add(label_charge_2);
		
		JButton btn_insertFarm = new JButton("");
		btn_insertFarm.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_insertFarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btn_backToHome_5 = new JButton("");
		btn_backToHome_5.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_backToHome_5.setBounds(368, 10, 30, 30);
		add(btn_backToHome_5);
		btn_insertFarm.setBounds(180, 206, 50, 25);
		add(btn_insertFarm);
		
		JLabel label_cropable_2 = new JLabel("입력 예시) 감자, 딸기, 브로콜리 (O)");
		label_cropable_2.setVerticalAlignment(SwingConstants.TOP);
		label_cropable_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_cropable_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 10));
		label_cropable_2.setBounds(203, 107, 149, 15);
		add(label_cropable_2);
		
		JLabel label_cropable_3 = new JLabel("감자 딸기 브로콜리 (X)");
		label_cropable_3.setForeground(Color.RED);
		label_cropable_3.setVerticalAlignment(SwingConstants.TOP);
		label_cropable_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_cropable_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 10));
		label_cropable_3.setBounds(249, 122, 100, 15);
		add(label_cropable_3);
		
		JLabel label_period_2 = new JLabel("시스템에 등록될 기간을 선택해주세요.");
		label_period_2.setVerticalAlignment(SwingConstants.TOP);
		label_period_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_period_2.setForeground(Color.BLACK);
		label_period_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 10));
		label_period_2.setBounds(203, 156, 165, 15);
		add(label_period_2);
		
		JLabel label_charge_3 = new JLabel("6개월당 이용료를 책정해주세요. (단위: 원)");
		label_charge_3.setVerticalAlignment(SwingConstants.TOP);
		label_charge_3.setHorizontalAlignment(SwingConstants.LEFT);
		label_charge_3.setForeground(Color.BLACK);
		label_charge_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 10));
		label_charge_3.setBounds(203, 180, 180, 15);
		add(label_charge_3);
		
		JLabel label_region_2 = new JLabel("등록할 농장의 상세주소를 기입해주세요.");
		label_region_2.setVerticalAlignment(SwingConstants.TOP);
		label_region_2.setHorizontalAlignment(SwingConstants.LEFT);
		label_region_2.setForeground(Color.BLACK);
		label_region_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 10));
		label_region_2.setBounds(203, 61, 165, 15);
		add(label_region_2);
	}
	
}
