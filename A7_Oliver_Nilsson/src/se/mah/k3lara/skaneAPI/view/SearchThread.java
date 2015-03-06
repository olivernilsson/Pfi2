package se.mah.k3lara.skaneAPI.view;

public class SearchThread extends Thread {
	private GUI gui;
	
	public SearchThread(GUI g){
		this.gui = g;
	}
	
	public void run() {
		while (true){
			
			//Every 30 sec, make a new query to Skånetrafiken, then update the GUI.
			try{
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			gui.UpdateLabels();
		}		
	}

}