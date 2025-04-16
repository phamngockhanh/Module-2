package ss0_homework.manage_vehicle.entity;

public class Motorbike extends Vehicle {
    private double power;


    public Motorbike(double power) {
        this.power = power;
    }

    public Motorbike(String numberPlate, String manufacturerName, int yearOfManufacture, String owner, double power) {
        super(numberPlate, manufacturerName, yearOfManufacture, owner);
        this.power = power;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }
    @Override
    public String toString() {
        return "Motorbike{" +
                super.toString()+
                "power=" + power +
                '}';
    }
}
