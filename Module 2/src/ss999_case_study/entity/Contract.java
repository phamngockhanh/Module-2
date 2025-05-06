package ss999_case_study.entity;

public class Contract {
    private String contractNumber;
    private String bookingCode;
    private double depositAmount;
    private double totalPayment;

    public Contract(String contractNumber, String bookingCode, double depositAmount, double totalPayment) {
        this.contractNumber = contractNumber;
        this.bookingCode = bookingCode;
        this.depositAmount = depositAmount;
        this.totalPayment = totalPayment;
    }


    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(String bookingCode) {
        this.bookingCode = bookingCode;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(double totalPayment) {
        this.totalPayment = totalPayment;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookingCode='" + bookingCode + '\'' +
                ", depositAmount=" + depositAmount +
                ", totalPayment=" + totalPayment +
                '}';
    }

    public String getInfor() {
        return contractNumber + "," + bookingCode + "," + depositAmount + "," + totalPayment;
    }
}
