package com.codecool.train.dto;

import com.codecool.train.entity.WagonType;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WagonDto {
    private String id;
    private Integer weight;
    private WagonType wagonType;
}
