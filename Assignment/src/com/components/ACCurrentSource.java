package com.components;

import com.invertors.NonSolarInverter;

public class ACCurrentSource {
	public static void recharge(NonSolarInverter inverter,int deltaPercentage) {
		Battery myBattery= inverter.battery;
		int currentCapacity =myBattery.getcurrentCapacity();
		if(currentCapacity==0) currentCapacity+=(deltaPercentage*myBattery.getmaxCapacity())/100;
		else currentCapacity+=(deltaPercentage*currentCapacity)/100;
		System.out.println("aaya"+currentCapacity);
		myBattery.increasePower(currentCapacity);
	}

}
