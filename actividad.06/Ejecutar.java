package main;

import main.pokemones.Fire;
import main.pokemones.Grass;
import main.pokemones.Pokemon;
import main.pokemones.Water;
import main.utilities.Utils;

import java.io.*;
import java.util.Random;

public class Ejecutar {

    private static File profiles;

//    * Utilizando lo visto en la clase anterior, crea un archivo en el cual
//    guardes cuántos juegos de Adivina quién ha jugado el usuarioy cuántos
//    de ellos ha ganado.
//    * Usa tu proyecto y crea un menú principal donde pregunte el nombre del
//    jugador ( para guardarlo en archivo) o para abrir unperfil y continuar
//    jugando
//    * Pueden haber diferentes jugadores y cada uno deberá poder
//    guardar sus estadísticas.

    private static Random random;

    public Ejecutar() {
        random = new Random(72130809312l * System.nanoTime() % 2131);

    }

    public void iniciarPrograma() throws IOException {

        File dir = new File("data");
        if (!dir.exists()) {
            dir.mkdir();
        }
        profiles = new File("data/profiles");
        profiles.createNewFile();

//        File ofile = new File("player");
//        FileOutputStream ofstream = new FileOutputStream(ofile);
//        ObjectOutputStream outputStream = new ObjectOutputStream(ofstream);
//
//        //save object
//        Player player = new Player("a");
//        outputStream.writeObject(player);
//        outputStream.close();
//        ofstream.close();


        Pokemon[] pokemons = new Pokemon[15];
        for (int i = 0; i < pokemons.length; i++) {
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
     *
     * @param index
     * @return new pokemon instance
     */
    private Pokemon makeNewPokemon(int index) {
        if (index < 5)
            return new Water();
        if (index < 10)
            return new Grass();

        return new Fire();

    }

    public static Player[] readProfilesFromDataStorage() throws IOException, ClassNotFoundException {
        Player[] players = new Player[10];
        FileInputStream fileInputStream = new FileInputStream(profiles);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Player p = (Player) objectInputStream.readObject();
        int i = 0;
        while(p != null){
            players[i] = p;
            i++;
        }

        return players;

    }

    public static void writeObjectArrayToDataStorage(Player[] players) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(profiles);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (int i = 0; i < players.length; i++) {
            objectOutputStream.writeObject(players[i]);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

    }

    public static Random getRandom() {
        return random;
    }
}
