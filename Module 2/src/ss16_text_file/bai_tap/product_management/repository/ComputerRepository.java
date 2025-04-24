package ss16_text_file.bai_tap.product_management.repository;

import ss16_text_file.bai_tap.product_management.common.Flag;
import ss16_text_file.bai_tap.product_management.common.ReadAndWriteFile;
import ss16_text_file.bai_tap.product_management.entity.Computer;
import ss16_text_file.bai_tap.product_management.entity.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ComputerRepository implements IComputerRepository {
    public final String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss16_text_file\\bai_tap\\product_management\\repository\\List.txt";

    @Override
    public ArrayList<Computer> findAll() {
        List<String> lines = ReadAndWriteFile.readFileCSV(FILE_PATH);
        ArrayList<Computer> computerList = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");

            if (parts.length >= 5) {
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                double price = Double.parseDouble(parts[2]);
                String cpu = parts[3];
                int ram = Integer.parseInt(parts[4]);

                Computer computer = new Computer(id, name, price, cpu, ram);
                computerList.add(computer);
            }
        }
        return computerList;
    }

    @Override
    public void delete(int id) {
        ArrayList<Computer> computerArrayList = findAll();
        for (int i = 0; i < computerArrayList.size(); i++) {
            if (computerArrayList.get(i).getId() == id && Flag.deleteConfirm) {
                computerArrayList.remove(i);
                break;
            }
        }

        List<String> lines = new ArrayList<>();
        for (Computer computer : computerArrayList) {
            lines.add(computer.getInfo());
        }
        ReadAndWriteFile.writeFileCSV(FILE_PATH, false, lines);
    }

    @Override
    public void add(Computer computer) {
        ReadAndWriteFile.writeFileCSV(FILE_PATH, true, Arrays.asList(computer.getInfo()));
    }

    @Override
    public void findId(int id) {
        ArrayList<Computer> computerArrayList = findAll();
        for (Computer computer : computerArrayList) {
            if (computer.getId() == id) {
                Flag.flag = true;
                break;
            }
        }
    }

    @Override
    public void update(Computer computer) {
        ArrayList<Computer> computerArrayList = findAll();
        for (int i = 0; i < computerArrayList.size(); i++) {
            if (computer.getId() == computerArrayList.get(i).getId()) {
                computerArrayList.set(i, computer);
            }
        }

        List<String> lines = new ArrayList<>();
        for (Computer computer1 : computerArrayList) {
            lines.add(computer1.getInfo());
        }
        ReadAndWriteFile.writeFileCSV(FILE_PATH, false, lines);
    }

}
