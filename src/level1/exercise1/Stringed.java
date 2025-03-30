package level1.exercise1;

public class Stringed extends Instrument {

    static {
        System.out.println("another statically loaded block");
    }

    public Stringed(String name, double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A stringed instrument is playing");
    }

    @Override
    public String toString() {
        return "Stringed: "+"\n" + super.toString();
    }
}
