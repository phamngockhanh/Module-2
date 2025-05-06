package ss999_case_study.service;

import ss999_case_study.entity.Booking;

import java.util.List;

public class BookingService implements IBookingService {


    @Override
    public List<Booking> findAll() {
        return List.of();
    }

    @Override
    public boolean findId(String id) {
        return false;
    }

    @Override
    public void add(Booking booking) {

    }

    @Override
    public void update(Booking booking) {

    }

    @Override
    public void delete(String id) {
    }

}
