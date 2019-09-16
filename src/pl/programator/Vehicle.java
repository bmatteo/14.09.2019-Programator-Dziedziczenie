package pl.programator;

public class Vehicle {
    public int pojemnosc;
    public int waga;
    public String marka;
    public String model;

    public Vehicle() {
        System.out.println("Vehicle konstruktor !!");
    }

    public void jade() {
        System.out.println("Jadę !!");
    }

    @Override
    public String toString() {
        return "Vehicle toString";
    }
}
