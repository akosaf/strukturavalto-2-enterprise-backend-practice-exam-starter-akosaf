package com.codecool.train.dto;

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
@Table(name = "trains")
public class TrainDto {
    @Id
    private String id;
    private String driver;
    private String destination;
    private Boolean isLate;
}

