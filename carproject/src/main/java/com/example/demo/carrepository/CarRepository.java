package com.example.demo.carrepository;

import org.springframework.stereotype.Repository;

import com.example.demo.carmodel.CarModel;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CarRepository extends JpaRepository<CarModel,Integer> {
}
