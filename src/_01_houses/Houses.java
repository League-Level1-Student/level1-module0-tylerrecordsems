package _01_houses;

import java.awt.Color;
import java.util.Random;

import org.jointheleague.graphical.robot.Robot;


public class Houses {
	Robot house = new Robot ("mini");
Random ran = new Random();
int houseSize = 0;
	public void run() {
		
//	int height = new Random().nextInt(150 (+50));
		house.penDown();
		house.setWindowColor(0, 0, 0);
		house.setSpeed(100);
		house.moveTo(20, 500);
		for (int i = 0; i < 10; i++) {
		
			 houseSize = ran.nextInt(3);
		if(houseSize == 0) {
			drawHouse("small");
			
		}if(houseSize == 1) {
		drawHouse("medium");
	}if(houseSize == 2) {
		drawHouse("large");

}
	/*
	house.move(100);
	house.turn(45);
	house.move(20);
	house.turn(90);
	house.move(20);
	house.turn(45);
	house.move(100);
	*/

}
	}
		
  //  “small”                 60

  //  “medium”             120

   // “large”                 250 
public void drawHouse(int height) {
	house.setRandomPenColor();
house.move(height);
if(houseSize == 2 ) {
	drawPointyRoof();
}else

house.move(height);
house.turn(-90);
house.setPenColor(0, 225, 0);
house.move(25);
house.turn(-90);
house.setPenColor(Color.BLACK);
	

}
public void drawFlatRoof() {
	house.turn(90);
	house.move(25);
	house.turn(90);
}
public void drawPointyRoof() {
	house.turn(45);
	house.move(25);
	house.turn(90);
	house.move(25);
	house.turn(45);

}
	public void drawHouse(String size) {
		if (size.equals ("small")) {
drawHouse(60);
		}else if (size.equals ("medium")) {
			drawHouse(120);
			}else if (size.equals ("large")) {
				drawHouse(250);
			}
	}
	}

