package seneca;
// The IRobot interface is an interface that defines the behaviours of a robot.
public interface iRobot {
	
//	public void calculateChargingTime();
//	public void selfDestruct();
	public int calculateChargingTime(int eggLayingRate); // Polymorphism
	public int selfDestruct();
}

/*
The interface contains two methods:
calculateChargingTime(): Calculates how long it takes the robot to recharge its batteries.
selfDestruct():  Defines what should happen if the robot goes out of control and needs to be destroyed.

The IFlyingObject interface defines the behaviour of things that fly.

The interface contains one method:
getFlyingDistance():  Calculates the maximum distance the object can fly.
*/