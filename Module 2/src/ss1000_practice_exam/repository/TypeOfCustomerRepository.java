package ss1000_practice_exam.repository;

import ss1000_practice_exam.common.ReadAndWriteFile;
import ss1000_practice_exam.entity.TypOfCustomer;

import java.util.ArrayList;
import java.util.List;

public class TypeOfCustomerRepository implements ITypeOfCustomerRepository {
    private static String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss1000_practice_exam\\data\\loaiKhach.csv";

    @Override
    public List<TypOfCustomer> findAll() {
        List<TypOfCustomer> typOfCustomers = new ArrayList<>();
        List<String> stringList = ReadAndWriteFile.readFileCSV(FILE_PATH);
        for (String line : stringList) {
            String[] arr = line.split(",");
            typOfCustomers.add(new TypOfCustomer(arr[0], arr[1]));
        }
        return typOfCustomers;
    }
}
