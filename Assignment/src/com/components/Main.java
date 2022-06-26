package com.components;
import com.inverterCompanies.*;
public class Main {
	public static void main(String args[]) {
		SolarPanel sp = new SolarPanel(3,1000);//3 panels , 1000kw power each ;
		GridOnSystem grid = new GridOnSystem();
		GTI inverter1 =new GTI(sp,grid,10,240);
		
		Sunlight.recharge(inverter1, 3);
		grid.setSellMode(true);
		System.out.println(grid.getbuyerEnergy());
		
		Icruze icruze = new Icruze(new Battery(1000,2),2,240);
		ACCurrentSource.recharge(icruze, 50);
		System.out.println(icruze.battery.getcurrentCapacity());
		
		SolarPanel sp2 = new SolarPanel(1,1000); //4 panels , 1000kw power each ;
		Battery bat2= new Battery(5000,3); //maxCapacity,weight
		PCU pcuInverter = new PCU(sp2,bat2,10,250); //solarpanel,battery,current,voltage
		Sunlight.recharge(pcuInverter, 1); //inverter,hours 
		System.out.println(pcuInverter.battery.getcurrentCapacity());
		
		
		
	}
}
