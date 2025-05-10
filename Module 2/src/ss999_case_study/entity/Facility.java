package ss999_case_study.entity;

public class Facility {
    private String serviceCode;
    private String serviceName;
    private double usableArea;
    private double rentalCost;
    private int maxOccupancy;
    private String rentalType;

    public Facility(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxOccupancy, String rentalType) {
        this.serviceCode = serviceCode;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentalCost = rentalCost;
        this.maxOccupancy = maxOccupancy;
        this.rentalType = rentalType;
    }


    public String getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public double getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(double rentalCost) {
        this.rentalCost = rentalCost;
    }

    public int getMaxOccupancy() {
        return maxOccupancy;
    }

    public void setMaxOccupancy(int maxOccupancy) {
        this.maxOccupancy = maxOccupancy;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }


    @Override
    public String toString() {
        return
                "serviceCode=" + serviceCode +
                        ", serviceName='" + serviceName + '\'' +
                        ", usableArea=" + usableArea +
                        ", rentalCost=" + rentalCost +
                        ", maxOccupancy=" + maxOccupancy +
                        ", rentalType='" + rentalType + '\'';
    }

    public String getInfo(){
        return this.getServiceCode()+","+this.getServiceName()+","+this.getUsableArea()+","+this.getRentalCost()+","+this.getMaxOccupancy()+","+this.getRentalType();
    }
}
