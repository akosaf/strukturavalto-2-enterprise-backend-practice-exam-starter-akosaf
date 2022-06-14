package com.codecool.train.service;

import com.codecool.train.dto.TrainDto;
import com.codecool.train.dto.TrainWagonDto;
import com.codecool.train.entity.Train;
import com.codecool.train.repository.TrainRepository;
import com.codecool.train.repository.WagonRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrainService {

    TrainRepository trainRepository;
    WagonRepository wagonRepository;

    public TrainService(TrainRepository trainRepository, WagonRepository wagonRepository) {
        this.trainRepository = trainRepository;
        this.wagonRepository = wagonRepository;
    }

    public void addTrain(TrainDto input) {
        Train train = new Train();
        train.setId(input.getId());
        train.setDriver(input.getDriver());
        train.setDestination(input.getDestination());
        train.setIsLate(input.getIsLate());
        trainRepository.save(train);
    }

    public void addTrainWagon(TrainWagonDto trainWagon) {
        String trainId = trainWagon.getTrainId();
        String wagonId = trainWagon.getWagonId();
        Train train = getTrain(trainId);
        train.getWagons().add(wagonRepository.findAll().stream().filter(wagon -> wagon.getId().equals(wagonId)).findFirst().orElseThrow());
    }

    public Train getTrain(String id) {
        return trainRepository.findById(id).orElseThrow();
    }

    public void updateTrain(TrainDto input, String id) {
        Train train = new Train();
        train.setId(id);
        train.setDriver(input.getDriver());
        train.setDestination(input.getDestination());
        train.setIsLate(input.getIsLate());
        trainRepository.save(train);
    }

    public void deleteTrain(String id) {
        trainRepository.deleteById(id);
    }

    public List<Train> getHeavyTrains() {
        return trainRepository.findAll().stream().filter(t -> t.getWagons().size() >= 25).collect(Collectors.toList());
    }

}
