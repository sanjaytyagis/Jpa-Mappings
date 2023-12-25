package com.example.jpamapping.unidirectionalonetoone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
     http://localhost:8080/motorcycle/saveMotorcycle
     
    {
		"modelName":"Apache",
		"manufacturerName":"TVS",
        "gearBox":"5",
        "wheels":"2",
        "length":"10",
        "height":"15",
        "engine":{
           "engineType":"4 Cyclinder",
            "capacity":"160",
            "maxTorque":"15"
        }
    }
 */
@RestController
@RequestMapping("/motorcycle")
public class MotorcycleController {
           
  @Autowired
  private MotorcycleRepository motorcycleRepository;
           
  @PostMapping("/saveMotorcycle")
  public Motorcycle saveMotorcycle(@RequestBody Motorcycle motorcycle) {
    System.out.println("Motorcycle save called...");
    Motorcycle outMotorcycle = motorcycleRepository.save(motorcycle);
    System.out.println("Saved Motorcycle :: " + outMotorcycle);

    return outMotorcycle;
  }
  
  @GetMapping("/getMotorcycle/{id}")
  public Motorcycle getMotorcycle(@PathVariable(name = "id") int id) {
    System.out.println("Motorcycle get called...");
    Motorcycle outMotorcycle = motorcycleRepository.findById(id);
    System.out.println("get Motorcycle :: " + outMotorcycle);

    return outMotorcycle;
  }
}