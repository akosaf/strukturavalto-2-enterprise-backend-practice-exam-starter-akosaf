package com.codecool.train.dto;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TrainWagonDto {
    private String trainId;
    private String wagonId;
}

