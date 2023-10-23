package main;

import main.pokemones.Pokemon;

import java.util.Scanner;

public class Menu {
    Scanner scanner;

    public Menu() {
        scanner = new Scanner(System.in);

    }

    public void runMenu(Pokemon[] pokemons) {
        // randomly generate 15 Pokemons, 5 Grass, 5 Water, 5 Fire. -> get from class Ejecutar as parameter
        // choose only one of those pokemoms
        // say hello
        // tell rules of the game. 4 guesses, then choose a Pokemon
        // print all pokemon names.
        // begin game
        // after each question delete all other pokemons that do not correspond to the answer of the question

        //types of questions:
        // pokemon type (water, grass, fire)
        // attacks

        // randomly selects one of the instances from the pokemons[] array 0 to 14.
        Pokemon chosenPokemon = pokemons[Ejecutar.getRandom().nextInt(15)];

        System.out.println("Hola! Bienvenido a Adivina Quien Pokemon.");
        System.out.println();
        System.out.println("Instrucciones:");
        System.out.println("La computadora ha seleccionado un Pokemon de manera aleatoria.");
        System.out.println("Tu tendras que adivinar el nombre de ese pokemon.");
        System.out.println("\tPodras hacer preguntas referentes a su tipo (Water, Fire, Grass)");
        System.out.println("\to preguntas referentes a sus poderes");
        System.out.println("\t\t (" + pokemons[0].getPowersList() + ")");
        System.out.println("Tendras un limite de 4 preguntas");
        System.out.println("Presione [ENTER] para continuar...");
        scanner.nextLine();
        System.out.println("Para preguntar acerca del tipo, utiliza el comando '> pregunta tipo tipoDePokemon'");
        System.out.println("\t> pregunta tipo Water");
        System.out.println("\t> pregunta tipo Fire");
        System.out.println("\t> pregunta tipo Grass");
        System.out.println("Para preguntar acerca de sus poderes, utiliza el comando '> pregunta poder poderDePokemon'");
        System.out.println("\t> pregunta poder Hydro pump");
        System.out.println("\t> pregunta poder Petal Dance");
        System.out.println("\tetc");
        System.out.println("Cuando estes seguro de quien es tu Pokemon, deberas escribir el comando '> respuesta nombreDePokemon'");
        System.out.println("NOTA: Solo tendras una oportunidad para dar tu respuesta");
        //System.out.println("POKEMON is: " + chosenPokemon.getType());

        System.out.println();
        System.out.println("EL JUEGO COMIENZA.....\t AHORA!");
        int questionCount = 0;
        System.out.print("Nombres de pokemones: ");
        for(Pokemon p: pokemons){
            System.out.printf("%s, ", p.getName());
        }
        System.out.println();
        System.out.println("Lista de Poderes/Ataques: " + chosenPokemon.getPowersList());


        System.out.printf("> ");
        String userResponse = scanner.nextLine();

        while (!userResponse.startsWith("respuesta ")) {
            //System.out.println("usr response is: " + userResponse);
            if(questionCount >= 4){
                System.out.println("LIMITE DE PREGUNTAS ALCANZADO. Utilice '> respuesta nombreDePokemon' para dar su respuesta.");
                System.out.print("> ");
                userResponse = scanner.nextLine();
                continue;
            }
            if (userResponse.startsWith("pregunta tipo ")) {
                userResponse = userResponse.substring(14);
                if(! "FireGrassWater".contains(userResponse)) {
                    System.out.println("Tipo de Pokemon no reconocido. Intente nuevamente");
                    System.out.print("> ");
                    userResponse = scanner.nextLine();
                    continue;
                }
                questionCount++;
                //System.out.println("user type is... " + userResponse);
                if (userResponse.equals(chosenPokemon.getType())) {
                    System.out.printf("SI, el pokemon es de tipo %s.\n", userResponse);
                    removeAllPokemonsWithoutType(pokemons, userResponse);
                } else {
                    System.out.printf("NO, el pokemon no es de tipo %s.\n", userResponse);
                    removeAllPokemonsWithType(pokemons, userResponse);
                }

            } else if (userResponse.startsWith("pregunta poder ")) {
                userResponse = userResponse.substring(15);
                if(! chosenPokemon.getPowersList().contains(userResponse+',')){
                    System.out.println("Poder no reconocido. Intente nuevamente");
                    System.out.print("> ");
                    userResponse = scanner.nextLine();
                    continue;
                }
                questionCount++;
                //System.out.println("user poder is... " + userResponse);
                if(chosenPokemon.getPowers().contains(userResponse)){
                    System.out.printf("SI, el pokemon contiene el poder: %s.\n", userResponse);
                    removeAllPokemonsWithoutPower(pokemons, userResponse);
                } else {
                    System.out.printf("NO, el pokemon no contiene el poder: %s.\n", userResponse);
                    removeAllPokemonsWithPower(pokemons, userResponse);
                }

            } else if (Main.DEBUG && userResponse.startsWith("print all")) {
                for (Pokemon p :
                        pokemons) {
                    if(p != null)
                        System.out.printf("%s\n\t%s\t\t%s\n", p.getName(), p.getType(), p.getPowers());
                }
            } else if(Main.DEBUG && userResponse.startsWith("print chosen")){
                System.out.printf("%s\n\t%s\t\t%s\n", chosenPokemon.getName(), chosenPokemon.getType(), chosenPokemon.getPowers());
            } else {
                System.out.println("Comando no reconocido. Intente nuevamente.");
            }
            for(Pokemon p: pokemons){
                if(p != null)
                    System.out.printf("%s, ", p.getName());
            }
            System.out.println();
            System.out.println("Lista de Poderes/Ataques: " + chosenPokemon.getPowersList());
            System.out.println();
            System.out.print("> ");
            userResponse = scanner.nextLine();
        }
        userResponse = userResponse.substring(10);
        System.out.println(userResponse);
        if(userResponse.equals(chosenPokemon.getName())){
            System.out.println("SI, GANASTE!! Gracias por jugar.");
        } else{
            System.out.println("INCORRECTO. El Pokemon elegido es: " + chosenPokemon.getName());
            System.out.println("Gracias por jugar.");
        }

    }

    private void removeAllPokemonsWithType(Pokemon[] pokemons, String type) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null) {
                if (pokemons[i].getType().equals(type)) {
                    pokemons[i] = null;
                }
            }
        }

    }

    private void removeAllPokemonsWithoutType(Pokemon[] pokemons, String type) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null) {
                if (!pokemons[i].getType().equals(type)) {
                    pokemons[i] = null;
                }
            }
        }
    }

    private void removeAllPokemonsWithPower(Pokemon[] pokemons, String power) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null) {
                if (pokemons[i].getPowers().contains(power)) {
                    pokemons[i] = null;
                }
            }
        }

    }
    private void removeAllPokemonsWithoutPower(Pokemon[] pokemons, String power) {
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] != null) {
                if (! pokemons[i].getPowers().contains(power)) {
                    pokemons[i] = null;
                }
            }
        }

    }

}
