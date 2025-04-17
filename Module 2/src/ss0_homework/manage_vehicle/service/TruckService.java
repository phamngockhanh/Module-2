package ss0_homework.manage_vehicle.service;

import ss0_homework.manage_vehicle.entity.Truck;
import ss0_homework.manage_vehicle.repository.*;

import java.util.ArrayList;

public class TruckService implements ITruckService {
    private ITruckRepository iTruckRepository = new TruckRepository();
    @Override
    public ArrayList<Truck> findAll() {
        return iTruckRepository.findAll();
    }

    @Override
    public void add(Truck truck) {
        iTruckRepository.add(truck);
    }
    @Override
    public void findNumberPlate(String numberPlate) {
        iTruckRepository.findNumberPlate(numberPlate);
    }

    @Override
    public void delete(String numberPlate) {
        iTruckRepository.delete(numberPlate);
    }


}
