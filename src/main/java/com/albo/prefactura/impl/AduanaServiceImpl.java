package com.albo.prefactura.impl;

import com.albo.prefactura.entities.Aduana;
import com.albo.prefactura.repositories.IAduanaRepository;
import com.albo.prefactura.services.IAduanaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AduanaServiceImpl implements IAduanaService {

    @Autowired
    private IAduanaRepository aduanaRepo;

    @Override
    public List<Aduana> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Aduana> findById(Integer id) {
        return aduanaRepo.findById(id);
    }

    @Override
    public Aduana saveOrUpdate(Aduana t) {
        return aduanaRepo.save(t);
    }

    @Override
    public Boolean deleteById(Integer id) {
        // TODO Auto-generated method stub
        return null;
    }
}
