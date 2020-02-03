package designPattern;

public class CarInsurance implements Insurance {
	
    public void getInsuranceDetails() {
    	System.out.println("information to buy car insurance.");	
	}
    
	public void buyInsurance() {
		System.out.println("give all the details and buy premium");
	}
	
	public void collectInsuranceInformation() {
	    System.out.println("all the information regarding car insurances have collected.");	
	}
	
	public void endInsurance() {
		System.out.println("car insurance has bought.");                             
	}


}
