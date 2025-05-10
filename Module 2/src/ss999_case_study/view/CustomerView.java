package ss999_case_study.view;

import ss999_case_study.common.RegularExpression;
import ss999_case_study.common.RoleSelectionList;
import ss999_case_study.entity.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//String fullName, String dateOfBirth, String gender, String phoneNumber, String email, String identityCard, String customerId, String typeOfCustomer, String address
public class CustomerView {
    private static Scanner sc = new Scanner(System.in);

    public static void display(List<Customer> customers) {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static Customer add() {
        ArrayList<String> typeOfCustomer = RoleSelectionList.customerList;

        String fullName = RegularExpression.checkName(sc, "Enter customer's name: ");

        String dateOfBirth = RegularExpression.checkDate(sc, "Enter date of birth: ");

        System.out.println("Gender: ");
        String gender = sc.nextLine();

        String phoneNumber = RegularExpression.checkPhoneNumber(sc, "Enter phone number: ");

        System.out.println("Email: ");
        String email = sc.nextLine();

        String identityCard = RegularExpression.checkIdentityCard(sc, "Enter identity card: ");

        String customerId = RegularExpression.checkId(sc, "Enter customer id:", "Customer");

        for (int i = 0; i < typeOfCustomer.size(); i++) {
            System.out.println(i+1+ " : "+typeOfCustomer.get(i));
        }
        int choice;
        do{
            choice = RegularExpression.readInt(sc,"Enter type of customer's choice: ");
            if(choice<0||choice>typeOfCustomer.size()){
                System.out.printf("Please enter your selection from 1 to %d",typeOfCustomer.size());
            }
        }while(choice<0||choice>typeOfCustomer.size());
        String typeCustomer= "";
        for(int i = 0; i<typeOfCustomer.size();i++){
            if(choice == (i+1)){
                typeCustomer = typeOfCustomer.get(i);
            }
        }

        System.out.println("Address: ");
        String address = sc.nextLine();
        return new Customer(fullName,dateOfBirth,gender,phoneNumber,email,identityCard,customerId,typeCustomer,address);
    }

    public static Customer update(String id){
        ArrayList<String> typeOfCustomer = RoleSelectionList.customerList;

        String fullName = RegularExpression.checkName(sc, "Enter customer's name again: ");

        String dateOfBirth = RegularExpression.checkDate(sc, "Enter date of birth again: ");

        System.out.println("Gender: ");
        String gender = sc.nextLine();

        String phoneNumber = RegularExpression.checkPhoneNumber(sc, "Enter phone number again: ");

        System.out.println("Email: ");
        String email = sc.nextLine();

        String identityCard = RegularExpression.checkIdentityCard(sc, "Enter identity card again: ");


        for (int i = 0; i < typeOfCustomer.size(); i++) {
            System.out.println(i+1+ " : "+typeOfCustomer.get(i));
        }
        int choice;
        do{
            choice = RegularExpression.readInt(sc,"Enter type of customer's choice: ");
            if(choice<0||choice>typeOfCustomer.size()){
                System.out.printf("Please enter your selection from 1 to %d",typeOfCustomer.size());
            }
        }while(choice<0||choice>typeOfCustomer.size());
        String typeCustomer= "";
        for(int i = 0; i<typeOfCustomer.size();i++){
            if(choice == (i+1)){
                typeCustomer = typeOfCustomer.get(i);
            }
        }

        System.out.println("Address: ");
        String address = sc.nextLine();
        return new Customer(fullName,dateOfBirth,gender,phoneNumber,email,identityCard,id,typeCustomer,address);
    }


    public static String findId() {
        System.out.println("Enter id you want to find: ");
        return sc.nextLine();
    }



    public static boolean delete() {
        System.out.println("Do you want to delete? Yes/No");
        String confirm = sc.nextLine();
        return confirm.equalsIgnoreCase("Yes");
    }
}
