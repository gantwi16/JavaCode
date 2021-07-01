package com.qa.recap.inheritance;

// Base/Super type (i.e. the parent class)
public class Animal {

	private String name;
	final private String species;
	private int age;
	
	// constructor overloading
	public Animal() {
		this("UNKNOWN", "UNKNOWN", 0);
	}

	public Animal(String name, String species, int age) {
		this.name = name;
		this.species = species;
		this.setAge(age);
	}
	
	public void talk() {
		System.out.println("Blah blah blah");
	}

	public String getName() {
		return name;
	}
	
	public String setName() {
		this.name = name;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public String setSpecies() {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Animal [name=" + name + ", species=" + species + ", age=" + age + "]";
	}
	
	
}
