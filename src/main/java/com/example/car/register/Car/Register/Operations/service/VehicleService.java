package com.example.car.register.Car.Register.Operations.service;

import com.example.car.register.Car.Register.Operations.entities.Vehicle;


import java.util.List;


public interface VehicleService {


    void save(Vehicle vehicle);

    void deleteById(Long id);

    void update();

    List<Vehicle> getAll();
}
