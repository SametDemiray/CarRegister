package com.example.car.register.Car.Register.Operations.service;

import com.example.car.register.Car.Register.Operations.entities.Vehicle;


import java.util.List;


public interface VehicleService {


    void save(Vehicle vehicle);

    void deleteById(Long id);

    Vehicle findById(Long id);

    Vehicle update(Vehicle vehicle, long id);

    List<Vehicle> getAll();
    void findOne(Vehicle vehicle);


}
