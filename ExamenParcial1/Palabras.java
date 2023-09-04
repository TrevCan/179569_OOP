package examen1;

public class Palabras {

    String cadena;

    public Palabras(String cadena){
        this.cadena = cadena;

    }

    public void convertirPrimeraAMayuscula(){
        //obtiene el primer caracter y lo convierte a string
        String char1 = String.valueOf(cadena.charAt(0));
        char1 = char1.toUpperCase();

        //obtiene el resto de la cadena
        String rest = cadena.substring(1);
        String newCadena = char1 + rest;

        System.out.println(newCadena);

    }

    // invierte la cadena pero no imprime el String,
    // solo lo regresa
    public String invertirCadena(String cadena){
        char[] chars = cadena.toCharArray();
        int endIndex;
        for(int i = 0; i < Math.ceil(cadena.length()/2.0) ;i++){
            // swap
           char x = chars[cadena.length()-1-i];
           chars[cadena.length()-1-i] = chars[i];
           chars[i] = x;
        }

        return String.valueOf(chars);

    }

    // invierte la cadena y la imprime
    public void invertirCadena(){
        char[] chars = cadena.toCharArray();
        int endIndex;
        for(int i = 0; i < Math.ceil(cadena.length()/2.0) ;i++){
            // swap
            char x = chars[cadena.length()-1-i];
            chars[cadena.length()-1-i] = chars[i];
            chars[i] = x;
        }

        System.out.println(chars);

    }

    public void convertirVocalesAMayusculas(){
        String newCadena = cadena.replaceAll("a", "A");
        newCadena = newCadena.replaceAll("e", "E");
        newCadena = newCadena.replaceAll("i", "I");
        newCadena = newCadena.replaceAll("o", "O");
        newCadena = newCadena.replaceAll("u", "U");

        System.out.println(newCadena);

    }

    public boolean esPalindromo(){

        String cadenaSinEspacios = cadena.replaceAll(" ", "");
        String invertidoSinEspacios = invertirCadena(cadena).replaceAll(" ", "");

        if (cadenaSinEspacios.equals(invertidoSinEspacios)){
            System.out.println("Si, \"" + cadena + "\"" + " es palindromo");
            return true;

        }

        System.out.println("No, \"" + cadena + "\"" + " no es palindromo");
        return false;

    }
}
