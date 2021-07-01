package com.qa.recap.inheritance;

// Dog is-a Animal, Dog is-a Dog
public class Dog extends Animal {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.setName("Karma");
		System.out.println(dog);
	}

	public Dog() {
		// must be the first statement in a constructor
		this("UNKNOWN", 7);
	}

	public Dog(String name, int age) {
		// only one of 'this' or 'super' may be used
		// in a single constructor
		super(name, "DOG", age);
	}

	public void wagTail() {
		System.out.println("Wags tail");
	}
	
}
