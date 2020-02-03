package designPattern;

public class HomeInsurance implements Insurance {
	
	public void getInsuranceDetails() {
		System.out.println("information to buy home insurance.");
	}
	public void buyInsurance() {
		System.out.println("give all the details and buy premium");
	}
	public void collectInsuranceInformation() {
		System.out.println("all the information regarding home insurances have collected.");
	}
	public void endInsurance() {
		System.out.println("Home insurance has bought.");                                
	}

}
