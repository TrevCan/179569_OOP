package main;

import java.lang.Math;

public class Circulo {

	 private double radius;


	/**
	 * id: school id. Radius will be assigned id divided by 100.
	 */
	public Circulo(int id){
		radius = (double)id / 100;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double r){
		this.radius = radius;
	}

	public double obtenerCircunferencia(){
		// circunference = PI * 2r
		return Math.PI * radius * 2;
	}

	public double obtenerArea(){
		// circunference = PI * r^2
		return Math.PI * radius * radius;
	}


}
