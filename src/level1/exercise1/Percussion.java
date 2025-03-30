package level1.exercise1;


public class Percussion extends Instrument {

    static {
        System.out.println("statically loaded block");
    }

    public Percussion(String name, double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A percussion instrument is playing");
    }

    @Override
    public String toString() {
        return "Percussion: "+"\n" + super.toString();
    }
}
