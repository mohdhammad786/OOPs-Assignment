package com.inverterCompanies;

import com.components.GridOnSystem;
import com.components.SolarPanel;
import com.invertors.SolarInverter;

public class GTI extends SolarInverter{ //solar inverter
	public GTI(SolarPanel solarPanel ,GridOnSystem grid,int current,int operatingVoltage) {
		super(solarPanel,grid,current,operatingVoltage);
	}

}
