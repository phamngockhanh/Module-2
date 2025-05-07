package ss999_case_study.repository;

import ss999_case_study.entity.Facility;

import java.util.LinkedHashMap;

public interface IFacilityRepository {
    LinkedHashMap<Facility, Integer> findAll();
    void add(Facility facility);
}
