package seneca;

import java.util.ArrayList;

public class RobotFactory {
	
	private ArrayList<Robot> robots = new ArrayList<Robot>();

	public RobotFactory() {
		System.out.println("2022F JAV745 Paolo Treves 059742122");
		
		RobotChicken rc = new RobotChicken();
		rc.speak();
		System.out.printf("%d %d %d", 	rc.calculateChargingTime(100),
										rc.selfDestruct(),
										rc.getFlyingDistance());
		// STEP 1 Define different robots
		RobotChicken robot1 = new RobotChicken("RoadRunner");
		RobotDog robot2 = new RobotDog("Rufus", 3); // can catch 3 squirrels
		RobotDuck robot3 = new RobotDuck("Donald Trump", 11);
		
		ArrayList<Robot> robotsarray = new ArrayList<Robot>();
		
		robotsarray.add(robot1);
		robotsarray.add(robot2);
		robotsarray.add(robot3);
		
		for(Robot robot : robots ) {
			System.out.println(robot);
		}
	}
	
	public Robot getRobot(String robotType){
//		return this.robots.remove(index);
		if(robotType == null) {
			return null;
		}
		if(robotType.contentEquals("chicken")) {
			return new RobotChicken();
		}
		return null;
	}

}
