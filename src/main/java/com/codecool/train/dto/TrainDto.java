package com.codecool.train.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainDto {
    private String id;
    private String driver;
    private String destination;
    private Boolean isLate;
}

