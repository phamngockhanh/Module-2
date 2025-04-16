package ss0_homework.manage_vehicle.entity;

public abstract class Vehicle {
    private String numberPlate;
    private String manufacturerName;
    private int yearOfManufacture;
    private String owner;

    Vehicle() {
    }

    public Vehicle(String numberPlate, String manufacturerName, int yearOfManufacture, String owner) {
        this.numberPlate = numberPlate;
        this.manufacturerName = manufacturerName;
        this.yearOfManufacture = yearOfManufacture;
        this.owner = owner;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public String toString() {
        return
                "numberPlate='" + numberPlate + '\'' +
                        ", manufacturerName='" + manufacturerName + '\'' +
                        ", yearOfManufacture=" + yearOfManufacture +
                        ", owner='" + owner + '\'';
    }
}
