package com.shipwreck.service;

import com.shipwreck.model.Shipwreck;
import com.shipwreck.respository.ShipwreckRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipwreckServiceImpl implements ShipwreckService {
    @Autowired
    private ShipwreckRepository repository;

    @Override
    public List<Shipwreck> list() {
        return repository.list();
    }

    @Override
    public Shipwreck get(Long id) {
        return repository.get(id);
    }

    @Override
    public Shipwreck create(Shipwreck shipwreck) {
        return repository.create(shipwreck);
    }

    @Override
    public Shipwreck update(Long id, Shipwreck shipwreck) {
        return repository.update(id,shipwreck);
    }

    @Override
    public Shipwreck delete(Long id) {
        return repository.delete(id);
    }
}
