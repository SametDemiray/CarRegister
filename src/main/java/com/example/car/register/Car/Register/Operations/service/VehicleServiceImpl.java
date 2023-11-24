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

    List<Vehicle> vehicles = new ArrayList<>();


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
    public List<Vehicle> getAll() {
        List<Vehicle> all = vehicleRepository.findAll();
        System.out.println("Veritabanı kayıtları getirildi.");
        return all;

    }

    @Override
    public void findOne(Vehicle vehicle) {

    }

    @Override
    public Vehicle findById(Long id) {
        System.out.println("Verilen Id'ye göre kayıt getirildi.");
        return vehicleRepository.findById(id).orElse(null);

    }

    @Override
    public Vehicle update(Vehicle vehicle, long id) {
        Vehicle existingVehicle = vehicleRepository.findById(id).orElseThrow();

        existingVehicle.setId(vehicle.getId());
        existingVehicle.setBrand(vehicle.getBrand());
        existingVehicle.setModel(vehicle.getModel());
        existingVehicle.setYear(vehicle.getYear());
        existingVehicle.setGear(vehicle.getGear());
        existingVehicle.setKm(vehicle.getKm());
        existingVehicle.setPrice(vehicle.getPrice());

        vehicleRepository.save(existingVehicle);
        return existingVehicle;
    }
}
