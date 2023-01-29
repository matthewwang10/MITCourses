package openCourseMIT;

public class Marathon {
	public static void main(String[] args) {
		String[] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
		int[] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265};
		int fastestTime = Integer.MAX_VALUE;
		String fastestName = "";
		for (int i = 0; i < names.length; i++) {
			if (times[i] < fastestTime) {
				fastestTime = times[i];
				fastestName = names[i];
			}
		}
		System.out.println("The fastest runner is " + fastestName + " with a time of " + fastestTime + " minutes");
	}
}
