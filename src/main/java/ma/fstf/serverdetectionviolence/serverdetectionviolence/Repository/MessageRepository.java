package ma.fstf.serverdetectionviolence.serverdetectionviolence.Repository;

import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.User;
import java.util.List;
public interface MessageRepository extends JpaRepository<Message, Integer> {
    List<Message> findMessageByRecepEqualsAndEmmetEquals(User u,User u1);
    List<Message> findMessageByRecepEquals(User u);
}
