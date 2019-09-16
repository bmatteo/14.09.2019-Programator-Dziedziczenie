package pl.programator;

public class Main2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = c1;

        c1.marka = "BMW";

        //System.out.println(c1.marka);
        //System.out.println(c2.marka);

        String a = "ABC";
        String temp = "AB";
        String b = temp + "C";

        System.out.println(a);
        System.out.println(b);
        System.out.println(a.equals(b));

        Car car1 = new Car();
        Car car2 = new Car();

        Bus bus = new Bus();

        car1.vin = "ABCD123";
        car2.vin = "ABCD123";

        System.out.println(car1.equals(bus));
    }
}
