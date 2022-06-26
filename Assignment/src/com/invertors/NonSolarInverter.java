package com.invertors;
import com.components.Battery;
public class NonSolarInverter extends Inverter {
     public Battery battery;
     protected NonSolarInverter (Battery battery ,int current ,int operatingVoltage) {
    	 super(current,operatingVoltage);
    	 this.battery= battery;
     }
}
