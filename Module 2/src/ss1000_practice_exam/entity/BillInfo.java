package ss1000_practice_exam.entity;

public class BillInfo {
    private String billNumber;
    private String customerCode;
    private String dateTime;
    private double amount;
    private double price;
    private double total;

    public BillInfo(String billNumber, String customerCode, String dateTime, double amount, double price, double total) {
        this.billNumber = billNumber;
        this.customerCode = customerCode;
        this.dateTime = dateTime;
        this.amount = amount;
        this.price = price;
        this.total = total;
    }

    public String getBillNumber() {
        return billNumber;
    }

    public void setBillNumber(String billNumber) {
        this.billNumber = billNumber;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "BillInfo{" +
                "billNumber='" + billNumber + '\'' +
                ", customerCode='" + customerCode + '\'' +
                ", dateTime='" + dateTime + '\'' +
                ", amount=" + amount +
                ", price=" + price +
                ", total=" + total +
                '}';
    }

    public String getInfo() {
        return this.billNumber + "," + this.customerCode + "," + this.amount + "," + this.price + "," + this.total;
    }
}
