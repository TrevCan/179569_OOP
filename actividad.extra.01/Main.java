package main;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String[] names = {"Alberto", "Adolfo", "Bernardo", "Benito", "Carlos",
                "Cecilia", "Carmelia", "Denisse", "Froylan", "Francisco",
                "Emilio", "Ernesto", "Esmeralda", "Hector", "Ximena"};
        Random random = new Random();
        for (int i = 0; i < names.length; i++) {
           int randomIndex = random.nextInt(15);
           if(names[randomIndex].equals("") ) {
               i--;
               continue;
           }
           else
               System.out.println(names[randomIndex]);
           names[randomIndex] = "";

        }
    }
}
