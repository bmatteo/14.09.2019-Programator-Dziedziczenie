package pl.programator;

public class Amfibia extends Vehicle {

    public Amfibia() {
        System.out.println("Amfibia konstruktor !!");
    }

    @Override
    public void jade() {
        System.out.println("Chowam srube !!");
        super.jade();
    }
}
