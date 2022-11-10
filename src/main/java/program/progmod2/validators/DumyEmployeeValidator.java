package program.progmod2.validators;

import program.progmod2.model.DumyEmployee;

public class DumyEmployeeValidator {
    public DumyEmployee checkEmail(DumyEmployee e) throws Exception {
        if(e.getEmail().contains("@")){
            return e;
        }
        throw new Exception("nem megfelelő email");
    }
}
