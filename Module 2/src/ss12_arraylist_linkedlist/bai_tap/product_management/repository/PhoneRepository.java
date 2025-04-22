package ss12_arraylist_linkedlist.bai_tap.product_management.repository;

import ss12_arraylist_linkedlist.bai_tap.product_management.common.Flag;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Computer;
import ss12_arraylist_linkedlist.bai_tap.product_management.entity.Phone;

import java.util.ArrayList;

public class PhoneRepository implements IPhoneRepository {
    public static ArrayList<Phone> phones = new ArrayList<>(5);

    static {
        phones.add(new Phone("Samsung A11", 5, 3456, 12));
        phones.add(new Phone("Samsung A12", 6, 345678, 12));
        phones.add(new Phone("Samsung A13", 7, 3456789, 12));
    }

    @Override
    public ArrayList<Phone> findAll() {
        return phones;
    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).getId() == id && Flag.deleteConfirm) {
                phones.remove(i);
                break;
            }
        }
    }

    @Override
    public void add(Phone phone) {
        phones.add(phone);
    }

    @Override
    public void findId(int id) {
        for (Phone phone : phones) {
            if (phone.getId() == id) {
                Flag.flag = true;
                break;
            }

        }
    }

    @Override
    public void update(Phone phone) {
        for (int i = 0; i < phones.size(); i++) {
            if (phone.getId() == phones.get(i).getId()) {
                phones.set(i, phone);
            }
        }
    }

}
