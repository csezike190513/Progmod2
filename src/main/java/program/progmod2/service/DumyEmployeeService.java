package program.progmod2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import program.progmod2.model.DumyEmployee;
import program.progmod2.repo.DumyEmployeeRepo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DumyEmployeeService {
    @Autowired
    DumyEmployeeRepo dumyEmployeeRepo;

    public void createDumyEmployee(String email) {
        DumyEmployee dumyEmployee = new DumyEmployee(
                "asdfg",
                "sdfghjléá",
                email,
                "+56942",
                new Date(2002, Calendar.DECEMBER, 12),
                "as456",
                20000
        );
        dumyEmployeeRepo.save(dumyEmployee);
    }

    public List<DumyEmployee> getAllDumyEmployee(){
        return dumyEmployeeRepo.findAll();
    }
}
