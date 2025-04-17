package ss0_homework.manage_vehicle.service;

import ss0_homework.manage_vehicle.entity.Vehicle;
import ss0_homework.manage_vehicle.repository.IVehicleRepository;
import ss0_homework.manage_vehicle.repository.VehicleRepository;

public class VehicleService implements IVehicleService {
    IVehicleRepository iVehicleRepository = new VehicleRepository();
    @Override
    public Vehicle checkNumberPlate(String numberPlate) {
        return iVehicleRepository.checkNumberPlate(numberPlate);
    }

    @Override
    public void delete(Vehicle vehicle) {
        iVehicleRepository.delete(vehicle);
    }
}
