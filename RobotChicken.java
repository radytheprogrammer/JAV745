package seneca;

import java.util.Objects;

public class RobotChicken extends Robot implements iRobot, iFlyingObject{
	
	// class attributes
	private String name = null;
	private final int flyingDistance = 250;
	private int eggLayingRate = 0;
	
	@Override
	public void speak() {
		System.out.println("Squawk, Squawk, beep beep");
	}
	// ALL Argument Constructor
	public RobotChicken(String name, int eggLayingRate) {
		super();
		this.name = name;
		this.eggLayingRate = eggLayingRate;
	}

	public RobotChicken() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getFlyingDistance() {
		// RobotChickens can fly for 250 meters.
		RobotChicken rc = new RobotChicken();
		return rc.flyingDistance;
	}

	public RobotChicken(String name) {
		super();
		this.name = name;
	}
	public RobotChicken(int eggLayingRate) {
		super();
		this.eggLayingRate = eggLayingRate;
	}
	@Override
	public int calculateChargingTime(int eggLayingRate) {
		int chargingTime = 0;
		// use the local variable passed as an argument to the method
		// Let's play, play means to write code and demonstrate different features
		chargingTime = eggLayingRate * 2;
		return chargingTime;
	}

	// DEFAULT ALL-ARGS implementation
	@Override
	public String toString() {
		return "RobotChicken [name=" + name + ", flyingDistance=" + flyingDistance
				+ ", eggLayingRate=" + eggLayingRate + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		// use ONLY the NAME of a RobotChicken as a CRITERIA for comparing instances !!
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RobotChicken other = (RobotChicken) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int selfDestruct() {
		return (eggLayingRate = 0);
	}
	
}