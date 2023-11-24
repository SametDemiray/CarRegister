package com.example.car.register.Car.Register.Operations.controller;

import com.example.car.register.Car.Register.Operations.entities.Vehicle;
import com.example.car.register.Car.Register.Operations.service.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@AllArgsConstructor
@RequestMapping("/vehicle")
public class VehicleController {


    @Autowired
    VehicleService vehicleService;

    @PostMapping("/save")
    public void save(@RequestBody Vehicle vehicle) {
        vehicleService.save(vehicle);

        System.out.println("Arac Kayit Edildi.");
    }

    @DeleteMapping("/delete/{id}")
    public VehicleService delete(@PathVariable Long id) {
        vehicleService.deleteById(id);
        return vehicleService;

    }

    @GetMapping("/getAll")
    public List<Vehicle> getAll() {
        List<Vehicle> allVehicle = vehicleService.getAll();
        return allVehicle;

    }

    // Aşağıdaki kod id ye göre getiriyor
    @GetMapping("/get/{id}")
    public Vehicle findById(@PathVariable long id) {
        return vehicleService.findById(id);

    }

    @PutMapping("/update/{id}")
    public Vehicle updateVehicle(@PathVariable("id") long id,
                                 @RequestBody Vehicle vehicle) {
        return vehicleService.update(vehicle, id);

    }
}


//Bu Kısım sadece servis kısmıyla etkileşimli