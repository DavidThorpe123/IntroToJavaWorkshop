package day1.robot;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	public static void main(String[] args) {
		
		// START HERE

Robot Leafy = new Robot();
Leafy.setSpeed(10);
Leafy.penDown();
Leafy.setPenWidth(10000);
Leafy.sparkle();
for (int i = 0; i < 4; i++) {
	Leafy.move(500);
	Leafy.turn(90);
	Leafy.setRandomPenColor();

	
}
		
	}
}
