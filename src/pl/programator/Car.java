package pl.programator;

public class Car extends Vehicle {

    public String vin;

    public void otworzBagaznik() {
        System.out.println("Otwieram ...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "pojemnosc=" + pojemnosc +
                ", waga=" + waga +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Car)) {
            return false;
        }

        if(this.vin.equals(((Car) o).vin)) {
            return true;
        } else {
            return false;
        }
    }
}
