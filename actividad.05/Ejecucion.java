package main;

import main.animals.Animal;
import main.animals.Ave;
import main.animals.Mamifero;
import main.animals.Pez;

import java.util.Random;

public class Ejecucion {

    public Ejecucion(){

    }

    public void iniciarPrograma(){
        Random random = new Random();
        Animal[] zoologico = new Animal[10];
       for(int i = 0; i < zoologico.length; i++) {
           int x = random.nextInt(3);
           switch (x) {
               case 0 -> {
                   zoologico[i] = new Ave();
                   ((Ave) zoologico[i]).setPigeon(random.nextBoolean());
                   ((Ave) zoologico[i]).setAltitude(random.nextInt(1001));
               }
               case 1 -> {
                   zoologico[i] = new Mamifero();
                   ((Mamifero) zoologico[i]).setHasMilk(random.nextBoolean());
                   ((Mamifero) zoologico[i]).setIsCow(random.nextBoolean());
               }
               case 2 -> {
                   zoologico[i] = new Pez();
                   ((Pez) zoologico[i]).setIsOnSand(random.nextBoolean());
                   ((Pez) zoologico[i]).setPressure(random.nextInt());
               }
               default -> zoologico[i] = new Ave();
           }
           zoologico[i].setVida(random.nextInt(100)+1);
           zoologico[i].setSleeping(random.nextBoolean());
           zoologico[i].setNumberOfLegs(random.nextInt(6)+1);


           System.out.println(zoologico[i]);
       }
    }
}
