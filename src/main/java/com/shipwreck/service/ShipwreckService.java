package com.shipwreck.service;

import com.shipwreck.model.Shipwreck;

import java.util.List;


public interface ShipwreckService {

    List<Shipwreck> list();

    Shipwreck get(Long id);

    Shipwreck create(Shipwreck shipwreck);

    Shipwreck update(Long id, Shipwreck shipwreck);

    Shipwreck delete(Long id);

}
