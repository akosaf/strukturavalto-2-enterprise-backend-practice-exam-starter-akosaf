package com.codecool.train.service;

import com.codecool.train.dto.WagonDto;
import com.codecool.train.entity.Wagon;
import com.codecool.train.repository.WagonRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WagonService {

    WagonRepository wagonRepository;

    public WagonService(WagonRepository wagonRepository) {
        this.wagonRepository = wagonRepository;
    }

    public void addWagon(WagonDto input) {
        Wagon wagon = new Wagon();
        wagon.setId(input.getId());
        wagon.setWeight(input.getWeight());
        wagon.setWagonType(input.getWagonType());
        wagonRepository.save(wagon);
    }

    public List<Wagon> getAllWagons() {
        return wagonRepository.findAll();
    }

    public void updateWagon(WagonDto input, String id) {
        Wagon wagon = new Wagon();
        wagon.setId(id);
        wagon.setWeight(input.getWeight());
        wagon.setWagonType(input.getWagonType());
        wagonRepository.save(wagon);
    }

    public void deleteWagon(String id) {
        wagonRepository.deleteById(id);
    }
}
