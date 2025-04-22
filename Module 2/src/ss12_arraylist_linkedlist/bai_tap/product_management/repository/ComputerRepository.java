package ss12_arraylist_linkedlist.bai_tap.product_management.repository;

import ss0_homework.manage_vehicle.common.DeleteFlag;
import ss12_arraylist_linkedlist.bai_tap.product_management.common.Flag;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Computer;

import java.util.ArrayList;

public class ComputerRepository implements IComputerRepository {
    public static ArrayList<Computer> computers = new ArrayList<>(5);

    static {
        computers.add(new Computer("Tuf1", 1, 321, "corei5", 12));
        computers.add(new Computer("Tuf2", 2, 321, "corei6", 12));
        computers.add(new Computer("Tuf3", 3, 321, "corei7", 12));
    }

    @Override
    public ArrayList<Computer> findAll() {
        return computers;
    }

    @Override
    public void delete(int id) {
        for (Computer computer : computers) {
            if (computer.getId() == id && Flag.deleteConfirm) {
                computers.remove(computer);
                break;
            }
        }
    }

    @Override
    public void add(Computer computer) {
        computers.add(computer);
    }

    @Override
    public void findId(int id) {
        for (Computer computer : computers) {
            if (computer.getId() == id) {
                Flag.flag = true;
                break;
            }
        }
    }

    @Override
    public void update(Computer computer) {
        for (int i = 0; i < computers.size(); i++) {
            if(computer.getId()==computers.get(i).getId()){
                computers.set(i,computer);
            }
        }
    }

}
