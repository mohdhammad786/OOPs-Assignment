package com.components;

public class SolarPanel  {
	private int noOfPanels;
	private int solarPanelWatts;
	public SolarPanel(int noOfPanels,int solarPanelWatts) {
		this.noOfPanels=noOfPanels;
		this.solarPanelWatts=solarPanelWatts;
	}
	public int getPanelsCount() {
		return noOfPanels;
	}
	public int getWatts() {
		return solarPanelWatts;
	}
	public static void main(String[] args) {
		SolarPanel sp =new SolarPanel(1,2);
		System.out.println(sp.noOfPanels);
	}

}
