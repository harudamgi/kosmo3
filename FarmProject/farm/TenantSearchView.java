package farm;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

public class TenantSearchView extends JPanel {

	private JTextField tfTenantStartDate;
	private JTable searchTable;
	
	public TenantSearchView() {
		addLayout();
	}
	
	void addLayout() {
		
		setLayout(null);
		setBounds(18, 13, 410, 241);
		
		JLabel tenantSearchLabel_1 = new JLabel("농장 검색하기");
		tenantSearchLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		tenantSearchLabel_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 16));
		tenantSearchLabel_1.setBounds(157, 10, 101, 34);
		add(tenantSearchLabel_1);
		
		JLabel tenantSearchLabel_2 = new JLabel("대여를 원하는 농장의 지역과 희망작물, 시작일을 선택하세요.");
		tenantSearchLabel_2.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		tenantSearchLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		tenantSearchLabel_2.setBounds(33, 48, 346, 15);
		add(tenantSearchLabel_2);
		
		JComboBox cboxRegion_large = new JComboBox();
		cboxRegion_large.setModel(new DefaultComboBoxModel(new String[] {"지역(대분류)", "서울", "경기", "강원", "충북", "충남", "경북", "경남", "전북", "전남", "제주"}));
		cboxRegion_large.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		cboxRegion_large.setBounds(32, 73, 92, 20);
		add(cboxRegion_large);
		
		JComboBox cboxRegion_small = new JComboBox();
		cboxRegion_small.setModel(new DefaultComboBoxModel(new String[] {"지역(소분류)"}));
		cboxRegion_small.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		cboxRegion_small.setBounds(128, 73, 92, 20);
		add(cboxRegion_small);
		
		JComboBox cboxCrop = new JComboBox();
		cboxCrop.setModel(new DefaultComboBoxModel(new String[] {"희망작물"}));
		cboxCrop.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		cboxCrop.setBounds(279, 73, 100, 20);
		add(cboxCrop);
		
		JLabel tenantSearchLabel_3 = new JLabel("시작일");
		tenantSearchLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		tenantSearchLabel_3.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		tenantSearchLabel_3.setBounds(30, 108, 42, 15);
		add(tenantSearchLabel_3);
		
		tfTenantStartDate = new JTextField();
		tfTenantStartDate.setBounds(73, 106, 71, 20);
		add(tfTenantStartDate);
		tfTenantStartDate.setColumns(10);
		
		JButton btnCalendar = new JButton("");
		btnCalendar.setBounds(147, 106, 20, 20);
		add(btnCalendar);
		
		JLabel tenantSearchLabel_4 = new JLabel("기간설정");
		tenantSearchLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		tenantSearchLabel_4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		tenantSearchLabel_4.setBounds(216, 108, 42, 15);
		add(tenantSearchLabel_4);
		
		JRadioButton Rbtn_6month = new JRadioButton("6개월");
		Rbtn_6month.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		Rbtn_6month.setBounds(266, 104, 55, 23);
		add(Rbtn_6month);
		
		JRadioButton Rbtn_12month = new JRadioButton("12개월");
		Rbtn_12month.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 11));
		Rbtn_12month.setBounds(324, 104, 71, 23);
		add(Rbtn_12month);
		
		JScrollPane searchScrollPane = new JScrollPane();
		searchScrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		searchScrollPane.setBounds(0, 138, 410, 92);
		add(searchScrollPane);
		
		searchTable = new JTable();
		searchTable.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"\uB18D\uC7A5\uBC88\uD638", "\uC9C0\uC5ED", "\uC138\uBD80\uC8FC\uC18C", "\uC7AC\uBC30\uAC00\uB2A5\uC791\uBB3C", "\uC0C1\uD0DC"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		searchTable.getColumnModel().getColumn(0).setResizable(false);
		searchTable.getColumnModel().getColumn(0).setPreferredWidth(58);
		searchTable.getColumnModel().getColumn(1).setResizable(false);
		searchTable.getColumnModel().getColumn(1).setPreferredWidth(69);
		searchTable.getColumnModel().getColumn(2).setResizable(false);
		searchTable.getColumnModel().getColumn(2).setPreferredWidth(95);
		searchTable.getColumnModel().getColumn(3).setResizable(false);
		searchTable.getColumnModel().getColumn(3).setPreferredWidth(86);
		searchTable.getColumnModel().getColumn(4).setResizable(false);
		searchTable.getColumnModel().getColumn(4).setPreferredWidth(36);
		searchTable.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		searchScrollPane.setViewportView(searchTable);
		
		JButton btn_backToHome = new JButton("");
		btn_backToHome.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_backToHome.setBounds(368, 10, 30, 30);
		add(btn_backToHome);
		
		//JButton btnSelect = new JButton("");
		//btnSelect.setBounds(177, 235, 80, 20);
		//add(btnSelect);
	}
	
}
