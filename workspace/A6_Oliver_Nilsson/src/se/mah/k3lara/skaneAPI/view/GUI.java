package se.mah.k3lara.skaneAPI.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;
import javax.swing.ImageIcon;
import java.awt.Color;

public class GUI extends JFrame {

	private JPanel contentPane;
	
	JTextField textFieldSearch;
	JTextField textFieldFrom;
	JTextField textFieldTo;

	JTextArea textAreaStations = new JTextArea();
	JTextArea textAreaJourney = new JTextArea();

	GUI gui = this;

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
		setBounds(100, 100, 620, 421);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(209, 46, 39));

		JPanel panel_left = new JPanel();
		panel_left.setBackground(new Color(209, 46, 39));
		panel_left.setBounds(0, 119, 300, 267);
		contentPane.add(panel_left);
		panel_left.setLayout(null);

		textFieldSearch = new JTextField();
		textFieldSearch.setBounds(10, 27, 134, 20);
		panel_left.add(textFieldSearch);
		textFieldSearch.setColumns(10);

		JButton btnSearchStation = new JButton("Search");
		btnSearchStation.setBounds(10, 58, 89, 23);
		btnSearchStation.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Thread t1 = new StationThread(gui);
				t1.start();
				
			}
		});
		panel_left.add(btnSearchStation);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 92, 275, 164);
		panel_left.add(scrollPane_1);
		scrollPane_1.setViewportView(textAreaStations);

		JLabel lblSearchStations = new JLabel("Search Stations");
		lblSearchStations.setForeground(new Color(255, 255, 255));
		lblSearchStations.setBounds(10, 11, 153, 14);
		panel_left.add(lblSearchStations);

		JPanel panel_right = new JPanel();
		panel_right.setBackground(new Color(209, 46, 39));
		panel_right.setBounds(304, 119, 300, 267);
		contentPane.add(panel_right);
		panel_right.setLayout(null);

		textFieldFrom = new JTextField();
		textFieldFrom.setBounds(10, 28, 134, 20);
		panel_right.add(textFieldFrom);
		textFieldFrom.setColumns(10);

		textFieldTo = new JTextField();
		textFieldTo.setBounds(154, 28, 134, 20);
		panel_right.add(textFieldTo);
		textFieldTo.setColumns(10);

		JLabel lblFrom = new JLabel("From");
		lblFrom.setForeground(new Color(255, 255, 255));
		lblFrom.setBounds(10, 11, 46, 14);
		panel_right.add(lblFrom);

		JLabel lblTo = new JLabel("To");
		lblTo.setForeground(new Color(255, 255, 255));
		lblTo.setBounds(154, 11, 46, 14);
		panel_right.add(lblTo);

		JButton btnSearchJourney = new JButton("Search");
		btnSearchJourney.setBounds(10, 59, 89, 23);
		btnSearchJourney.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Thread t2 = new JourneyThread(gui);
				t2.start();
				
			}
		});
		panel_right.add(btnSearchJourney);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 92, 275, 164);
		panel_right.add(scrollPane);


		scrollPane.setViewportView(textAreaJourney);
		
		JLabel lblNewLabel = new JLabel("Background");
		lblNewLabel.setIcon(new ImageIcon(GUI.class.getResource("/UMLochQuestions/skanetrafiken.jpg")));
		lblNewLabel.setBounds(-18, -115, 643, 377);
		contentPane.add(lblNewLabel);
	}
}