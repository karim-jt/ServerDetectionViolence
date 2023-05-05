package ma.fstf.serverdetectionviolence.serverdetectionviolence.Repository;

import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Integer> {
}
