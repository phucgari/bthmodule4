package com.thithuchanh4.service;

import com.thithuchanh4.model.Nation;
import com.thithuchanh4.repository.INationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationService implements INationService {
    @Autowired
    INationRepository repository;
    @Override
    public List<Nation> findAll() {
        return repository.findAll();
    }

    @Override
    public Nation findById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public Nation save(Nation nation) {
        return null;
    }

    @Override
    public void delete(Nation nation) {

    }
}
