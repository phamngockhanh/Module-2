package ss999_case_study.repository;

import ss999_case_study.common.ReadAndWriteFile;
import ss999_case_study.entity.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private static String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss999_case_study\\data\\employee.csv";

    @Override
    public List<Employee> findAll() {
        List<Employee> employees = new ArrayList<>();
        List<String> listString = ReadAndWriteFile.readFileCSV(FILE_PATH);
        for (String stringLine : listString) {
            String[] arr = stringLine.split(",");
            employees.add(new Employee(arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], Double.parseDouble(arr[9])));
        }
        return employees;
    }

    @Override
    public boolean findId(String id) {
        List<Employee> employees = findAll();
        boolean found = false;
        for (Employee employee : employees) {
            if (employee.getEmployeeId().equals(id)) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public void add(Employee employee) {
        List<String> stringList = new ArrayList<>();
        stringList.add(employee.getInfo());
        ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, true);
    }

    @Override
    public void update(Employee employee) {
        List<Employee> employees = findAll();
        for (int i = 0; i < employees.size(); i++) {
            if (employee.getEmployeeId().equals(employees.get(i).getEmployeeId())) {
                employees.set(i, employee);
            }
        }

        List<String> stringList = new ArrayList<>();
        for (Employee employee1 : employees) {
            stringList.add(employee1.getInfo());
        }
        ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, false);
    }

    @Override
    public void delete(String id) {
        List<Employee> employees = findAll();
        for (int i = 0; i < employees.size(); i++) {
            if (id.equals(employees.get(i).getEmployeeId())) {
                employees.remove(i);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Employee employee : employees) {
            stringList.add(employee.getInfo());
            ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, false);
        }
    }
}
