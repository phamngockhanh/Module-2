package ss999_case_study.entity;

public class Villa extends Facility {
    private String freeIncludedServices;

    public Villa(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxOccupancy, String rentalType, String freeIncludedServices) {
        super(serviceCode, serviceName, usableArea, rentalCost, maxOccupancy, rentalType);
        this.freeIncludedServices = freeIncludedServices;
    }

    public String getFreeIncludedServices() {
        return freeIncludedServices;
    }

    public void setFreeIncludedServices(String freeIncludedServices) {
        this.freeIncludedServices = freeIncludedServices;
    }

    @Override
    public String toString() {
        return "Villa{" +
                super.toString() +
                "freeIncludedServices='" + freeIncludedServices + '\'' +
                '}';
    }

    public String getInfo(int usagecount) {
        return super.getInfo() + "," + this.getServiceCode() + "," + usagecount;
    }
}
