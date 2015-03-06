package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;

import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class StationThread extends Thread {

	private GUI gui;

	
	public StationThread(GUI gui) {

		this.gui = gui;
	}

	public void run() {
		
		gui.textAreaStations.setText(null);
		gui.textAreaStations.setText("Searching...");
		ArrayList<Station> searchStations = new ArrayList<Station>();
		searchStations.addAll(Parser.getStationsFromURL(gui.textFieldSearch.getText()));
		gui.textAreaStations.setText(null);
		for (Station s : searchStations) {
			gui.textAreaStations.append(s.getStationName() + " number:" + s.getStationNbr() + " Latitude: " + s.getLatitude() + " Longitude: " + s.getLongitude() + "\n");
		}

		
	}

}