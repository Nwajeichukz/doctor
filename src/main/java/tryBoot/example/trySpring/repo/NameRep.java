package tryBoot.example.trySpring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tryBoot.example.trySpring.model.Doctor;

@Repository
public interface NameRep extends JpaRepository<Doctor, Integer> {
}
