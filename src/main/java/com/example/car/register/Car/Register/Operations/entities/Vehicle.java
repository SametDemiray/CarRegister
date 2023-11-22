package com.example.car.register.Car.Register.Operations.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "Vehicle")
@AllArgsConstructor
@NoArgsConstructor


public class Vehicle implements Serializable {

    List<Vehicle> vehicles = new ArrayList<>();



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "Brand")
    private String brand;

    @Column(name = "Model")
    private String model;

    @Column(name = "Year")
    private int year;

    @Column(name = "Gear")
    private String gear;

    @Column(name = "Fuel")
    private String fuel;

    @Column(name = "Km")
    private int km;

    @Column(name = "Price")
    private double price;




}
