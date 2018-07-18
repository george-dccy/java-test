package com.classes;

public class TestDog {
	public static void main(String args[]) {
		Animal a = new Animal();
		Dog d = new Dog();
		a.move();
		d.move();
	}
}

class Animal{
	  public void move(){
	    System.out.println("Animals can run.");
	  }
	}

class Dog extends Animal{
	  public void move(){
	    super.move();
	    System.out.println("Dogs can run and play.");
	  }
}
