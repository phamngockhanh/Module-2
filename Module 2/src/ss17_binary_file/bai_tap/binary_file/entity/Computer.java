package ss17_binary_file.bai_tap.binary_file.entity;

public class Computer extends Product{
    private int ram;
    private String chip;

    Computer(){
    }

    public Computer(int ram, String chip) {
        this.ram = ram;
        this.chip = chip;
    }

    public Computer(int id, String name, double price, int ram, String chip) {
        super(id, name, price);
        this.ram = ram;
        this.chip = chip;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    @Override
    public String toString() {
        return "Computer{" +
                super.toString()+
                "ram=" + ram +
                ", chip='" + chip + '\'' +
                '}';
    }

    public String getInfor(){
        return this.getId()+","+this.getName()+","+this.getPrice()+","+this.getRam()+","+this.getChip()+",";
    }
}
