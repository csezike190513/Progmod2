package program.progmod2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import program.progmod2.model.DumyEmployee;
import program.progmod2.service.DumyEmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DumyEmployeeController {

    @Autowired
    DumyEmployeeService dumyEmployeeService;

    @GetMapping("/getallemployee")
    public List<DumyEmployee> getAllEmployee(){
        return dumyEmployeeService.getAllDumyEmployee();
    }

    @PostMapping("/createemployee")
    public boolean createEmployee(){
        try {
            dumyEmployeeService.createDumyEmployee("asd.xx");
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
