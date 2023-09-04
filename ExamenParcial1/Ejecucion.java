package examen1;

import java.util.Scanner;

public class Ejecucion {

   public Ejecucion(){

   }

   public void iniciarPrograma(){

       Palabras palabra1 = new Palabras("hasta luego cocodrilo");
       Palabras palabra2 = new Palabras("anita lava la tina");


//       new Palabras(palabra1.invertirCadena(palabra1.cadena)).invertirCadena();
//       new Palabras(palabra2.invertirCadena(palabra2.cadena)).invertirCadena();
//
//       palabra1.convertirVocalesAMayusculas();
//
//       palabra1.esPalindromo();
//       palabra2.esPalindromo();

       palabra1.convertirPrimeraAMayuscula();
       palabra1.invertirCadena();
       palabra1.convertirVocalesAMayusculas();
       palabra1.esPalindromo();

       System.out.println();

       palabra2.convertirPrimeraAMayuscula();
       palabra2.invertirCadena();
       palabra2.convertirVocalesAMayusculas();
       palabra2.esPalindromo();


       Extra extra = new Extra();

       Scanner read = new Scanner(System.in);
       System.out.println();
       System.out.println("FizzBuzz");
       System.out.println("Escriba 1 si desea ejecutar el metodo fizzbuzz().");
       System.out.println("De lo contrario, escriba cualquier otra cosa.");
       if (read.next().equals("1")) {
           extra.fizzBuzz();
       }


   }

}
