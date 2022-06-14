package com.codecool.train.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
//@Entity
//@Table(name = "trains")
public class Train {
//    @Id
    private String id;
    private String driver;
    private String destination;
    private Boolean isLate;
    private List<Wagon> wagons;
}
