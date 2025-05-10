package ss1000_practice_exam.view;

import ss1000_practice_exam.common.RegularExpression;
import ss1000_practice_exam.entity.Customer;
import ss1000_practice_exam.entity.ForeignerCustomer;
import ss1000_practice_exam.entity.TypOfCustomer;
import ss1000_practice_exam.entity.VietNamCustomer;

import java.util.List;
import java.util.Scanner;

public class CustomerView {
    private static Scanner sc = new Scanner(System.in);
    public static void display(List<Customer> customers){
        for(Customer customer :customers){
            System.out.println(customer);
        }
    }

    public static String search(){
        System.out.println("Nhập từ cần tìm kiếm");
        return sc.nextLine();
    }



    public static Customer addCustomerVN(List<TypOfCustomer> typOfCustomers){
        String customerCode = RegularExpression.checkCustomerCode(sc,"Nhập mã khách hàng","Vietnam");
        String customerName = RegularExpression.checkName(sc,"Nhập tên khách hàng");
        for (int i = 0; i < typOfCustomers.size(); i++) {
            System.out.println(i+1+ " : "+typOfCustomers.get(i).getName());
        }
        int choice;
        do{
            choice = Integer.parseInt(sc.nextLine());
            if(choice<0||choice>typOfCustomers.size()){
                System.out.printf("Please enter your selection from 1 to %d",typOfCustomers.size());
            }
        }while(choice<0||choice>typOfCustomers.size());
        String typeCustomer= "";
        for(int i = 0; i<typOfCustomers.size();i++){
            if(choice == (i+1)){
                typeCustomer = typOfCustomers.get(i).getName();
            }
        }
        System.out.println("Nhập định mức tiêu thụ");
        double spendAmount = Double.parseDouble(sc.nextLine());
        return new VietNamCustomer(customerCode,customerName,typeCustomer,spendAmount);
    }

    public static Customer addCustomerFr(){
        String customerCode = RegularExpression.checkCustomerCode(sc,"Nhập mã khách hàng","Nuocngoai");
        String customerName = RegularExpression.checkName(sc,"Nhập tên khách hàng");
        System.out.println("Nhập quốc tịch");
        String citizen = sc.nextLine();
        return new ForeignerCustomer(customerCode,customerName,citizen);
    }
}
