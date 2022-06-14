package com.codecool.train.dto;

import com.codecool.train.entity.WagonType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "wagons")
public class WagonDto {
    @Id
    private String id;
    private Integer weight;
    private WagonType wagonType;
}
