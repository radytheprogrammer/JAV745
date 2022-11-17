package seneca;

public class RobotDuck extends Robot implements iRobot{
	// class attributes
		private String name = null;
		private final int swimmingDistance = 250;
		private int eggLayingRate = 0;
		
	public RobotDuck() {
		
	}
	
	public RobotDuck(String name, int rate) {
//		super(name); // There is no parent or superclass for this lab
		this.eggLayingRate = rate;
	}

	public int getSwimmingDistance() {
		return swimmingDistance;
	}

	@Override
	public int calculateChargingTime(int eggLayingRate) {
		// Time it take a RobotDuck to charge its batteries
		int chargingTime = eggLayingRate * 2;
		return chargingTime;
	}

	@Override
	public int selfDestruct() {
		// TODO Auto-generated method stub
		return 0;
	}

}