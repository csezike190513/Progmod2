package program.progmod2.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import program.progmod2.model.DumyEmployee;

@Repository
public interface DumyEmployeeRepo extends JpaRepository<DumyEmployee, Integer> {
}
