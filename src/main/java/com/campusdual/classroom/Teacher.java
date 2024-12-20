package com.campusdual.classroom;

public class Teacher extends Person {

	private final String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void getDetails() {
		super.getDetails();
		System.out.println("Área: " + this.area.toLowerCase());
	}
}
