package com.example.car.register.Car.Register.Operations.service;

import com.example.car.register.Car.Register.Operations.entities.Vehicle;
import com.example.car.register.Car.Register.Operations.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleServiceImpl implements VehicleService {

    @Autowired
    VehicleRepository vehicleRepository;

    List<Vehicle> vehicles = new ArrayList<Vehicle>();

    @Override
    public void save(Vehicle vehicle) {
        if (vehicle.getYear() < 2023) {
            try {
                throw new Exception("Yıl Düşük Girdiniz");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        } else {
            vehicleRepository.save(vehicle);
            System.out.println("Kayıt Başarılı.");
        }
    }

    @Override
    public void deleteById(Long id) {
        vehicleRepository.deleteById(id);
        System.out.println("Kayit Veritabanindan Silindi.");

    }

    @Override
    public void update() {

    }

    @Override
    public List<Vehicle> getAll() {
        return null;
    }

/* @Override
 public List<Vehicle> getAll() {
     vehicles.stream().filter(vehicle -> getAll().add(vehicle)).forEach(vehicle -> getAll());

  return vehicles;*/
}

