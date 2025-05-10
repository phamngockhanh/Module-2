package ss1000_practice_exam.entity;

public class ForeignerCustomer extends Customer{
    private String citizenShip;

    public ForeignerCustomer(String customerCode, String customerName, String citizenShip) {
        super(customerCode, customerName);
        this.citizenShip = citizenShip;
    }

    public String getCitizenShip() {
        return citizenShip;
    }

    public void setCitizenShip(String citizenShip) {
        this.citizenShip = citizenShip;
    }

    @Override
    public String toString() {
        return "ForeignerCustomer{" +
                "citizenShip='" + citizenShip + '\'' +
                '}';
    }

    public String getInfo(){
        return super.getInfo()+","+citizenShip;
    }
}
