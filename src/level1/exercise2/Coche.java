package level1.exercise2;

public class Coche {
    private static final String brand = "Toyota";
    private static String model;
    private final double power;

    public Coche(double power){
        //no puedo usar this, ya que no es una instancia, pertenece a la clase
        Coche.model= "Corolla";
        this.power = power;
    }

    public static String getModel() {
        return model;
    }

    public static String getBrand() {
        return brand;
    }

    public void accelerate (){
        System.out.println("The car is accelerating");

    }
    public static void brake(){
        System.out.println("The car is braking");
    }

    @Override
    public String toString() {
        return "Car: " +"\n"+
                "Power= " + power +"\n"+
                "Model= "+ getModel()+"\n"+
                //constante de clase
                "Brand= "+ Coche.brand ;
    }
}
