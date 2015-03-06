package uppgift1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class HouseGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
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
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 323, 385);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		House house1 = new House(1953, 500);
		int house1Year = house1.getYearBuilt();
		int house1Size = house1.getSize();
		if(house1Year==0 || house1Size==0){
			
			System.out.println("An error has occurred");
		}
		
		else{
		System.out.println(house1Year +  " " + house1Size);
		}
		House house2 = new House(1970, 350);
		int house2Year = house2.getYearBuilt();
		int house2Size = house2.getSize();
		if(house2Year==0 || house2Size==0){
			
			System.out.println("An error has occurred");
		}
		
		else{
		System.out.println(house2Year +  " " + house2Size);
		}
		
		House house3 = new House(2001, 700);
		int house3Year = house3.getYearBuilt();
		int house3Size = house3.getSize();
		if(house3Year==0 || house3Size==0){
			
			System.out.println("An error has occurred");
		}
		
		else{
		System.out.println(house3Year +  " " + house3Size);
		}
		String hus = "Ett hus från ";
		String somAr = " som är ";
		String kvm = " kvm stort";
		String storlek1 = ("som är " + house1Size + " kvm stort");
		String storlek2 = ("som är " + house2Size + " kvm stort");
		String storlek3 = ("som är " + house3Size + " kvm stort");
		
		
		House[] house;
		house = new House[10];
		
		house[0] = new House(1999, 150);
		System.out.println(house[0].getYearBuilt() + " " + house[0].getSize());
		
		house[1] = new House(1983, 250);
		System.out.println(house[1].getYearBuilt() + " " + house[1].getSize());
		
		house[2] = new House(1911, 350);
		System.out.println(house[2].getYearBuilt() + " " + house[2].getSize());
		
		house[3] = new House(1899, 175);
		System.out.println(house[3].getYearBuilt() + " " + house[3].getSize());
		
		house[4] = new House(1987, 240);
		System.out.println(house[4].getYearBuilt() + " " + house[4].getSize());
		
		house[5] = new House(1966, 340);
		System.out.println(house[5].getYearBuilt() + " " + house[5].getSize());
		
		house[6] = new House(1979, 850);
		System.out.println(house[6].getYearBuilt() + " " + house[6].getSize());
		
		house[7] = new House(1922, 290);
		System.out.println(house[7].getYearBuilt() + " " + house[7].getSize());
		
		house[8] = new House(1945, 550);
		System.out.println(house[8].getYearBuilt() + " " + house[8].getSize());
		
		house[9] = new House(1933, 450);
		System.out.println(house[9].getYearBuilt() + " " + house[9].getSize());
		
		System.out.println("\n" + "Uppgift 1.3" + "\n");
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 0, 308, 348);
		contentPane.add(scrollPane);
		JTextArea txtrSystemoutprintlnhouseyear = new JTextArea();
		scrollPane.setViewportView(txtrSystemoutprintlnhouseyear);
		txtrSystemoutprintlnhouseyear.setText(String.valueOf("Uppgift 1.2" + "\n" + hus + house1Year + " " + storlek1 + "\n" + hus + house2Year + " " + storlek2 + "\n" + hus + house3Year + " " + storlek3 + "\n" + "Uppgift 1.3" + "\n"));
		
		for(int i=0; i<10; i++){
		txtrSystemoutprintlnhouseyear.append(hus + house[i].getYearBuilt() + somAr + house[i].getSize() + kvm + "\n");
		}
		
		System.out.println(house[3]);
		txtrSystemoutprintlnhouseyear.append("Uppgift 1.4" + "\n");
		
		
		Random rand = new Random();
		ArrayList<House> houses;
		houses = new ArrayList<House>();
		for(int i=0; i<100; i++){
			int r = rand.nextInt(210) + 1801;
			int n = rand.nextInt(899) + 100;
			
			House houseNew = new House(r, n);
			
			houses.add(i, houseNew);
			txtrSystemoutprintlnhouseyear.append(hus + houses.get(i).getYearBuilt() + somAr + houses.get(i).getSize() + kvm + "\n");
			
		}
	}
}


