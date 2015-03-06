package a5;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.util.Random; 

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
//asd

public class DigitalClockGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldHour;
	private JTextField textFieldMinutes;
	private ClockLogic clockLogic; 
	
	JLabel lblAlarmClock = new JLabel("");
	JLabel lblAlarmSet = new JLabel("Alarm off");
	JButton btnClearAlarm = new JButton("Clear Alarm");
	JLabel lblErrorMessage = new JLabel("");
	JLabel lblAlarmMessage = new JLabel("");
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DigitalClockGUI frame = new DigitalClockGUI();
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
	public DigitalClockGUI() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(DigitalClockGUI.class.getResource("/images/clock.png")));
		setFont(new Font("Arial Unicode MS", Font.BOLD, 25));
		setTitle("Alarm Clock");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 356);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 0, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAlarmClock.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmClock.setFont(new Font("Cambria", Font.BOLD, 28));
		lblAlarmClock.setForeground(Color.WHITE);
		lblAlarmClock.setBackground(Color.WHITE);
		lblAlarmClock.setBounds(411, 10, 237, 45);
		contentPane.add(lblAlarmClock);
		
		textFieldHour = new JTextField();
		textFieldHour.setBounds(381, 228, 70, 30);
		contentPane.add(textFieldHour);
		textFieldHour.setColumns(10);
		
		textFieldMinutes = new JTextField();
		textFieldMinutes.setColumns(10);
		textFieldMinutes.setBounds(381, 271, 70, 30);
		contentPane.add(textFieldMinutes);
		
		JLabel lblHour = new JLabel("Hour:");
		lblHour.setFont(new Font("Cambria", Font.PLAIN, 24));
		lblHour.setForeground(Color.BLACK);
		lblHour.setBounds(311, 218, 63, 40);
		contentPane.add(lblHour);

		JLabel lblMinutes = new JLabel("Minutes:");
		lblMinutes.setForeground(Color.BLACK);
		lblMinutes.setFont(new Font("Cambria", Font.PLAIN, 24));
		lblMinutes.setBounds(282, 259, 89, 45);
		contentPane.add(lblMinutes);

		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			    int hourCheck = Integer.parseInt(textFieldHour.getText());
			    int minuteCheck = Integer.parseInt(textFieldMinutes.getText());

			    if (hourCheck < 0 || hourCheck >= 24 || minuteCheck < 0 || minuteCheck >= 60) {
			     lblErrorMessage.setText("Something went wrong.");
			    } else {
			     String alarmHoursZero = "";
			     String alarmMinutesZero = "";
			     
			     if (hourCheck <= 9){
			      alarmHoursZero = "0";
			     }
			     if (minuteCheck <= 9){
			      alarmMinutesZero = "0";
			     }
			     
			     lblAlarmSet.setText("Alarm Set: " + alarmHoursZero + hourCheck + ":" + alarmMinutesZero + minuteCheck);
			     
			     clockLogic.setAlarm(hourCheck, minuteCheck);

				//lblAlarmSet.setText("Alarm Set " + textFieldHour.getText() + ":" + textFieldMinutes.getText());
				textFieldHour.setText(null);
				textFieldMinutes.setText(null);
				
				alarmHoursZero = "";
			    alarmMinutesZero = "";
			    
			    lblErrorMessage.setText(null);
			    lblAlarmMessage.setText(null);
			}
			}
			});
		btnSetAlarm.setForeground(Color.BLACK);
		btnSetAlarm.setFont(new Font("Cambria", Font.PLAIN, 24));
		btnSetAlarm.setBounds(461, 224, 188, 40);
		contentPane.add(btnSetAlarm);
		

		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textFieldHour.setText(null);
				textFieldMinutes.setText(null);
				lblAlarmSet.setText("Alarm off");
				clockLogic.clearAlarm();
			}
		});
		btnClearAlarm.setForeground(Color.BLACK);
		btnClearAlarm.setFont(new Font("Cambria", Font.PLAIN, 24));
		btnClearAlarm.setBounds(461, 267, 188, 40);
		contentPane.add(btnClearAlarm);
		
		lblAlarmSet.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmSet.setForeground(Color.WHITE);
		lblAlarmSet.setFont(new Font("Cambria", Font.PLAIN, 24));
		lblAlarmSet.setBackground(Color.WHITE);
		lblAlarmSet.setBounds(411, 60, 237, 40);
		contentPane.add(lblAlarmSet);
		lblErrorMessage.setHorizontalAlignment(SwingConstants.CENTER);
		
		lblErrorMessage.setFont(new Font("Cambria", Font.PLAIN, 24));
		lblErrorMessage.setForeground(Color.WHITE);
		lblErrorMessage.setBounds(392, 160, 267, 36);
		contentPane.add(lblErrorMessage);
		lblAlarmMessage.setHorizontalAlignment(SwingConstants.CENTER);
		lblAlarmMessage.setFont(new Font("Cambria", Font.PLAIN, 24));
		lblAlarmMessage.setForeground(Color.WHITE);
		
		
		lblAlarmMessage.setBounds(411, 110, 237, 45);
		contentPane.add(lblAlarmMessage);
		
		JLabel imageBackground = new JLabel("");
		imageBackground.setBackground(Color.WHITE);
		imageBackground.setIcon(new ImageIcon(DigitalClockGUI.class.getResource("/images/enealarm.jpg")));
		imageBackground.setBounds(0, 0, 660, 320);
		contentPane.add(imageBackground);
		
		clockLogic = new ClockLogic(this);

	}
	public void setTimeOnLabel (String time){
		lblAlarmClock.setText(time);
	}
	
	public void alarm (boolean activate){
			lblAlarmMessage.setText("Wake up!");
		
	}
}