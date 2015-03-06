package se.mah.k3lara.skaneAPI.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextArea;
import java.awt.Component;

@SuppressWarnings("serial")
public class GUI extends JFrame {

	private JPanel contentPane;
	
	@SuppressWarnings("unused")
	private SearchThread t;

	JLabel labelTitle = new JLabel("Ub\u00E5tshallen");
	JLabel lblLinje = new JLabel("Linje");
	JLabel lblNewLabel = new JLabel("Destination");
	JLabel lblNewLabel_1 = new JLabel("Avg\u00E5r");

	JTextArea textArea = new JTextArea();
	
	JTextArea textArea_1 = new JTextArea();

	JTextArea textArea_2 = new JTextArea();

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI frame = new GUI();
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
	public GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 479, 321);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textArea.setFont(new Font("Tahoma", Font.BOLD, 13));
		textArea.setForeground(Color.ORANGE);
		textArea.setBackground(Color.BLACK);
		
		
		textArea.setBounds(20, 80, 20, 202);
		contentPane.add(textArea);
		textArea_1.setBackground(Color.BLACK);
		textArea_1.setForeground(Color.ORANGE);
		textArea_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		
		
		textArea_1.setBounds(88, 80, 221, 202);
		contentPane.add(textArea_1);
		textArea_2.setBackground(Color.BLACK);
		textArea_2.setForeground(Color.ORANGE);
		textArea_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		textArea_2.setAlignmentX(RIGHT_ALIGNMENT);
		
		textArea_2.setBounds(360, 80, 93, 202);
		contentPane.add(textArea_2);
		
		JLabel lblLinje_1 = new JLabel("Linje");
		lblLinje_1.setForeground(Color.LIGHT_GRAY);
		lblLinje_1.setBounds(20, 60, 46, 14);
		contentPane.add(lblLinje_1);
		
		JLabel lblNewLabel_2 = new JLabel("Destination");
		lblNewLabel_2.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_2.setBounds(88, 60, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Avg\u00E5r");
		lblNewLabel_3.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_3.setBounds(360, 60, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Ub\u00E5tshallen");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblNewLabel_4.setForeground(Color.LIGHT_GRAY);
		lblNewLabel_4.setBounds(170, 11, 123, 27);
		contentPane.add(lblNewLabel_4);

		UpdateLabels();
		
		Thread t = new SearchThread(this);
		t.start();
	}

	public void UpdateLabels(){
		System.out.println("Updating");
		Lines lines = Parser.getStationResults(new Station("80046"));
			int i=0;
		
		textArea.setText("");
		textArea_1.setText("");
		textArea_2.setText("");
		
		for (Line l : lines.getLines()) {
		
		if(l.getStopPoint().equals("B")){
		
		textArea.append(l.getLine() + "\n\n");
		
		textArea_1.append(l.getTowards() + "\n\n");

				if(l.getDepTimeDeviation() != ""){
				
					textArea_2.append(clockFix(l.getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + clockFix(l.getDepTime().get(Calendar.MINUTE)) +" +"+ l.getDepTimeDeviation() + "\n\n");
				}
				
				else{
					
					textArea_2.append(clockFix(l.getDepTime().get(Calendar.HOUR_OF_DAY)) + ":" + clockFix(l.getDepTime().get(Calendar.MINUTE)) + "\n\n");
				}
				
				i++;
				if(i==5){
					
					break;
				}
				
			}
			
		}
	
	}

	public String clockFix(int time){

		String zero = "";

		if (time < 10) {
			zero = "0";
		}

		String finalTimeString = zero + Integer.toString(time);

		zero = "";
		
		return finalTimeString;
	}
}