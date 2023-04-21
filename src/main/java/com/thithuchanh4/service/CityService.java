package com.thithuchanh4.service;

import com.thithuchanh4.model.City;
import com.thithuchanh4.repository.ICityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CityService implements ICityService{
    @Autowired
    ICityRepository repository;
    @Override
    public List<City> findAll() {
        return repository.findAll();
    }

    @Override
    public City findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public City save(City city) {
        return repository.save(city);
    }

    @Override
    public void delete(City city) {
        repository.delete(city);
    }
}
