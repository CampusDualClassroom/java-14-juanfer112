package com.campusdual.classroom;

public class Person {
	private final String name;
	private final String surname;

	public Person(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public void getDetails() {
		StringBuilder details = new StringBuilder()
				.append("Nombre: ").append(this.name)
				.append(" | Apellido: ").append(this.surname);
		System.out.println(details);
	}
}
