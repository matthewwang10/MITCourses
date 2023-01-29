package openCourseMIT;

public class FooCorporation {
	protected void PayCalculator(double b, int h) {
		if (b < 8) {
			System.out.println("Error");
		}
		else {
			if (h > 60) {
				System.out.println("Error");
			}
			
			else {
		
				if (h <= 40) {
					double TotalPay = h * b;
					System.out.println("The total pay is $" + TotalPay);
				}
				
				else {
					double newRate = b * 1.5;
					double TotalPay = h * b;
					System.out.println("The total pay is $" + TotalPay);
				}
			}
		} 
	}
	
	public static void main(String[] arguments) {
		FooCorporation corp = new FooCorporation();
		corp.PayCalculator(7.5, 37);
		corp.PayCalculator(8.2, 47);
		corp.PayCalculator(10, 73);
	} 
}
