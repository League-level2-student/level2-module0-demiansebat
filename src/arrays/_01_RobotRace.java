package arrays;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {
	//1. make a main method
public static void main(String[] args) {
Random randy= new Random();
	//2. create an array of 5 robots.
Robot [] robots= new Robot[7];
	//3. use a for loop to initialize the robots.
for (int i = 0; i < robots.length; i++) {
	Robot bob= new Robot();
	bob.setY(525);
	bob.setX(i*100+95);
	robots[i]= bob;
}
		//4. make each robot start at the bottom of the screen, side by side, facing up
//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
	//5. use another for loop to iterate through the array and make each robot move 
	//   a random amount less than 50.

for (int i = 0; i < robots.length; i++) {
	robots[i].move(randy.nextInt(50));
	robots[i].setSpeed(6);
}
	//6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
boolean keepmoving=true;
while (keepmoving) {
	for (int i = 0; i < robots.length; i++) {
		robots[i].move(randy.nextInt(50));
		if(robots[i].getY()<=55) {
			keepmoving=false;
			System.out.println("Congrats! You made it to the top!");
			break;
		}
	}
	
}
	//7. declare that robot the winner and throw it a party!

	//8. try different races with different amounts of robots.

	//9. make the robots race around a circular track.
}}
