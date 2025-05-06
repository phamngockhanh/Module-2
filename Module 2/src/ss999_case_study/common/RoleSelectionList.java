package ss999_case_study.common;

import java.util.ArrayList;

public class RoleSelectionList {
    public static ArrayList<String> educationLevelList = new ArrayList<>();
    public static ArrayList<String> positionList = new ArrayList<>();
    public static ArrayList<String> customerList = new ArrayList<>();
    public static ArrayList<String> typeOfRentalList = new ArrayList<>();

    static{
        educationLevelList.add("Intermediate");
        educationLevelList.add("College");
        educationLevelList.add("University");
        educationLevelList.add("Postgraduate");

        positionList.add("Receptionist");
        positionList.add("Waiter/Waitress");
        positionList.add("Specialist");
        positionList.add("Supervisor");
        positionList.add("Manager");
        positionList.add("Director");

        customerList.add("Diamond");
        customerList.add("Platinum");
        customerList.add("Gold");
        customerList.add("Silver");
        customerList.add("Member");

        typeOfRentalList.add("Year");
        typeOfRentalList.add("Month");
        typeOfRentalList.add("Day");
        typeOfRentalList.add("Hour");
    }
}
