package ss1000_practice_exam.entity;

public class Customer {
    private String customerCode;
    private String customerName;

    public Customer(String customerCode, String customerName) {
        this.customerCode = customerCode;
        this.customerName = customerName;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerCode='" + customerCode + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }

    public String getInfo(){
        return this.getCustomerCode()+","+this.getCustomerName();
    }
}
