package com.codecool.train.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "wagons")
public class Wagon {
//    @Id
    private String id;
    private int weight;
    private WagonType wagonType;
    private Train train;


}
