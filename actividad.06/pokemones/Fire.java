package main.pokemones;

import main.utilities.MyStack;

public class Fire extends Pokemon{

    private static String[] namesListFire =  new String[]{"Charmander","Cyndaquil","Torchic","Litten","Fuecoco"};
    private static MyStack stackFire = null;

    public Fire(String name){
        super(name);
        setType("Fire");
    }

    public Fire(){
        super();
        setType("Fire");

        if( stackFire == null ) {
            setNamesList(namesListFire);
            stackFire = getRandomNameStack();
        } else {
            setRandomNameStack(stackFire);
        }
        setRandomName();

    }

    public static void resetNamesList() {
        stackFire = null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
