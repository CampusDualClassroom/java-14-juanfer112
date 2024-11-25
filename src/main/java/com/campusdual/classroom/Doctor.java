package com.campusdual.classroom;

public class Doctor extends Person {

	private final String specialization;

	public Doctor(String name, String surname, String specialization) {
		super(name, surname);
		this.specialization = specialization;
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Especialización: " + this.specialization.toLowerCase());
	}
}
