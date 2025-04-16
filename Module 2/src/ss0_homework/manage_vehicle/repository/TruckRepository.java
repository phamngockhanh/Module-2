package ss0_homework.manage_vehicle.repository;

import ss0_homework.manage_vehicle.common.DeleteFlag;
import ss0_homework.manage_vehicle.entity.Car;
import ss0_homework.manage_vehicle.entity.Motorbike;
import ss0_homework.manage_vehicle.entity.Truck;

import java.util.ArrayList;


public class TruckRepository implements ITruckRepository {
    private static ArrayList<Truck> trucks = new ArrayList<>();

    static {
        Truck c1 = new Truck("43C-012.34", "Huyndai", 2019, "Nguyễn Văn A", 5);
        Truck c2 = new Truck("43C-47.678", "Dongfeng", 2020, "Nguyễn Văn B", 45);
        Truck c3 = new Truck("43C-45.235", "Dongfeng", 2020, "Nguyễn Văn C", 16);
        trucks.add(c1);
        trucks.add(c2);
        trucks.add(c3);
    }

    @Override
    public ArrayList<Truck> findAll() {
        return trucks;
    }

    @Override
    public void add(Truck truck) {
        trucks.add(truck);
    }

    @Override
    public void findNumberPlate(String numberPlate) {
        for (Truck truck : trucks) {
            if (numberPlate.equals(truck.getNumberPlate())) {
                DeleteFlag.flag = true;
                break;
            }
        }
    }

    @Override
    public void delete(String numberPlate) {
        for (int i = 0; i < trucks.size(); i++) {
            if (numberPlate.equals(trucks.get(i).getNumberPlate())) {
                trucks.remove(i);
                break;
            }
        }
    }
}
