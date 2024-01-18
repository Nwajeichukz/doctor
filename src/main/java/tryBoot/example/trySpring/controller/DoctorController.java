package tryBoot.example.trySpring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tryBoot.example.trySpring.model.Doctor;
import tryBoot.example.trySpring.repo.NameRep;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DoctorController {

//    List<Doctor> saveDoc = new ArrayList<>();
    @Autowired
    NameRep nameRep;


    @GetMapping
    public List<Doctor> getDoctor(){
        return nameRep.findAll();
    }

    @GetMapping("/hello")
    public String getHello(){
        return "Hello RENDER";
    }



    @PostMapping
    public String createDoctor(@RequestBody Doctor doctor){

        nameRep.save(doctor);

        return "sucessfully saved";
    }
}
