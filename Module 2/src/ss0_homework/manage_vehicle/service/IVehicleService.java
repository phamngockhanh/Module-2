package ss0_homework.manage_vehicle.service;

import ss0_homework.manage_vehicle.entity.Vehicle;

public interface IVehicleService {
    Vehicle checkNumberPlate(String numberPlate);
    void delete(Vehicle vehicle);
}
