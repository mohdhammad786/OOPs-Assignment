package com.inverterCompanies;
import com.components.Battery;
import com.invertors.NonSolarInverter;

public class Zelio extends NonSolarInverter {
	public Zelio (Battery battery ,int current ,int operatingVoltage) {
		super(battery,current,operatingVoltage);
	}
}
