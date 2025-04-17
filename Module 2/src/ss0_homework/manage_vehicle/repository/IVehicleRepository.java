package ss0_homework.manage_vehicle.repository;

import ss0_homework.manage_vehicle.entity.Vehicle;


public interface IVehicleRepository {
    Vehicle checkNumberPlate(String numberPlate);
    void delete(Vehicle vehicle);
}