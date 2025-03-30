package level2.exercise1;

public class MainTelephone {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone("X-25","Nokia");
        System.out.println(smartphone.toString());

        smartphone.alarm();
        smartphone.photograph();
        smartphone.call("690567435");
    }
}
