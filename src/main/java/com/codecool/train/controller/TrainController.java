package com.codecool.train.controller;

import com.codecool.train.dto.TrainDto;
import com.codecool.train.dto.TrainWagonDto;
import com.codecool.train.entity.Train;
import com.codecool.train.service.TrainService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("train")
public class TrainController {

    TrainService trainService;

    public TrainController(TrainService trainService) {
        this.trainService = trainService;
    }

//    Post /train TrainDto json-t vár a body-ban. lementi az adott vonatot.
    @PostMapping
    public void addTrain(@RequestBody TrainDto train) {
        trainService.addTrain(train);
    }
//    Post /train/addWagon TrainWagonDto json-t vár a body-ban. A dto alapján vagont add a vonathoz.
    @PostMapping("/addWagon")
    public void addTrainWagon(@RequestBody TrainWagonDto trainWagon) {
        trainService.addTrainWagon(trainWagon);
    }
//    Get /train/{id} megkeresi az adott id-u vonatot és Train jsonként adja vissza. pl: { "id": "ABCD", "driver": "Bud Spencer", "destination": "Budapest", "isLate": true, "wagons": [] }
    @GetMapping("{id}")
    public Train getTrain(@PathVariable("id") String id) {
        return trainService.getTrain(id);
    }
//    Put /train/{id} TrainDto json-t vár a body-ban. updateli az adott vonatot.
    @PutMapping("{id}")
    public void updateTrain(@RequestBody TrainDto train, @PathVariable("id") String id) {
        trainService.updateTrain(train, id);
    }
//    Delete /train/{id} törli az adott vonatott. fontos hogy a vonathoz kapcsolodo vagonok ne törlödjenek csak a vonat.
    @DeleteMapping("{id}")
    public void deleteTrain(@PathVariable("id") String id) {
        trainService.deleteTrain(id);
    }
//    Get /train/heavy List json-ént listázza azokat a vonatokat amelyek vagonjainak össz tömege meghaladja a 25 egységet. pl: [ { "id": "AECDBA", "weight": 6, "wagonType": "CARGO" }, { "id": "ARCDBA", "weight": 3, "wagonType": "CARGO" } ]
    @GetMapping("/heavy")
    public List<Train> getHeavyTrains() {
        return trainService.getHeavyTrains();
    }

}
