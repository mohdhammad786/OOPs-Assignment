package com.inverterCompanies;

import com.components.Battery;
import com.components.SolarPanel;
import com.invertors.SolarInverter;

public class PCU extends SolarInverter{//solar inverter
	public PCU(SolarPanel solarPanel ,Battery battery,int current,int operatingVoltage) {
		super(solarPanel,battery,current,operatingVoltage);
	}
}
