package ss0_homework.manage_vehicle.entity;

public class Truck extends Vehicle{

    private int loadCapacity;

    public Truck() {
    }

    public Truck(String numberPlate, String manufacturerName, int yearOfManufacture, String owner, int loadCapacity) {
        super(numberPlate, manufacturerName, yearOfManufacture, owner);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                super.toString()+
                "loadCapacity=" + loadCapacity +
                '}';
    }
}
