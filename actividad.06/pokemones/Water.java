package main.pokemones;

import main.utilities.MyStack;
import main.utilities.Utils;

public class Water extends Pokemon{

    private static String[] namesListWater =  new String[]{"Squirtle", "Totodile", "Mudkip", "Froakie", "Quaxly"};
    private static MyStack stackWater = null;

    /**
     * Creates Water Pokemon with name
     * @param name
     */
    public Water(String name){
        super(name);
        setType("Water");
    }

    /**
     * Creates Water Pokemon with random name
     */
    public Water(){
        super();
        setType("Water");
        if( stackWater == null ) {
            setNamesList(namesListWater);
            stackWater = getRandomNameStack();
        } else {
            setRandomNameStack(stackWater);
        }
        setRandomName();
    }

    public static void resetNamesList(){
        stackWater = null;
    }


}
