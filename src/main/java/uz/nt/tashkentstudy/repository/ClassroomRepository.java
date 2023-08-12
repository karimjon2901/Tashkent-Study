package uz.nt.tashkentstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.nt.tashkentstudy.model.Classroom;
@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Integer> {
}
