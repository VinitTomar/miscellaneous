package com.jwt.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyDateValidator implements ConstraintValidator<MyDate, String> {

//	@Autowired
//	StudentDao studentDao;
	@Override
	public void initialize(MyDate arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isValid(String value, ConstraintValidatorContext context) {		
		
		//System.out.println("inside isValid() function.");
		if(value.isEmpty())
			return false;
		else 
			return true;
	}

}
