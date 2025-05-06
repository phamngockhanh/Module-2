package ss999_case_study.entity;

public class Customer extends Person {
    private String customerId;
    private String typeOfCustomer;
    private String address;

    public Customer(String fullName, String dateOfBirth, String gender, String phoneNumber, String email, String identityCard, String customerId, String typeOfCustomer, String address) {
        super(fullName, dateOfBirth, gender, phoneNumber, email, identityCard);
        this.customerId = customerId;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                super.toString() +
                "customerId=" + customerId +
                ", typeOfCustomer='" + typeOfCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getInfor() {
        return super.getInfo() + "," + customerId + "," + typeOfCustomer + "," + address ;
    }
}
