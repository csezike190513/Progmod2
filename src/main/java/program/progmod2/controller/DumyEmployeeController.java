package program.progmod2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
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

    @PostMapping(
            value = "/updatePerson", consumes = MediaType.APPLICATION_JSON_VALUE)
    public boolean createEmployee(@RequestBody DumyEmployee employee){
        try {
            dumyEmployeeService.createDumyEmployee(employee);
            return true;
        }catch (Exception e){
            return false;
        }
    }
}
