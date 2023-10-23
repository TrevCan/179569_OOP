package main.pokemones;

import main.utilities.MyStack;
import main.utilities.Utils;

public abstract class Pokemon {
    private String name;
    private String type;
    private String[] namesList = new String[5];
    private MyStack randomNameStack;
    private String[] powers = new String[4];
    private String[] powersList = new String[]{"Hydro pump","Solar Beam","Eruption","Flamethrower","Aqua Jet","Whirlpool","Synthesis","Petal Dance"};

    /*
   {Squirtle, Totodile, Mudkip, Froakie, Quaxly} agua

{Charmander, Cyndaquil, Torchic, Litten, Fuecoco} fuego

{Bulbasaur, Chikorita, Treecko, Rowlet, Sprigatito} planta.
     */
    public Pokemon(String name){
        this.name = name;
        setRandomPowers();

    }

    public Pokemon(){
        this.randomNameStack = new MyStack();
        setRandomPowers();

    }


    public void setRandomName(){
        String possibleName = randomNameStack.pop();
        if ( possibleName.equals("#") ){
            System.out.println("No more names!");
            name = "";
        } else {
            name = possibleName;
        }

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String[] getNamesList(){
        return this.namesList;
    }

    public void setNamesList(String[] namesList){
       this.namesList = namesList;
       //printNamesList();
       setRandomNameStack(Utils.shuffle(getNamesList().clone()));
    }

    public void setRandomNameStack(MyStack stack){
        this.randomNameStack = stack;
    }

    public MyStack getRandomNameStack(){
        return this.randomNameStack;
    }



    public void printNamesList(){
        for (int i = 0; i < namesList.length; i++) {
            System.out.println("[" + i + "]\t" + namesList[i]);
        }
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setRandomPowers() {
        String[] randomPowers = Utils.shuffleArray(powersList.clone());
        for (int i = 0; i < 4; i++) {
            //System.out.printf("randomPowers[%d] = %s\n", i, randomPowers[i]);
            powers[i] = randomPowers[i];
        }
        //for(int i = 0; i < 8; i++){
        //    System.out.printf("[%d] = %s\n", i, randomPowers[i]);
        //}

    }

    public void setPowers(String[] powers) {
        this.powers = powers;
    }

    public String getPowers() {
        String output = "";
        for (int i = 0; i < 4; i++) {
            //System.out.printf("powers[%d] = %s\n", i, powers[i]);
            output = output + powers[i] + ",";
        }
        return output;
    }

    public String getPowersList(){
        String output = "";
        for (int i = 0; i < powersList.length; i++) {
            //System.out.printf("powers[%d] = %s\n", i, powersList[i]);
            output = output + powersList[i] + ",";
        }
        return output;
    }

    @Override
    public String toString(){
//        String output = "";
//        output = String.format("Name:\t%s\n", getName());
//        for(int i = 0; i < powers.length; i++){
//           output = output + String.format("Power %s\t\t%d\n", powers[i], i+1);
//        }
//        return output;
        return getName();
    }

}
