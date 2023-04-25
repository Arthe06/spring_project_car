package com.example.demo.carcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.carmodel.CarModel;
import com.example.demo.carservice.CarService;

@RestController
public class CarController {

	@Autowired
	CarService carService;
	
	@GetMapping("fetch")
	public List<CarModel> getAllDetails(){
		return carService.getAlldetails();
	}
	
	@GetMapping("fetch/{id}")
	public CarModel getcar(@PathVariable("id") int id){
		return carService.getcar(id);
	}
	
	@PutMapping("update")
	public CarModel updatecar(@RequestBody CarModel d) {
		return carService.updatecar(d);
	}
	
	@PostMapping("save")
	public CarModel savecar(@RequestBody CarModel d) {
		return carService.savecar(d);
	}
	
	@DeleteMapping("delete/{id}")
	public void deletecar(@PathVariable("id") int id) {
		carService.deletecar(id);
	}
}
