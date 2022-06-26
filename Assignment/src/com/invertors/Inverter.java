package com.invertors;

public class Inverter {
	private int powerRating;
	 Inverter(int current ,int operatingVoltage) {
	    this.powerRating= current*operatingVoltage;
	}
}
