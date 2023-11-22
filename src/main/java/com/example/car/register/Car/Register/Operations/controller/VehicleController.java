package com.example.car.register.Car.Register.Operations.controller;

import com.example.car.register.Car.Register.Operations.entities.Vehicle;
import com.example.car.register.Car.Register.Operations.repository.VehicleRepository;
import com.example.car.register.Car.Register.Operations.service.VehicleService;

import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicle")
public class VehicleController {


    @Autowired

    VehicleService vehicleService;      //Bu Kısım sadece servis kısmıyla etkileşimli

    @PostMapping("/save")
        public void save(@RequestBody Vehicle vehicle) {
        vehicleService.save(vehicle);

        System.out.println("Arac Kayit Edildi.");
    }
    @DeleteMapping("/delete/{id}")
        public VehicleService delete(@PathVariable Long id){
        vehicleService.deleteById(id);
        return vehicleService;

    }

/*
    @GetMapping("/getAll")
            public Vehicle update(@RequestParam Integer id){
        Optional<Vehicle> vehicle = vehicleService.getAll();
               if(vehicle.isPresent()){
                   return (vehicle) vehicle.get();
               }
               return null;
    }
*/

}
