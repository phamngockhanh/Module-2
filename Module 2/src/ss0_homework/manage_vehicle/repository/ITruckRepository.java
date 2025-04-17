package ss0_homework.manage_vehicle.repository;


import ss0_homework.manage_vehicle.entity.Truck;

import java.util.ArrayList;

public interface ITruckRepository {
    ArrayList<Truck> findAll();
    void add(Truck truck);
    void findNumberPlate(String numberPlate);
    void delete(String numberPlate);
    void delete1(Truck truck);
}
