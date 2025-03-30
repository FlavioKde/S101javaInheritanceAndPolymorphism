package level2.exercise1;

public class Smartphone extends Telephone implements Camera, Wristwatch {

    public Smartphone(String model, String brand){
        super(model, brand);
    }

    public void call(String phoneNumber){
        System.out.println("the phone number "+phoneNumber+" is being called");
    }

    @Override
    public void alarm() {
        Wristwatch.super.alarm();
    }
    @Override
    public void photograph(){
        System.out.println("He is taking a photo");
    };

    @Override
    public String toString() {
        return "Smartphone: " +"\n" + super.toString();
    }
}
