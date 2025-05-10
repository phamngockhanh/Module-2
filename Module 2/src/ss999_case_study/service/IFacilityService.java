package ss999_case_study.service;

import ss999_case_study.entity.Facility;

import java.util.Map;

public interface IFacilityService extends IService<Facility> {
    Map<Facility, Integer> getAll();
    void add(Facility facility);
    Map<Facility, Integer> getMaintenance();
}
