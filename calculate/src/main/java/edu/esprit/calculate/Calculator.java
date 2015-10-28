package edu.esprit.calculate;

public class Calculator {
	
	
	public Long add(Long... param){
		Long result = 0L;
	
		for (Long long1: param) {
			
		result=result + long1;
		}
		
		return result;
		
	}

}
