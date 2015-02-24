
package se.mah.k3lara.skaneAPI.view;

import java.util.Calendar;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

public class JourneyThread extends Thread {

	private GUI gui;

	public JourneyThread(GUI gui) {

		this.gui = gui;
	}

	public void run() {
		gui.textAreaJourney.setText(null);
		gui.textAreaJourney.setText("Searching...");
		
		
		String searchURL = Constants.getURL(gui.textFieldFrom.getText(),gui.textFieldTo.getText(), 1); //Malmo C = 80000,  Lund C, 81216 Malmo Gatorg 80100, Hässleholm C 93070
		
		Journeys journeys = Parser.getJourneys(searchURL);
		for (Journey journey : journeys.getJourneys()) {
			gui.textAreaJourney.setText(null);
			gui.textAreaJourney.append(journey.getStartStation()+" - " +journey.getEndStation() + "  ");
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			gui.textAreaJourney.append(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 

	}

}