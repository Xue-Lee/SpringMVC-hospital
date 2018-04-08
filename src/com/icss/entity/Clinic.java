package com.icss.entity;

import java.sql.Timestamp;

public class Clinic {
	private Integer clinicId;
	private String cardId;
	private String doctorId;
	private Timestamp clinicTime;
	private Integer state;
	private Timestamp checkTime;
	private String personName;
	private String doctorName;
	private Float clinicMoney;
	public Integer getClinicId() {
		return clinicId;
	}
	public void setClinicId(Integer clinicId) {
		this.clinicId = clinicId;
	}
	public String getCardId() {
		return cardId;
	}
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}
	public String getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}
	public Timestamp getClinicTime() {
		return clinicTime;
	}
	public void setClinicTime(Timestamp clinicTime) {
		this.clinicTime = clinicTime;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Timestamp getCheckTime() {
		return checkTime;
	}
	public void setCheckTime(Timestamp checkTime) {
		this.checkTime = checkTime;
	}
	public Float getClinicMoney() {
		return clinicMoney;
	}
	public void setClinicMoney(Float clinicMoney) {
		this.clinicMoney = clinicMoney;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	

}
