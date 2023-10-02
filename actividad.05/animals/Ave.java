package main.animals;

public class Ave extends Animal{

    private boolean isPigeon;
    private int altitude;

    public Ave(){


    }

    public boolean isPigeon(){
        return this.isPigeon;
    }
    public void setPigeon(boolean isPigeon){
        this.isPigeon = isPigeon;
    }

    public int getAltitude(){
        return this.altitude;
    }
    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    @Override
    public void eat() {
        System.out.println("I am eating anything I find on the street...");
    }

    @Override
    public String toString(){
        return String.format("Vida: %d\nEsta Dormido: %b\nNumero de patas: %d\n", getVida(), isSleeping(), getNumberOfLegs()).concat(
                String.format("Es Paloma: %b\nAltitud: %d\n", isPigeon, altitude) );
    }
}
