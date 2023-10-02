package main.animals;

public class Mamifero extends Animal{

    private boolean hasMilk;
    private boolean isCow;

    public Mamifero(){

    }

    public boolean isCow(){
        return this.isCow;
    }
    public void setIsCow(boolean isCow){
        this.isCow = isCow;
    }

    public boolean hasMilk(){
        return this.hasMilk;
    }

    public void setHasMilk(boolean hasMilk){
        this.hasMilk = hasMilk;
    }

    @Override
    public void eat() {
        System.out.println("I am probably eating grass...");
    }

    @Override
    public String toString(){
        return String.format("Vida: %d\nEsta Dormido: %b\nNumero de patas: %d\n", getVida(), isSleeping(), getNumberOfLegs()).concat(
                String.format("Tiene leche: %b\nEs una vaca: %b\n", hasMilk, isCow) );
    }
}