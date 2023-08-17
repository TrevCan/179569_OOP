package main;

public class Main {

	public static void main(String[] args){


		// make 2 objects
		// 1 object type Cuadrado
		// 		Hacer constructor que asigne su ID divido entre 100
		// 			como longitud del lado del cuadrado
		// 		Longitud de cada lado del cuadrado
		// 		Diagonal de un cuadrado (d=sqrt(a^2 + b^2) )
		// 		Perimetro
		// 		Area
		//
		// 1 object type Circulo
		// 		Hacer un constructor que asigne su ID dividido entre 100
		// 			como longitud del radio del circulo
		// 		Radio (definido en main)
		// 		Circunferencia
		// 		Area
		//
		//

		Cuadrado square1 = new Cuadrado(179569);
		System.out.println("Lado de cuadrado es: " + square1.getLado());
		System.out.println("Area de cuadrado es: " + square1.getArea());
		System.out.println("Perimetro de cuadrado es: " + square1.getPerimeter());
		System.out.println("Diagonal de cuadrado es: " + square1.getDiagonal());

		System.out.println();

		Circulo rueda = new Circulo(179569);
		System.out.println("Radio de circulo es: " + rueda.getRadius());
		System.out.println("Circunferencia de circulo es: " + rueda.obtenerCircunferencia());
		System.out.println("Area de circulo es: " + rueda.obtenerArea());


	}

}
