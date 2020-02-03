package designPattern;

public class Test {
	public static void main(String[] args) {
			
		Insurance obj=InsuranceFactory.getInsurance("CarInsurance");
    	  obj.getInsuranceDetails();
    	  obj.collectInsuranceInformation();
    	  obj.buyInsurance();
    	  obj.endInsurance();
	}
	
}
