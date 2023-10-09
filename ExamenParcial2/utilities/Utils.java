package main.utilities;

import main.Ejecutar;
import main.pokemones.Pokemon;

import java.util.Random;

public class Utils {
    public static MyStack shuffle(String[] papers){
        Random random = Ejecutar.getRandom();
        //String[] newPapers = new String[papers.length];
        MyStack paperStack = new MyStack();
        //System.out.println(papers.length);
        for(int i = 0; i < papers.length; i++){
            if(paperStack.getLength() == papers.length-1){
                break;
            }
            int randomIndex = random.nextInt(papers.length);
            if (papers[randomIndex].equals("#")){
                //repeat random stuff
                i = i - 1;
            } else{
                //System.out.println("papers is: " + papers[randomIndex]);
                paperStack.push(papers[randomIndex]);
                papers[randomIndex] = "#";
            }

            //System.out.println("endcycleforshuffle");

        }
        return paperStack;
    }
    public static String[] shuffleArray(String[] papers){
        String[] newArray = new String[papers.length];
        Random random = Ejecutar.getRandom();
        //String[] newPapers = new String[papers.length];
        //System.out.println(papers.length);
        for(int i = 0; i < papers.length; i++){
            // this is always false...
//            if(i == papers.length){
//                break;
//            }
            int randomIndex = random.nextInt(papers.length);
            if (papers[randomIndex].equals("#")){
                //repeat random stuff
                i = i - 1;
            } else{
                //System.out.println("papers is: " + papers[randomIndex]);
                newArray[i] = papers[randomIndex];
                papers[randomIndex] = "#";
            }

        }
        return newArray;
    }

    public static Pokemon[] shufflePokemons(Pokemon[] pokemons){
        Pokemon[] newArray = new Pokemon[pokemons.length];
        Random random = Ejecutar.getRandom();
        //String[] newPapers = new String[papers.length];
        //System.out.println(papers.length);
        for(int i = 0; i < pokemons.length; i++){
            //this is always false because the for loop will never allow it to get there
//            if(i == pokemons.length){
//                break;
//            }
            int randomIndex = random.nextInt(pokemons.length);
            if (pokemons[randomIndex] == null){
                //repeat random stuff
                i = i - 1;
            } else{
                //System.out.println("papers is: " + papers[randomIndex]);
                newArray[i] = pokemons[randomIndex];
                pokemons[randomIndex] = null;
            }

        }
        return newArray;
    }
}
