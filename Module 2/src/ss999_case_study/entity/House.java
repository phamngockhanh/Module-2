package ss999_case_study.entity;

public class House extends Facility {
    private String roomStandard;
    private double poolArea;
    private int numberOfFloors;

    public House(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxOccupancy, String rentalType, String roomStandard, double poolArea, int numberOfFloors) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxOccupancy, rentalType);
        this.roomStandard = roomStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}';
    }

    public String getInfo(int usagecount) {
        return super.getInfo() + "," + this.getRoomStandard() + "," + this.getPoolArea() + "," + this.getNumberOfFloors() + "," + usagecount;
    }

}
