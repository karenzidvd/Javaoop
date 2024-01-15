package com.javaabstract;

public abstract class Vehicule {
	 
    public abstract void start();

}
class Car extends Vehicule{
	 private String make;
	    private String model;
	    
		public Car(String make, String model) {
			super();
			this.make = make;
			this.model = model;
		}	
	    
		// Implement the abstract start method
	    public void start() {
	        System.out.println("Start the " + make + " " + model + " car.");
	    }
	    
	 
}
