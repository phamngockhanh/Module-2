package ss12_arraylist_linkedlist.bai_tap.product_management.entity;

public class Computer extends Product {
   private String cpu;
   private int ram;

   public Computer(String name, int id, double price, String cpu, int ram) {
      super(name, id, price);
      this.cpu = cpu;
      this.ram = ram;
   }

   public Computer(String cpu, int ram) {
      this.cpu = cpu;
      this.ram = ram;
   }

   public String getCpu() {
      return cpu;
   }

   public void setCpu(String cpu) {
      this.cpu = cpu;
   }

   public int getRam() {
      return ram;
   }

   public void setRam(int ram) {
      this.ram = ram;
   }

   @Override
   public String toString() {
      return "Computer{" +
              super.toString()+
              "cpu='" + cpu + '\'' +
              ", ram=" + ram +
              '}';
   }
}
