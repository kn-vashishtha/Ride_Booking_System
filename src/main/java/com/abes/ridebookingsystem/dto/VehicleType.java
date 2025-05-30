package com.abes.ridebookingsystem.dto;

public enum VehicleType {
	BIKE(WheelerType.TWO_WHEELER, 20, 5), SCOOTY(WheelerType.TWO_WHEELER, 18, 4),
	AUTO(WheelerType.THREE_WHEELER, 30, 8), SEDAN(WheelerType.FOUR_WHEELER, 50, 10),
	PREMIUM(WheelerType.FOUR_WHEELER, 70, 15), CABXL(WheelerType.FOUR_WHEELER, 90, 18);
//  type of wheeler (eg. bike, sedan)
	private final WheelerType wheelerType;
//	base fare charged at starting
	private final int baseFare;
//	Rate charged per km
	private final int perKmRate;
//  constructor to initialize enum constants
	VehicleType(WheelerType wheelerType, int baseFare, int perKmRate) {
		this.wheelerType = wheelerType;
		this.baseFare = baseFare;
		this.perKmRate = perKmRate;
	}

	public WheelerType getWheelerType() {
		return wheelerType;
	}

	public int getBaseFare() {
		return baseFare;
	}

	public int getPerKmRate() {
		return perKmRate;
	}
//	String representation of the vehicle type
	@Override
	public String toString() {
		return name() + " (" + wheelerType + ") - Base: ₹" + baseFare + ", ₹" + perKmRate + "/km";
	}
}
