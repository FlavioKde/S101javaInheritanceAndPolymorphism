package level1.exercise1;

public class Wind extends Instrument {

    static {
        System.out.println("because less is more, another statically loaded block");
    }

    public Wind(String name, double price){
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("A wind instrument is playing");
    }

    @Override
    public String toString() {
        return "Wind: " +"\n" + super.toString();
    }
}
