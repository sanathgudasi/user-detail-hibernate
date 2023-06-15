package com.ripplestreet.userdetailshibernate.repository;

import java.util.Date;
import java.util.List;

import com.ripplestreet.userdetailshibernate.dto.PersonInfo;

public interface PersonInfoRepository {
	
	public void savePersonInfo(PersonInfo info);
	
	public void updatePersonName(int id, String name);
	
	public void updatePersonEmail(int id, String email);
	
	public void updatePersonPhone(int id, long phone);
	
	public void updatePersonDob(int id, Date dob);
	
	public void deletePersonInfo(int id);
	
	public PersonInfo getPersonInfo(int id);
	
	public List<PersonInfo> getAllPersonInfo();
	
	

}
