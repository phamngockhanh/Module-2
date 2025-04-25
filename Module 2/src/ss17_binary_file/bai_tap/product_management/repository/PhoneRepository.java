package ss17_binary_file.bai_tap.product_management.repository;

import ss17_binary_file.bai_tap.product_management.common.Flag;
import ss17_binary_file.bai_tap.product_management.common.ReadAndWriteFile;
import ss17_binary_file.bai_tap.product_management.entity.Phone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PhoneRepository implements IPhoneRepository {
    public final String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss17_binary_file\\bai_tap\\product_management\\data\\ListPhone.txt";

    @Override
    public ArrayList<Phone> findAll() {
        List<String> lines = ReadAndWriteFile.readFileCSV(FILE_PATH);
        ArrayList<Phone> arrayList = new ArrayList<>();

        for (String line : lines) {
            String[] parts = line.split(",");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            Double price = Double.parseDouble(parts[2]);
            int cameraMP = Integer.parseInt(parts[3]);
            Phone phone = new Phone(id, name, price, cameraMP);
            arrayList.add(phone);
        }
        return arrayList;
    }

    @Override
    public void delete(int id) {
        ArrayList<Phone> phones = findAll();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId() == id && Flag.deleteConfirm) {
                phones.remove(i);
                break;
            }
        }

        List<String> list = new ArrayList<>();
        for (Phone phone : phones) {
            list.add(phone.getInfo());
        }
        ReadAndWriteFile.writeFileCSV(FILE_PATH, false, list);
    }

    @Override
    public void add(Phone phone) {
        ReadAndWriteFile.writeFileCSV(FILE_PATH, true, Arrays.asList(phone.getInfo()));
    }

    @Override
    public void findId(int id) {
        ArrayList<Phone> phones = findAll();
        for (Phone phone : phones) {
            if (phone.getId() == id) {
                Flag.flag = true;
                break;
            }

        }
    }

    @Override
    public void update(Phone phone) {
        ArrayList<Phone> phones = findAll();
        for (int i = 0; i < phones.size(); i++) {
            if (phone.getId() == phones.get(i).getId()) {
                phones.set(i, phone);
            }
        }

        List<String> list = new ArrayList<>();
        for (Phone phone1 : phones) {
            list.add(phone1.getInfo());
        }

        ReadAndWriteFile.writeFileCSV(FILE_PATH, false, list);
    }

}
