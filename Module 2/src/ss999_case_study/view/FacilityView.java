package ss999_case_study.view;

import ss999_case_study.common.RegularExpression;
import ss999_case_study.common.RoleSelectionList;
import ss999_case_study.entity.Facility;
import ss999_case_study.entity.House;
import ss999_case_study.entity.Room;
import ss999_case_study.entity.Villa;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class FacilityView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            Facility facility = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Facility: " + facility + ", Value: " + value);
        }
    }

    public static void displayMaintenance(Map<Facility, Integer> facilityIntegerMap) {
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            Facility facility = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("Facility: " + facility + ", Value: " + value);
        }
    }

    //(String serviceCode, String serviceName, double usableArea, double rentalCost, int maxOccupancy, String rentalType, String roomStandard, double poolArea, int numberOfFloors)
    public static Facility addHouse() {
        ArrayList<String> rentalTypeList = RoleSelectionList.typeOfRentalList;
        String serviceCode = RegularExpression.checkServiceCode(sc, "Enter service code", "House");
        String serviceName = RegularExpression.checkNameService(sc, "Enter service name");
        double useableArea = RegularExpression.validateArea(sc, "usableArea", "Enter area:");
        double rentalCost = RegularExpression.validateCost(sc, "Enter rental cost:");
        int maxOccupancy = RegularExpression.maxOccupancy(sc,"Enter max occupancy:") ;
        for (int i = 0; i < rentalTypeList.size(); i++) {
            System.out.println(i + 1 + "." + rentalTypeList.get(i));
        }
        int choice;
        do {
            choice = RegularExpression.readInt(sc, "Enter your choice");
            if (choice > rentalTypeList.size() || choice < 0) {
                System.out.printf("Please enter value around 1 to %d", rentalTypeList.size());
            }
        } while (choice > rentalTypeList.size() || choice < 0);
        String rentalType = "";
        for (int i = 0; i < rentalTypeList.size(); i++) {
            if (choice == (i + 1)) {
                rentalType = rentalTypeList.get(i);
            }
        }
        String roomStandard = RegularExpression.checkNameService(sc,"Enter room standard: ");
        double pooleArea = RegularExpression.validateArea(sc,"poolArea","Enter pool area: ");
        int numberOfFloors = RegularExpression.checkNumberOfFloors(sc,"Enter number of floors: ");
        return new House(serviceCode,serviceName,useableArea,rentalCost,maxOccupancy,rentalType,roomStandard,pooleArea,numberOfFloors);
    }

    //String serviceCode, String serviceName, double usableArea, double rentalCost, int maxOccupancy, String rentalType, String freeIncludedServices
    public static Facility addVilla() {
        ArrayList<String> rentalTypeList = RoleSelectionList.typeOfRentalList;
        String serviceCode = RegularExpression.checkServiceCode(sc, "Enter service code", "Villa");
        String serviceName = RegularExpression.checkNameService(sc, "Enter service name");
        double useableArea = RegularExpression.validateArea(sc, "usableArea", "Enter area:");
        double rentalCost = RegularExpression.validateCost(sc, "Enter rental cost:");
        int maxOccupancy = RegularExpression.maxOccupancy(sc,"Enter max occupancy:") ;
        for (int i = 0; i < rentalTypeList.size(); i++) {
            System.out.println(i + 1 + "." + rentalTypeList.get(i));
        }
        int choice;
        do {
            choice = RegularExpression.readInt(sc, "Enter your choice");
            if (choice > rentalTypeList.size() || choice < 0) {
                System.out.printf("Please enter value around 1 to %d", rentalTypeList.size());
            }
        } while (choice > rentalTypeList.size() || choice < 0);
        String rentalType = "";
        for (int i = 0; i < rentalTypeList.size(); i++) {
            if (choice == (i + 1)) {
                rentalType = rentalTypeList.get(i);
            }
        }
        String freeIncludedServices = RegularExpression.checkNameService(sc,"Enter free included services: ");
        return new Villa(serviceCode,serviceName,useableArea,rentalCost,maxOccupancy,rentalType,freeIncludedServices);
    }

//String serviceCode, String serviceName, double usableArea, double rentalCost, int maxOccupancy, String rentalType, String roomStandard, int numberOfFloor
    public static Facility addRoom() {
        ArrayList<String> rentalTypeList = RoleSelectionList.typeOfRentalList;
        String serviceCode = RegularExpression.checkServiceCode(sc, "Enter service code", "Room");
        String serviceName = RegularExpression.checkNameService(sc, "Enter service name");
        double useableArea = RegularExpression.validateArea(sc, "usableArea", "Enter area:");
        double rentalCost = RegularExpression.validateCost(sc, "Enter rental cost:");
        int maxOccupancy = RegularExpression.maxOccupancy(sc,"Enter max occupancy:") ;
        for (int i = 0; i < rentalTypeList.size(); i++) {
            System.out.println(i + 1 + "." + rentalTypeList.get(i));
        }
        int choice;
        do {
            choice = RegularExpression.readInt(sc, "Enter your choice");
            if (choice > rentalTypeList.size() || choice < 0) {
                System.out.printf("Please enter value around 1 to %d", rentalTypeList.size());
            }
        } while (choice > rentalTypeList.size() || choice < 0);
        String rentalType = "";
        for (int i = 0; i < rentalTypeList.size(); i++) {
            if (choice == (i + 1)) {
                rentalType = rentalTypeList.get(i);
            }
        }
        String roomStandard = RegularExpression.checkNameService(sc,"Enter room standard: ");
        int numberOfFloor = RegularExpression.checkNumberOfFloors(sc,"Enter number of floors: ");
        return new Room(serviceCode,serviceName,useableArea,rentalCost,maxOccupancy,rentalType,roomStandard,numberOfFloor);
    }

}
