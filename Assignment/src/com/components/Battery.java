package com.components;

public class Battery {
	private int maxCapacity;
	private int currentCapacity=0;
	private int weight;
	Battery(int maxcapacity,int weight) {
		this.maxCapacity=maxcapacity;
		this.weight=weight;
	}
	public int getcurrentCapacity() {
		return currentCapacity;
	}
	public int getmaxCapacity() {
		return maxCapacity;
	}
	public int getweight() {
		return weight;
	}
	 void increasePower(int increasedVal ) {
		 if(increasedVal>maxCapacity) this.currentCapacity=maxCapacity;
		 else this.currentCapacity=increasedVal;
	}

}
