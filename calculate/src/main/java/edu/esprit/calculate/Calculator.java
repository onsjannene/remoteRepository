package edu.esprit.calculate;

public class Calculator {
	
	
	public Long add(Long... param){
		Long result = 0L;
	
		for (Long long1: param) {
			
		result=result + long1;
		}
		
		return result;
		
	}
	
	
	public Double  divide(Double d1, Double d2){
		
		if(d2==0)
			throw new IllegalArgumentException("cant divide by 0!!!");
		return (d1/d2);
	}

}
