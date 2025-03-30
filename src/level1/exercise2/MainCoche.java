package level1.exercise2;

public class MainCoche {
    public static void main(String[] args) {
        Coche coche = new Coche(900.0);
        System.out.println(coche.toString());

        //metodo de una instancia de una clase
        coche.accelerate();

        //metodo de clase
        Coche.brake();
    }
}
