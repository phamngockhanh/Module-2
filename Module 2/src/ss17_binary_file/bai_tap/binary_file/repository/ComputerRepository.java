package ss17_binary_file.bai_tap.binary_file.repository;

import ss17_binary_file.bai_tap.binary_file.common.Flag;
import ss17_binary_file.bai_tap.binary_file.common.ReadAndWriteFile;
import ss17_binary_file.bai_tap.binary_file.entity.Computer;

import java.util.ArrayList;
import java.util.List;

public class ComputerRepository implements IComputerRepository {
    private static String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss17_binary_file\\bai_tap\\binary_file\\data\\computerCSV.txt";

    @Override
    public List<Computer> findAll() {
        List<String> list = ReadAndWriteFile.readFileCSV(FILE_PATH);
        ArrayList<Computer> computer = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            String[] arr = list.get(i).split(",");
            computer.add(new Computer(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), Integer.parseInt(arr[3]), arr[4]));
        }

        return computer;
    }

    @Override
    public void add(Computer computer) {
        List<String> list = new ArrayList<>();
        list.add(computer.getInfor());
        ReadAndWriteFile.writeFileCSV(FILE_PATH, true, list);
    }

    @Override
    public boolean delete(int id) {
        boolean found = false;
        List<Computer> computers = findAll();
        for (int i = 0; i < computers.size(); i++) {
            if (computers.get(i).getId() == id) {
                computers.remove(i);
                found = true;
            }
        }
        if (found) {
            List<String> stringList = new ArrayList<>();
            for (Computer computer : computers) {
                stringList.add(computer.getInfor());
            }
            ReadAndWriteFile.writeFileCSV(FILE_PATH, false, stringList);
        }

        return found;

    }

    @Override
    public boolean update(Computer computer) {
        List<Computer> computers = findAll();
        boolean found = false;
        for (int i = 0; i < computers.size(); i++) {
            computers.set(i,computer);
            found=true;
        }

        if(found) {
            List<String> stringList = new ArrayList<>();
            for(Computer computer1:computers){
                stringList.add(computer1.getInfor());
            }
            ReadAndWriteFile.writeFileCSV(FILE_PATH,false,stringList);
        }
        return found;
    }

    @Override
    public void findId(int id) {
        List<Computer> computers = findAll();

        for (Computer computer1 : computers) {
            if (computer1.getId() == id) {
                Flag.flag = true;
                break;
            }
        }
    }
}
