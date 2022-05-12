package com.chainsys.classandmethods;

public class Hospital {
	//private final int patientID ;
	private String location;
	private int patientAge;
	private String hospitalName;
	private String patientName;
	private String patentDieases;
	public Hospital(String Name)
	{
		this.location=Name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPatientAge() {
		return patientAge;
	}
	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getPatentDieases() {
		return patentDieases;
	}
	public void setPatentDieases(String patentDieases) {
		this.patentDieases = patentDieases;
	}
	public String getHospitalName() {
		return hospitalName;
	}
	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}
}
