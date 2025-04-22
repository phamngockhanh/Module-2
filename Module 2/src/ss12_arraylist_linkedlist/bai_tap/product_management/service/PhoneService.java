package ss12_arraylist_linkedlist.bai_tap.product_management.service;

import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Computer;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Phone;
import ss12_arraylist_linkedlist.bai_tap.product_management.repository.IPhoneRepository;
import ss12_arraylist_linkedlist.bai_tap.product_management.repository.PhoneRepository;

import java.util.ArrayList;

public class PhoneService implements IPhoneService {
    private IPhoneRepository iPhoneRepository = new PhoneRepository();

    @Override
    public ArrayList<Phone> findAll() {
        return iPhoneRepository.findAll();
    }

    @Override
    public void delete(int id) {
        iPhoneRepository.delete(id);
    }

    @Override
    public void add(Phone phone) {
        iPhoneRepository.add(phone);
    }

    @Override
    public void findId(int id) {
        iPhoneRepository.findId(id);
    }

    @Override
    public void update(Phone phone) {
        iPhoneRepository.update(phone);
    }

}
