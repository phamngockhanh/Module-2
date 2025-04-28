package ss17_binary_file.bai_tap.binary_file.repository;

import ss17_binary_file.bai_tap.binary_file.common.Flag;
import ss17_binary_file.bai_tap.binary_file.common.ReadAndWriteFile;
import ss17_binary_file.bai_tap.binary_file.entity.Phone;

import java.util.ArrayList;
import java.util.List;

public class PhoneRepository implements IPhoneRepository {

    private static String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss17_binary_file\\bai_tap\\binary_file\\data\\phoneCSV.txt";

    @Override
    public List<Phone> findAll() {
        List<Phone> phones = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(FILE_PATH);
        for (String s : stringList) {
            String[] arr;
            arr = s.split(",");
            phones.add(new Phone(Integer.parseInt(arr[0]), arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3])));
        }
        return phones;
    }

    @Override
    public void add(Phone phone) {
        List<String> stringList = new ArrayList<>();
        stringList.add(phone.getInfo());
        ReadAndWriteFile.writeFileCSV(FILE_PATH, true, stringList);
    }

    @Override
    public boolean delete(int id) {
        boolean found = false;
        List<Phone> phones = findAll();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId() == id) {
                phones.remove(i);
                found = true;
            }
        }
        if (found) {
            List<String> listString = new ArrayList<>();
            for (Phone phone : phones) {
                listString.add(phone.getInfo());
            }
            ReadAndWriteFile.writeFileCSV(FILE_PATH, false, listString);
        }

        return found;
    }

    @Override
    public boolean update(Phone phone) {
        boolean found = false;
        List<Phone> phones = findAll();
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId() == phone.getId()) {
                phones.set(i, phone);
                found = true;
            }
        }
        if (found) {
            List<String> listString = new ArrayList<>();
            for (Phone phone1 : phones) {
                listString.add(phone1.getInfo());
            }
            ReadAndWriteFile.writeFileCSV(FILE_PATH, false, listString);
        }
        return found;
    }

    @Override
    public void findId(int id) {
        List<Phone> phones = findAll();
        for (Phone phone : phones) {
            if (phone.getId() == id) {
                Flag.flag = true;
                break;
            }
        }
    }
}
