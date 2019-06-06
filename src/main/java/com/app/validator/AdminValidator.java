/**
 * 
 */
package com.app.validator;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.app.model.Admin;

@Component
public class AdminValidator implements Validator {

	
	public boolean supports(Class<?> clazz) {
		return Admin.class.equals(clazz);
	}

	
	public void validate(Object target, Errors errors) {
		
		Admin a=(Admin)target;
		if(!Pattern.matches("[A-Z]{2,5}", a.getAdminName())) {
			errors.rejectValue("adminName", null,"Please Enter Valid name");
		}
		if(!StringUtils.hasText(a.getAdminDept())) {
			errors.rejectValue("adminDept", null,"Please select one");
		}
		if(!StringUtils.hasText(a.getAdminGrade())) {
			errors.rejectValue("adminGrade", null,"Please Choose valid Grade");
		}
		if(!Pattern.matches("[A-Za-z0-9\\s]{5,150}", a.getAdminNote())) {
			errors.rejectValue("adminNote", null,"Please Enter Note");
		}
		
		if(a.getAdminGrants()==null || a.getAdminGrants().isEmpty()) {
			errors.rejectValue("adminGrants", null,"Please choose at least one Grants");
			
		}
	}

}
