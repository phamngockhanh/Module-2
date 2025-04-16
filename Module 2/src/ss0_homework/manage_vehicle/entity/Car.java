package ss0_homework.manage_vehicle.entity;

public class Car extends Vehicle {
    private int numberOfSeats;
    private String typeOfCar;
    public Car(){}

    public Car(int numberOfSeats, String typeOfCar) {
        this.numberOfSeats = numberOfSeats;
        this.typeOfCar = typeOfCar;
    }

    public Car(String numberPlate, String manufacturerName, int yearOfManufacture, String owner, int numberOfSeats, String typeOfCar) {
        super(numberPlate, manufacturerName, yearOfManufacture, owner);
        this.numberOfSeats = numberOfSeats;
        this.typeOfCar = typeOfCar;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    @Override
    public String toString() {
        return "Car{" +
                super.toString()+
                "numberOfSeats=" + numberOfSeats +
                ", typeOfCar='" + typeOfCar + '\'' +
                '}';
    }
}
