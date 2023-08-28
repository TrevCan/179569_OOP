package main;

public class Cuadrado {

	private double lado;
	
	/**
	 * 
	 */
	public Cuadrado(double id){
		lado = id / 100;
		System.out.println(lado);
	}

	public double getArea(){
		return lado * lado;
	}

	public double getPerimeter(){
		return 4 * lado;
	}

	public double getDiagonal(){
		return Math.sqrt(lado*lado + lado*lado);
	}

	public double getLado(){
		return lado;
	}

	public void setLado(double lado){
		this.lado = lado;
	}


}
