package ss999_case_study.repository;

import ss999_case_study.entity.Facility;

import java.util.Map;

public interface IFacilityRepository extends IRepository<Facility>{
    Map<Facility, Integer> getAll();
    void add(Facility facility);
    Map<Facility, Integer> getMaintenance();
}
