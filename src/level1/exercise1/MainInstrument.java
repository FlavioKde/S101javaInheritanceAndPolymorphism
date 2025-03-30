package level1.exercise1;

public class MainInstrument {
    public static void main(String[] args) {
        Wind wind = new Wind("trumpet", 200.0);
        System.out.println(wind.toString());


        wind.play();
        System.out.println(" ");

        Stringed stringed = new Stringed("guitar", 250.0);
        System.out.println(stringed.toString());


        stringed.play();
        System.out.println(" ");

        Percussion percussion = new Percussion("maraca", 23.10);
        System.out.println(percussion.toString());

        percussion.play();
    }
}