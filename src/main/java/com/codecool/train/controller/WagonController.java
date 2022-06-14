package com.codecool.train.controller;

import com.codecool.train.dto.WagonDto;
import com.codecool.train.entity.Wagon;
import com.codecool.train.service.WagonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("wagon")
public class WagonController {

    private final WagonService wagonService;

    @Autowired
    public WagonController(WagonService wagonService) {
        this.wagonService = wagonService;
    }

//    Post /wagon WagonDto json-t vár a body-ban. lementi az adott vagont.
    @PostMapping
    public void addWagon(@RequestBody WagonDto wagon) {
        wagonService.addWagon(wagon);
    }
//    Get /wagon vissza adja a vagonokat List json-ként
    @GetMapping
    public List<Wagon> getAllWagons() {
        return wagonService.getAllWagons();
    }
//    Put /wagon/{id} WagonDto json-t vár a body-ban. updateli az adott vagont.
    @PutMapping("{id}")
    public void updateWagon(@RequestBody WagonDto wagon, @PathVariable("id") String id) {
        wagonService.updateWagon(wagon, id);
    }
//    Delete /wagon/{id} törli az adott vagont
    @DeleteMapping("{id}")
    public void deleteWagon(@PathVariable("id") String id) {
        wagonService.deleteWagon(id);
    }
}
