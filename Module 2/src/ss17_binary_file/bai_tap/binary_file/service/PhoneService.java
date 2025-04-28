package ss17_binary_file.bai_tap.binary_file.service;

import ss17_binary_file.bai_tap.binary_file.entity.Phone;
import ss17_binary_file.bai_tap.binary_file.repository.IPhoneRepository;
import ss17_binary_file.bai_tap.binary_file.repository.PhoneRepository;

import java.util.List;

public class PhoneService implements IPhoneService {
    private IPhoneRepository iPhoneRepository = new PhoneRepository();

    @Override
    public List<Phone> findAll() {
        return iPhoneRepository.findAll();
    }

    @Override
    public void add(Phone phone) {
        iPhoneRepository.add(phone);
    }

    @Override
    public boolean delete(int id) {
        return iPhoneRepository.delete(id);
    }

    @Override
    public boolean update(Phone phone) {
        return iPhoneRepository.update(phone);
    }

    @Override
    public void findId(int id) {
        iPhoneRepository.findId(id);
    }
}
