package a4_2;

import java.awt.BorderLayout;
import java.util.ArrayList;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.Font;


public class AnimalListGUI extends JFrame {

	private JPanel contentPane;

	private ArrayList<Animal> animals = new ArrayList<Animal>();
	

	

	
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalListGUI frame = new AnimalListGUI();
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
	public AnimalListGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAnimallist = new JLabel("AnimalList");
		lblAnimallist.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblAnimallist.setBounds(22, 13, 116, 16);
		contentPane.add(lblAnimallist);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(22, 42, 850, 400);
		contentPane.add(textArea);
		
		animals.add(new Cat("Bumeseicus", 7, 3));
		animals.add(new Snake("MediumusOrmus", true));
		animals.add(new Dog("Bamse", "Bamseficus", true, 8));
		animals.add(new Snake("Snokus", false));
		
		for (int i = 0; i < 4; i++) {
			textArea.append(animals.get(i).getInfo());
		}
		
		
	}
}