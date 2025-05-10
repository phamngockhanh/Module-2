package ss1000_practice_exam.entity;

public class VietNamCustomer extends Customer {
    private String typeOfCustomer;
    private double spendAmount;

    public VietNamCustomer(String customerCode, String customerName, String typeOfCustomer, double spendAmount) {
        super(customerCode, customerName);
        this.typeOfCustomer = typeOfCustomer;
        this.spendAmount = spendAmount;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public double getSpendAmount() {
        return spendAmount;
    }

    public void setSpendAmount(double spendAmount) {
        this.spendAmount = spendAmount;
    }

    @Override
    public String toString() {
        return "VietNamCustomer{" +
                "typeOfCustomer='" + typeOfCustomer + '\'' +
                ", spendAmount=" + spendAmount +
                '}';
    }

    public String getInfo(){
        return super.getInfo()+","+this.getTypeOfCustomer()+","+this.getSpendAmount();
    }
}
