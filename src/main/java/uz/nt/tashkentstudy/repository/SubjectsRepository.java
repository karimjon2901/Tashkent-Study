package uz.nt.tashkentstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.nt.tashkentstudy.model.Subjects;
@Repository
public interface SubjectsRepository extends JpaRepository<Subjects, Integer> {
}
