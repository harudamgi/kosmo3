package farm;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class LandlordMainView extends JPanel {

	JTable farm_table;
	
	public LandlordMainView() {
		addLayout();
	}
	
	void addLayout(){

		setLayout(null);
		setBounds(18, 13, 410, 241);
		
		
		JLabel label_landlord_1 = new JLabel("보유 중인 농장 목록");
		label_landlord_1.setHorizontalAlignment(SwingConstants.LEFT);
		label_landlord_1.setFont(new Font("한컴산뜻돋움", Font.BOLD, 22));
		label_landlord_1.setBounds(12, 10, 196, 38);
		add(label_landlord_1);
		
		JButton btn_backToHome_4 = new JButton("");
		btn_backToHome_4.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_backToHome_4.setBounds(368, 10, 30, 30);
		add(btn_backToHome_4);
		
		JScrollPane landlord_scrollPane = new JScrollPane();
		landlord_scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		landlord_scrollPane.setBounds(0, 47, 410, 109);
		add(landlord_scrollPane);
		
		farm_table = new JTable();
		farm_table.setShowVerticalLines(false);
		landlord_scrollPane.setViewportView(farm_table);
		farm_table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(51, 51, 51), null));
		farm_table.setAutoscrolls(true);
		farm_table.setFillsViewportHeight(true);
		farm_table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		farm_table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\uB18D\uC7A5\uBC88\uD638", "\uC9C0\uC5ED", "\uC138\uBD80\uC8FC\uC18C", "\uC7AC\uBC30\uAC00\uB2A5\uC791\uBB3C", "\uC0C1\uD0DC", "\uB300\uC5EC\uAE30\uAC04"
			}
		));
		farm_table.getColumnModel().getColumn(0).setResizable(false);
		farm_table.getColumnModel().getColumn(1).setPreferredWidth(70);
		farm_table.getColumnModel().getColumn(2).setPreferredWidth(100);
		farm_table.getColumnModel().getColumn(3).setPreferredWidth(108);
		farm_table.getColumnModel().getColumn(4).setPreferredWidth(50);
		farm_table.getColumnModel().getColumn(5).setPreferredWidth(100);
		farm_table.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		
		JButton btn_insert_farm = new JButton("");
		btn_insert_farm.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_insert_farm.setBounds(82, 171, 100, 25);
		add(btn_insert_farm);
		
		JButton btn_modify_farm = new JButton("");
		btn_modify_farm.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_modify_farm.setBounds(82, 206, 100, 25);
		add(btn_modify_farm);
		
		JButton btn_statistics_farm = new JButton("");
		btn_statistics_farm.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_statistics_farm.setBounds(232, 206, 100, 25);
		add(btn_statistics_farm);
		
		JButton btn_delete_farm = new JButton("");
		btn_delete_farm.setFont(new Font("한컴산뜻돋움", Font.PLAIN, 12));
		btn_delete_farm.setBounds(232, 171, 100, 25);
		add(btn_delete_farm);
		DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
		centerRenderer.setHorizontalAlignment( JLabel.CENTER );
		farm_table.setDefaultRenderer(String.class, centerRenderer);
		
	}
}
