package assignment1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Assignment1 extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JMenu mnNewMenu;
	private JMenuItem mntmSkrivUt;
	private JMenuItem mntmAvsluta;
	private JMenu mnMedlem;
	private JMenuItem mntmNyMedlem;
	private JMenuItem mntmHittaMedlem;
	private JMenu mnHjlp;
	private JMenuItem mntmHjlp;
	private JMenuItem mntmOmProgrammet;
	private JMenuBar menuBar;
	private JButton btnNewButton;
	private JLabel lblNamn;
	private JLabel lblNewLabel;
	private JLabel lblAdress;
	private JLabel lblTelefonnr;
	private JLabel lblEpost;
	private JLabel lblBild;
	private JLabel lblId;
	private JTextField txtOliverNilsson;
	private JTextField textField;
	private JTextField txtSandbjersgatan;
	private JTextField textField_1;
	private JTextField txtOlivernilssongmailcom;
	private JTextField textField_3;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Assignment1 frame = new Assignment1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Assignment1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 673, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(2, 164, 188, 170);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"Oliver Nilsson"},
				{"Gabe Newell"},
				{"Simon Belmont"},
				{"Jim Raynor"},
				{""},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
				{null},
			},
			new String[] {
				"Namn"
			}
		));
		table.setBackground(Color.WHITE);
		table.setFillsViewportHeight(true);
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 657, 21);
		contentPane.add(menuBar);
		
		mnNewMenu = new JMenu("Arkiv");
		mnNewMenu.setMnemonic('A');
		menuBar.add(mnNewMenu);
		
		mntmSkrivUt = new JMenuItem("Skriv ut");
		mnNewMenu.add(mntmSkrivUt);
		
		mntmAvsluta = new JMenuItem("Avsluta");
		mnNewMenu.add(mntmAvsluta);
		
		mnMedlem = new JMenu("Medlem");
		menuBar.add(mnMedlem);
		
		mntmNyMedlem = new JMenuItem("Ny medlem");
		mnMedlem.add(mntmNyMedlem);
		
		mntmHittaMedlem = new JMenuItem("Hitta medlem");
		mnMedlem.add(mntmHittaMedlem);
		
		mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		mntmOmProgrammet = new JMenuItem("Om programmet");
		mnHjlp.add(mntmOmProgrammet);
		
		btnNewButton = new JButton("\u00C4ndra");
		btnNewButton.setBounds(0, 339, 190, 23);
		contentPane.add(btnNewButton);
		
		lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(200, 171, 46, 14);
		contentPane.add(lblNamn);
		
		lblNewLabel = new JLabel("PersonNr:");
		lblNewLabel.setBounds(200, 191, 58, 14);
		contentPane.add(lblNewLabel);
		
		lblAdress = new JLabel("Adress:");
		lblAdress.setBounds(200, 211, 46, 14);
		contentPane.add(lblAdress);
		
		lblTelefonnr = new JLabel("TelefonNr:");
		lblTelefonnr.setBounds(200, 231, 58, 14);
		contentPane.add(lblTelefonnr);
		
		lblEpost = new JLabel("E-Post:");
		lblEpost.setBounds(200, 251, 46, 14);
		contentPane.add(lblEpost);
		
		lblBild = new JLabel("Bild:");
		lblBild.setBounds(200, 291, 46, 14);
		contentPane.add(lblBild);
		
		lblId = new JLabel("ID:");
		lblId.setBounds(200, 271, 46, 14);
		contentPane.add(lblId);
		
		txtOliverNilsson = new JTextField();
		txtOliverNilsson.setText("Gabe Newell");
		txtOliverNilsson.setBounds(268, 171, 200, 21);
		contentPane.add(txtOliverNilsson);
		txtOliverNilsson.setColumns(10);
		
		textField = new JTextField();
		textField.setText("621103-3333");
		textField.setBounds(268, 191, 200, 21);
		contentPane.add(textField);
		textField.setColumns(10);
		
		txtSandbjersgatan = new JTextField();
		txtSandbjersgatan.setText("10900 Northeast 4th Street");
		txtSandbjersgatan.setBounds(268, 211, 200, 21);
		contentPane.add(txtSandbjersgatan);
		txtSandbjersgatan.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setText("0733333333");
		textField_1.setColumns(10);
		textField_1.setBounds(268, 231, 200, 21);
		contentPane.add(textField_1);
		
		txtOlivernilssongmailcom = new JTextField();
		txtOlivernilssongmailcom.setText("gaben@valvesoftware.com");
		txtOlivernilssongmailcom.setColumns(10);
		txtOlivernilssongmailcom.setBounds(268, 251, 200, 21);
		contentPane.add(txtOlivernilssongmailcom);
		
		textField_3 = new JTextField();
		textField_3.setText("3");
		textField_3.setColumns(10);
		textField_3.setBounds(268, 271, 200, 21);
		contentPane.add(textField_3);
		
		btnNewButton_2 = new JButton("Spara");
		btnNewButton_2.setBounds(198, 339, 134, 23);
		contentPane.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("\u00C5terst\u00E4ll");
		btnNewButton_3.setBounds(334, 339, 134, 23);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1 = new JButton("Bl\u00E4ddra");
		btnNewButton_1.setBounds(268, 291, 200, 23);
		contentPane.add(btnNewButton_1);
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Assignment1.class.getResource("/resources/Naamloos-3.png")));
		lblNewLabel_1.setBounds(493, 168, 141, 157);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Assignment1.class.getResource("/resources/logogym.png")));
		lblNewLabel_2.setBounds(123, 46, 401, 100);
		contentPane.add(lblNewLabel_2);
	}
}
