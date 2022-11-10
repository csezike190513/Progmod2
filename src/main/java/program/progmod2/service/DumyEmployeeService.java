package program.progmod2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import program.progmod2.model.DumyEmployee;
import program.progmod2.repo.DumyEmployeeRepo;
import program.progmod2.validators.DumyEmployeeValidator;

import java.time.LocalDate;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DumyEmployeeService {
    @Autowired
    DumyEmployeeRepo dumyEmployeeRepo;

   /* public void createDumyEmployee(String firstName, String lastName, String email, String phoneNumber, String jobIde, Integer salary) {
       DumyEmployee dumyEmployee = new DumyEmployee(
               firstName,
               lastName,
                email,
               phoneNumber,
               new Date(),
               jobIde,
               salary
        );
        dumyEmployeeRepo.save(dumyEmployee);
    }*/

    public List<DumyEmployee> getAllDumyEmployee(){
        return dumyEmployeeRepo.findAll();
    }

    public void createDumyEmployee(DumyEmployee employee) throws Exception {
        DumyEmployeeValidator v = new DumyEmployeeValidator();
        employee = v.checkEmail(employee);
        dumyEmployeeRepo.save(employee);
    }
}
