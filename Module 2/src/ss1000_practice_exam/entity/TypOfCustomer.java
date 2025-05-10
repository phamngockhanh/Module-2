package ss1000_practice_exam.entity;

public class TypOfCustomer {
    private String typeOfCustomerCode;
    private String name;

    public TypOfCustomer(String typeOfCustomerCode, String name) {
        this.typeOfCustomerCode = typeOfCustomerCode;
        this.name = name;
    }

    public String getTypeOfCustomerCode() {
        return typeOfCustomerCode;
    }

    public void setTypeOfCustomerCode(String typeOfCustomerCode) {
        this.typeOfCustomerCode = typeOfCustomerCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return this.getTypeOfCustomerCode() + "," + this.getName();
    }
}
