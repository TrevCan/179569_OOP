package main;

import main.pokemones.Fire;
import main.pokemones.Grass;
import main.pokemones.Pokemon;
import main.pokemones.Water;
import main.utilities.Utils;

import java.util.Random;

public class Ejecutar {

    private static Random random;
    public Ejecutar(){
        random = new Random(72130809312l*System.nanoTime()%2131);

    }

    public void iniciarPrograma(){

        Pokemon[] pokemons = new Pokemon[15];
        for(int i = 0; i < pokemons.length; i++){
            pokemons[i] = makeNewPokemon(i);
        }

//        for (Pokemon p :
//                pokemons) {
//            System.out.printf("%s\n\t%s\t\t%s\n", p.getName(), p.getType(), p.getPowers());
//        }

//        Water[] waterPokemons = new Water[5];
//        for(int i = 0; i < waterPokemons.length; i++){
//            waterPokemons[i] = new Water();
////            if(i == 0) {
////                waterPokemons[i].setNamesList(new String[]{"Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly"});
////                waterPokemons[i].printNamesList();
////            }
//        }
        //for (int i = 0; i < waterPokemons.length; i++) {
        //    System.out.println("nn " + waterPokemons[i]);
        //}

        pokemons = Utils.shufflePokemons(pokemons.clone());
        Menu menu = new Menu();
        menu.runMenu(pokemons);

    }

    /**
     * creates and returns new instance of Pokemon
     * if index is 0-4 a new Water Pokemon will be returned,
     * if index is 5-9 a new Grass Pokemon will be returned,
     * if index is 10-14 a new Fire Pokemon will be returned.
     * @param index
     * @return new pokemon instance
     */
    private Pokemon makeNewPokemon(int index){
        if (index < 5)
            return new Water();
        if (index < 10)
            return new Grass();

        return new Fire();

    }

    public static Random getRandom(){
        return random;
    }
}
