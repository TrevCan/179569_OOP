package examen1;

public class Extra {

    public Extra(){

    }

    public void fizzBuzz(){

        for(int i = 1; i <= 100; i++) {
            boolean esMultiplode3 = i%3 == 0;
            boolean esMultiplode5 = i%5 == 0;

            if(esMultiplode3 || esMultiplode5) {
                if (esMultiplode3)
                    System.out.print("Fizz");
                if (esMultiplode5)
                    System.out.print("Buzz");
            }else{
                System.out.print(i);
            }
            System.out.println();

        }

    }
}
