package ss0_homework.manage_vehicle.repository;

import ss0_homework.manage_vehicle.common.DeleteFlag;
import ss0_homework.manage_vehicle.entity.Motorbike;

import java.util.ArrayList;

public class MotorbikeRepository implements IMotorbikeRepository {
    private static ArrayList<Motorbike> motorbikes = new ArrayList<>();

    static {
        Motorbike c1 = new Motorbike("43-K1-678.56", "Yamaha", 2019, "Nguyễn Văn A", 100);
        Motorbike c2 = new Motorbike("43-H1-345.89", "Honda", 2019, "Nguyễn Văn B", 150);
        Motorbike c3 = new Motorbike("43-AK-765.23", "Yamaha", 2019, "Nguyễn Văn C", 150);
        motorbikes.add(c1);
        motorbikes.add(c2);
        motorbikes.add(c3);
    }

    @Override
    public ArrayList<Motorbike> findAll() {
        return motorbikes;
    }

    @Override
    public void add(Motorbike motorbike) {
        motorbikes.add(motorbike);
    }

    @Override
    public void findNumberPlate(String numberPlate) {
        for (Motorbike motorbike : motorbikes) {
            if (numberPlate.equals(motorbike.getNumberPlate())) {
                DeleteFlag.flag = true;
                break;
            }
        }
    }

    @Override
    public void delete(String numberPlate) {
        for (int i = 0; i < motorbikes.size(); i++) {
            if (numberPlate.equals(motorbikes.get(i).getNumberPlate())) {
                motorbikes.remove(i);
                break;
            }
        }
    }

    @Override
    public void delete1(Motorbike motorbike) {
        motorbikes.remove(motorbike);
    }
}
