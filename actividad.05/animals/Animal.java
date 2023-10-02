package main.animals;

public abstract class Animal {
    private int vida;
    private boolean isSleeping;
    private int numberOfLegs;

    public abstract void eat();

    public void die(){
        vida = 0;
    }

    public int getVida(){
        return this.vida;
    }
    public void setVida(int vida){
        this.vida = vida;
    }

    public boolean isSleeping(){
        return isSleeping;
    }
    public void setSleeping(boolean isSleeping){
        this.isSleeping = isSleeping;
    }

    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int legs){
        this.numberOfLegs = legs;
    }



}
