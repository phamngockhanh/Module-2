package ss999_case_study.repository;

import ss999_case_study.common.ReadAndWriteFile;
import ss999_case_study.entity.Facility;
import ss999_case_study.entity.House;
import ss999_case_study.entity.Room;
import ss999_case_study.entity.Villa;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class FacilityRepository implements IFacilityRepository {

    private static String FILE_PATH = "C:\\Codegym module 2\\Module 2\\src\\ss999_case_study\\data\\facility.csv";

    @Override
    public List<Facility> findAll() {
        throw new UnsupportedOperationException("Not supported yet!!");
    }

    @Override
    public boolean findId(String id) {
        throw new UnsupportedOperationException("Not supported yet!!");
    }

    @Override
    public Map<Facility, Integer> getAll() {
        List<String> listString = ReadAndWriteFile.readFileCSV(FILE_PATH);
        Map<Facility, Integer> facilityListMap = new LinkedHashMap<>();
        for (String line : listString) {
            String[] arr = line.split(",");
            if (arr[0].startsWith("SVVL")) {
                Facility facility = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
                int count = Integer.parseInt(arr[arr.length - 1]);
                facilityListMap.put(facility, count);
            } else if (arr[0].startsWith("SVHO")) {
                Facility facility = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                int count = Integer.parseInt(arr[arr.length - 1]);
                facilityListMap.put(facility, count);
            } else {
                Facility facility = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[8]));
                int count = Integer.parseInt(arr[arr.length - 1]);
                facilityListMap.put(facility, count);
            }
        }
        return facilityListMap;
    }

    @Override
    public void add(Facility facility) {
        List<String> stringList = new ArrayList<>();
        if (facility instanceof Villa) {
            Villa v = (Villa) facility;
            stringList.add(v.getInfo(0));
        } else if (facility instanceof House) {
            House h = (House) facility;
            stringList.add(h.getInfo(0));
        } else {
            Room r = (Room) facility;
            stringList.add(r.getInfo(0));
        }
        ReadAndWriteFile.writeFileCSV(FILE_PATH, stringList, true);
    }

    @Override
    public Map<Facility, Integer> getMaintenance() {
        List<String> listString = ReadAndWriteFile.readFileCSV(FILE_PATH);
        Map<Facility, Integer> facilityListMap = new LinkedHashMap<>();
        for (String line : listString) {
            String[] arr = line.split(",");
            if (arr[0].startsWith("SVVL")) {
                Facility facility = new Villa(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6]);
                int count = Integer.parseInt(arr[arr.length - 1]);
                if (count >= 5) {
                    facilityListMap.put(facility, count);
                }
            } else if (arr[0].startsWith("SVHO")) {
                Facility facility = new House(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Double.parseDouble(arr[7]), Integer.parseInt(arr[8]));
                int count = Integer.parseInt(arr[arr.length - 1]);
                if (count >= 5) {
                    facilityListMap.put(facility, count);
                }
            } else {
                Facility facility = new Room(arr[0], arr[1], Double.parseDouble(arr[2]), Double.parseDouble(arr[3]), Integer.parseInt(arr[4]), arr[5], arr[6], Integer.parseInt(arr[8]));
                int count = Integer.parseInt(arr[arr.length - 1]);
                if (count >= 5) {
                    facilityListMap.put(facility, count);
                }
            }
        }
        return facilityListMap;
    }

    @Override
    public void update(Facility facility) {
        throw new UnsupportedOperationException("Not supported yet!!");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not supported yet!!");
    }
}