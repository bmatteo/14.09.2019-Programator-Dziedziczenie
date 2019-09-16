package pl.programator;

public class Main {
    public static void main(String[] args) {
        Amfibia dupa = new Amfibia();
        Amfibia amfibia = new Amfibia();
        Car car = new Car();
        Vehicle car3 = new Car();
        Vehicle car2 = new Amfibia();
        Bus bus = new Bus();

        Vehicle[] tablicaPojazdow = new Vehicle[10];

        tablicaPojazdow[0] = car;
        tablicaPojazdow[1] = dupa;
        tablicaPojazdow[2] = bus;

        System.out.println(car3.toString());

        String a = "ABC";
        String b = "ABC";

        System.out.println(a == b);

        a = a + "D";

        System.out.println(a == b);


    }
}
