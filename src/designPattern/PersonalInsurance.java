package designPattern;

public class PersonalInsurance implements Insurance {
	
    public void getInsuranceDetails() {
    	System.out.println("information to buy personal insurance.");
	}
	public void buyInsurance() {
		System.out.println("give all the details and buy premium");
	}
	public void collectInsuranceInformation() {
		System.out.println("all the information regarding car insurances have collected.");
	}
	public void endInsurance() {
		System.out.println("personal insurance has bought.");                               
	}


}
