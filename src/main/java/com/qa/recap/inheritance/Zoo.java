package com.qa.recap.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	
	private List<Animal> animals;
	
	public Zoo() {
		this.animals = new ArrayList<>();
	}
	
	public void addAnimal(Animal animal) {
		this.animals.add(animal);
		
	}
	
	public void removeAnimal() {
		
	}
	
	public Animal getAnimal() {
		return null;
	}
}
