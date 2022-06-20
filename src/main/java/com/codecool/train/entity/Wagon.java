package com.codecool.train.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
@Entity
@Table(name = "wagons")
public class Wagon {
    @Id
    private String id;
    private int weight;
    private WagonType wagonType;
    @ManyToOne
    @JsonBackReference
    private Train train;

}
