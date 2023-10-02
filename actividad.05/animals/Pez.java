package main.animals;

public class Pez extends Animal {

    private boolean isOnSand;
    private int pressure;


    public Pez(){

    }

    public boolean isOnSand(){
        return this.isOnSand;
    }

    public void setIsOnSand(boolean isOnSand){
        this.isOnSand = isOnSand;
    }

    public int getPressure(){
        return this.pressure;
    }
    public void setPressure(int pressure){
        this.pressure = pressure;
    }

    @Override
    public void eat() {
        System.out.println("Estoy comiendo en el agua otros peces.....");

    }

    @Override
    public String toString(){
        return String.format("Vida: %d\nEsta Dormido: %b\nNumero de patas: %d\n", getVida(), isSleeping(), getNumberOfLegs()).concat(
         String.format("En Arena: %b\nPresion: %d\n", isOnSand, pressure) );
    }
}
