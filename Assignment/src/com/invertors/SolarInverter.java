package com.invertors;
import com.components.*;

public class SolarInverter extends Inverter{

	public Battery battery;
	public SolarPanel solarPanel;
	public GridOnSystem gridOnSystem;
	protected SolarInverter(SolarPanel solarPanel,Battery battery,GridOnSystem gridOnSystem,int current,int operatingVoltage) {
		super(current,operatingVoltage);
		this.battery = battery;
		this.solarPanel=solarPanel;
		this.gridOnSystem=gridOnSystem;
	}
	protected SolarInverter(SolarPanel solarPanel,Battery battery,int current,int operatingVoltage) {
		super(current,operatingVoltage);
		this.battery = battery;
		this.solarPanel=solarPanel;
		this.gridOnSystem=null;
	}
	protected SolarInverter(SolarPanel solarPanel,GridOnSystem gridOnSystem,int current,int operatingVoltage) {
		super(current,operatingVoltage);
		this.solarPanel=solarPanel;
		this.gridOnSystem=gridOnSystem;
		this.battery=null;
	}
	protected SolarInverter(SolarPanel solarPanel,int current,int operatingVoltage) {
		super(current,operatingVoltage);
		this.solarPanel=solarPanel;
		this.gridOnSystem=null;
		this.battery=null;
	}
		
}
