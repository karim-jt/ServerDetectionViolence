package ma.fstf.serverdetectionviolence.serverdetectionviolence.Repository;

import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUserName(String login);
    @Query("select u.id from User u where u.userName=:s")
    Integer findUserByUsername(String s);
    User  findUSERByIdIs(Integer id);
}
