package peaksoft.repository;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.entity.Users;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {
    Optional<Users> findByEmail(String email);
}
