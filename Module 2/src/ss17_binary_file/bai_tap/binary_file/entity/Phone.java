package ss17_binary_file.bai_tap.binary_file.entity;

public class Phone extends Product {
    private double cameraMP;

    Phone() {
    }

    public Phone(double cameraMP) {
        this.cameraMP = cameraMP;
    }

    public Phone(int id, String name, double price, double cameraMP) {
        super(id, name, price);
        this.cameraMP = cameraMP;
    }

    public double getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(double cameraMP) {
        this.cameraMP = cameraMP;
    }

    public String getInfo() {
        return this.getId() + "," + this.getName() + "," + this.getPrice() + "," + this.getCameraMP();
    }

    @Override
    public String toString() {
        return "Phone{" +
                super.toString() +
                "cameraMP=" + cameraMP +
                '}';
    }
}
