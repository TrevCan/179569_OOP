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

    public void iniciarPrograma() throws IOException, ClassNotFoundException {

        File dir = new File("data");
        if (!dir.exists()) {
            dir.mkdir();
        }
        profiles = new File("data/profiles");
        profiles.createNewFile();

//        Player[] players = {new Player("Emilio"), new Player("hola"), new Player("k hace")};
//
//        writeObjectArrayToDataStorage(players);
//
//
//        Player[] playersRead = readProfilesFromDataStorage();
//        for (Player p :
//                playersRead) {
//            if (p != null)
//                System.out.println(p);
//        }
//

        if (Main.DEBUG_PLAYERS)
            return;

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
    public static Pokemon makeNewPokemon(int index) {
        if (index < 5)
            return new Water();
        if (index < 10)
            return new Grass();

        return new Fire();

    }

    public static Player[] readProfilesFromDataStorage() throws IOException, ClassNotFoundException {
        Player[] players = new Player[10];
        FileInputStream fileInputStream = new FileInputStream(profiles);
        ObjectInputStream objectInputStream = null;
        try {
            objectInputStream = new ObjectInputStream(fileInputStream);
        } catch(EOFException e){
            // this means the file is empty and did not read any objects
            // do nothing
            fileInputStream.close();
            return players;
            // return player WITHOUT closing objectInputStream object
        }

        Player p = null;
        int i = 0;

        while (fileInputStream.available() > 0 && (p = (Player) objectInputStream.readObject()) != null && i != 10) {

            players[i] = p;
            i++;
        }

        objectInputStream.close();
        fileInputStream.close();

        return players;

    }

    public static void writeObjectArrayToDataStorage(Player[] players) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(profiles);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null) {
                break;
            }
            System.out.printf("Writing %s to data storage.\n", players[i]);
            objectOutputStream.writeObject(players[i]);
        }
        objectOutputStream.flush();
        objectOutputStream.close();
        fileOutputStream.close();

    }

    public static Player selectOrAddPlayer(Player[] players, String playerName){
        for (int i = 0; i < players.length; i++) {
            if(players[i] == null){
                System.out.printf("Creando nuevo jugador \"%s\"\n", playerName);
                return players[i] = new Player(playerName);
            }
            if(players[i].getName().equals(playerName)){
                return players[i];
            }

        }
        return null;
    }

    public Player[] addPlayerToArray(Player[] players, Player player) {
        for (int i = 0; i < players.length; i++) {
            if (players[i] == null) {
                players[i] = player;
                break;
            }
        }
        return players;
    }

    public static void printPlayers(Player[] players){
        for(int i = 0; i < players.length; i++){
            if(players[i] != null) {
                System.out.printf("Jugador %d: %s\n", i+1, players[i]);
            }
        }
    }

    public static Random getRandom() {
        return random;
    }
}
