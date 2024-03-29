package uz.nt.tashkentstudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.nt.tashkentstudy.model.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
