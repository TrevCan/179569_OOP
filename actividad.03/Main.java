package main;

import java.util.Scanner;

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
//		System.out.println("Lado de cuadrado es: " + square1.getLado());
//		System.out.println("Area de cuadrado es: " + square1.getArea());
//		System.out.println("Perimetro de cuadrado es: " + square1.getPerimeter());
//		System.out.println("Diagonal de cuadrado es: " + square1.getDiagonal());

		System.out.println();

		Circulo rueda = new Circulo(179569);
//		System.out.println("Radio de circulo es: " + rueda.getRadius());
//		System.out.println("Circunferencia de circulo es: " + rueda.obtenerCircunferencia());
//		System.out.println("Area de circulo es: " + rueda.obtenerArea());


		// MENUUUU

		Scanner scan = new Scanner(System.in);
		printMenu();
		System.out.println();
		String unString = scan.nextLine();
		double intEscaneado = -1;
		// GOAL for Actividad 3 is:
		// use switch and break instead of ifs in Submenu
		while( 3 != (intEscaneado = Integer.parseInt(unString)) ) {
			if (intEscaneado == 1) {
				System.out.println("Ingrese -1 para imprimir los valores normales.");
				System.out.println("Ingrese cualquier otro valor para el lado del cuadrado.");
				unString = scan.nextLine();
				intEscaneado = Double.parseDouble(unString);
				switch( (int)intEscaneado){
					case -1:
						System.out.println("Lado de cuadrado es: " + square1.getLado());
						System.out.println("Area de cuadrado es: " + square1.getArea());
						System.out.println("Perimetro de cuadrado es: " + square1.getPerimeter());
						System.out.println("Diagonal de cuadrado es: " + square1.getDiagonal());
						break;
					default:
						Cuadrado c = new Cuadrado(intEscaneado);
						System.out.println("Lado de cuadrado es: " + c.getLado());
						System.out.println("Area de cuadrado es: " + c.getArea());
						System.out.println("Perimetro de cuadrado es: " + c.getPerimeter());
						System.out.println("Diagonal de cuadrado es: " + c.getDiagonal());
						break;
				}
				System.out.println();
			} else if(intEscaneado == 2) {
				System.out.println("Ingrese -1 para imprimir los valores normales.");
				System.out.println("Ingrese cualquier otro valor para el radio del circulo.");
				unString = scan.nextLine();
				intEscaneado = Double.parseDouble(unString);

				switch( (int)intEscaneado){
					case -1:
						System.out.println("Radio de circulo es: " + rueda.getRadius());
						System.out.println("Circunferencia de circulo es: " + rueda.obtenerCircunferencia());
						System.out.println("Area de circulo es: " + rueda.obtenerArea());
						break;
					default:
						Circulo circulito = new Circulo( intEscaneado);

						System.out.println("Radio de circulo es: " + circulito.getRadius());
						System.out.println("Circunferencia de circulo es: " + circulito.obtenerCircunferencia());
						System.out.println("Area de circulo es: " + circulito.obtenerArea());
						break;

				}
				System.out.println();
			} else {
				System.out.println("Ingrese otro valor.");
				System.out.println();
			}

			//clearScreen();
			printMenu();

			unString = scan.nextLine();
		}

		System.out.println("Saliendo de programa...");

		// System.out.println("el valor ingresado fue: " + intEscaneado);
		scan.close();



	}

	static void printMenu(){
		System.out.println("Calculador de propiedades de cuadrado y circulo:");
		System.out.println("1) Cuadrado");
		System.out.println("2) Circulo");
		System.out.println("3) Salir");
	}


}
