package ss999_case_study.entity;

public class Room extends Facility {
    private String roomStandard;
    private int numberOfFloor;

    public Room(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxOccupancy, String rentalType, String roomStandard, int numberOfFloor) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxOccupancy, rentalType);
        this.roomStandard = roomStandard;
        this.numberOfFloor = numberOfFloor;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public int getNumberOfFloor() {
        return numberOfFloor;
    }

    public void setNumberOfFloor(int numberOfFloor) {
        this.numberOfFloor = numberOfFloor;
    }

    @Override
    public String toString() {
        return "Room{" +
                super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numberOfFloor=" + numberOfFloor +
                '}';
    }

    public String getInfo(int usagecount) {
        return super.getInfo() + "," + this.getRoomStandard() + "," + this.getNumberOfFloor()+ "," + usagecount;
    }
}
