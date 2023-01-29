package openCourseMIT;

public class VelocityProblem {
	public static void main(String[] arguments) {
		double gravity = -9.81;
		double intialVelocity = 0.0;
		double fallingTime = 10.0;
		double initialPosition = 0.0;
		double finalPosition = 0.0;
		double position = 0.5 * gravity * Math.pow(fallingTime, 2.0) + fallingTime * intialVelocity + initialPosition;
		System.out.println(position);
	}

}
