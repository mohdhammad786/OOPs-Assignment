package com.components;
import com.invertors.SolarInverter;
public class Sunlight  {
	public static int recharge (SolarInverter obj,int hours,boolean Noneflag) {//no battery no on grid
		int noOfSolarPanels= obj.solarPanel.getPanelsCount();
		int watts= obj.solarPanel.getWatts();
		return hours*noOfSolarPanels*watts;
	}
	public static void recharge (SolarInverter obj,int hours) {
		int noOfSolarPanels= obj.solarPanel.getPanelsCount();
		int watts= obj.solarPanel.getWatts();
		if(obj.gridOnSystem!=null && obj.battery!=null) {
			if(obj.gridOnSystem.getSellMode()==false) {
				int currentCapacity = obj.battery.getcurrentCapacity();
				currentCapacity+=hours*noOfSolarPanels*watts;
				obj.battery.increasePower(currentCapacity);
			}
			else {
				obj.gridOnSystem.transferEnergyToTheBuyer(hours*noOfSolarPanels*watts);
			}
		}
		else if(obj.gridOnSystem==null) {
			int currentCapacity = obj.battery.getcurrentCapacity();
			currentCapacity+=hours*noOfSolarPanels*watts;
			obj.battery.increasePower(currentCapacity);
		}
		else obj.gridOnSystem.transferEnergyToTheBuyer(hours*noOfSolarPanels*watts);
		
	}

}
