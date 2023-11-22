package com.example.car.register.Car.Register.Operations.repository;

import com.example.car.register.Car.Register.Operations.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {


}
