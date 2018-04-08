package com.icss.dao;

import java.util.List;

import com.icss.entity.Clinic;

public interface ClinicDao {
	public void add(Clinic clinic);
	public List<Clinic> findClinicOrder(Object clinicTime);
	
}
