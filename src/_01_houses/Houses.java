package _01_houses;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class Houses {
	public void run() {
		
	int height = newRandom().nextInt(150+50);
		Robot house = new Robot ("mini");
		house.penDown();
		house.setSpeed(100);
		house.moveTo(20, 500);
		for (int i = 0; i < 10; i++) {
	house.move(100);
	house.turn(90);
	house.move(25);
	house.turn(90);
	house.move(100);
	house.turn(-90);
	house.setPenColor(0, 225, 0);
	house.move(25);
	house.turn(-90);
	house.setPenColor(Color.BLACK);
	}
	}

	private int newRandom() {
		// TODO Auto-generated method stub
		return 0;
	}

	private void nextInt(int i) {
		// TODO Auto-generated method stub
		
	}
}
