package com.codecool.train.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "trains")
public class Train {
    @Id
    private String id;
    private String driver;
    private String destination;
    private Boolean isLate;
    @OneToMany
    @JsonManagedReference
    private List<Wagon> wagons;
}
