package com.components;

public class GridOnSystem {
	private boolean sellMode=false;
	private int buyerEnergy=0;
	void setSellMode(boolean val) {
		this.sellMode=val;
	}
	public int getbuyerEnergy() {
		return buyerEnergy;
	}
	boolean getSellMode() {
		return this.sellMode;
	}
	void transferEnergyToTheBuyer(int val) {
		buyerEnergy+=val;
	}

}
