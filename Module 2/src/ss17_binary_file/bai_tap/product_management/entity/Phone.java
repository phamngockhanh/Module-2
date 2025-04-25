package ss17_binary_file.bai_tap.product_management.entity;

public class Phone extends Product {
    private int cameraMP;

    public Phone(int cameraMP) {
        this.cameraMP = cameraMP;
    }

    public Phone( int id,String name, double price, int cameraMP) {
        super(id,name, price);
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

    public String getInfo(){
        return getId()+","+getName()+","+getPrice()+","+getCameraMP();
    }
}
