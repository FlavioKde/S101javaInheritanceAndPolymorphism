package level1.exercise1;

public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Instrument: " +"\n"+
                "Name: " + name + '\n' +
                "Price: " + price
                ;
    }
    public abstract void play();
}
