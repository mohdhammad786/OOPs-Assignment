package com.inverterCompanies;
import com.invertors.SolarInverter;
import com.components.*;

public class Regalia extends SolarInverter{//solar inverter
	public Regalia(SolarPanel solarPanel ,Battery battery ,GridOnSystem  grid,int current,int operatingVoltage) {
		super(solarPanel,battery,grid,current,operatingVoltage);
	}
	
	public Regalia(SolarPanel solarPanel ,Battery battery,int current,int operatingVoltage) {
		super(solarPanel,battery,current,operatingVoltage);
	}
	
	public Regalia(SolarPanel solarPanel ,GridOnSystem  grid,int current,int operatingVoltage) {
		super(solarPanel,grid,current,operatingVoltage);
	}
	
	public Regalia(SolarPanel solarPanel,int current,int operatingVoltage) {
		super(solarPanel,current,operatingVoltage);
	}

}
