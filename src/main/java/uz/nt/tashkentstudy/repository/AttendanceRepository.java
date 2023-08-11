package uz.nt.tashkentstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.nt.tashkentstudy.model.Attendance;
@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Integer> {
}
