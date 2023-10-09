package main.pokemones;

import main.utilities.MyStack;

public class Grass extends Pokemon{
    private static String[] namesListGrass = {"Bulbasaur","Chikorita","Treecko","Rowlet","Sprigatito"};
    private static MyStack stackGrass = null;

    public Grass(String name){
        super(name);
        setType("Grass");
    }

    public Grass(){
        super();
        setType("Grass");

        if( stackGrass == null ) {
            setNamesList(namesListGrass);
            stackGrass = getRandomNameStack();
        } else {
            setRandomNameStack(stackGrass);
        }
        setRandomName();

    }
}
