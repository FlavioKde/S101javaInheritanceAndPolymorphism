package level2.exercise1;

public abstract class Telephone {
    private String model;
    private String brand;

    public Telephone(String model, String brand){
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Telephone:" + "\n"+
                "Model: " + model + '\n' +
                "Brand: " + brand + '\''
                ;
    }
    public abstract void call(String phoneNumber);
}
