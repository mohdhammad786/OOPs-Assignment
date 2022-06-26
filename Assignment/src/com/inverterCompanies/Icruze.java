package com.inverterCompanies;

import com.components.Battery;
import com.invertors.NonSolarInverter;

public class Icruze extends NonSolarInverter{
	public Icruze (Battery battery ,int current ,int operatingVoltage) {
		super(battery,current,operatingVoltage);
	}

}
