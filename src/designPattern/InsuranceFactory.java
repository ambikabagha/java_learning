package designPattern;

public class InsuranceFactory {

	public static Insurance getInsurance(String insuranceName){
		  
	      if(insuranceName.equalsIgnoreCase("CarInsurance")){
	    	 return new CarInsurance();
	      } 
	      
	      else if(insuranceName.equalsIgnoreCase("PersonalInsurance")){
	    	 return new PersonalInsurance(); 
	      } 
	      
	      else if(insuranceName.equalsIgnoreCase("HomeInsurance")){
	    	  return new HomeInsurance();
	      }
		  return null;
	
		
	}

}
