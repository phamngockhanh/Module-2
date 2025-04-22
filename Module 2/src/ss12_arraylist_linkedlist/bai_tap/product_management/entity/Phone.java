package ss12_arraylist_linkedlist.bai_tap.product_management.entity;

public class Phone extends Product {
    private int cameraMP;

    public Phone(int cameraMP) {
        this.cameraMP = cameraMP;
    }

    public Phone(String name, int id, double price, int cameraMP) {
        super(name, id, price);
        this.cameraMP = cameraMP;
    }

    public int getCameraMP() {
        return cameraMP;
    }

    public void setCameraMP(int cameraMP) {
        this.cameraMP = cameraMP;
    }

    @Override
    public String toString() {
        return "Phone{" +
                super.toString()+
                "cameraMP=" + cameraMP +
                '}';
    }
}
