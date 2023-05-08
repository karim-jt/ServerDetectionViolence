package ma.fstf.serverdetectionviolence.serverdetectionviolence.Repository;

import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import ma.fstf.serverdetectionviolence.serverdetectionviolence.Model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
public interface MessageRepository extends JpaRepository<Message, Integer> {

    List<Message> findMessageByRecepEqualsAndEmmetEquals(User u,User u1);
    @Query(nativeQuery = true,value =
            "SELECT * from message WHERE recep_id= :id group by emmet_id")
    List<Message> findMessageByRecepEquals(@Param("id") Integer id);

    @Query(nativeQuery = true,value =
            "SELECT * from message WHERE (recep_id= :id1 or emmet_id=:id1) and (recep_id= :id2 or emmet_id=:id2) order by date")
    List<Message> findMessagesBtw2Contacts(@Param("id1") Integer id1,@Param("id2") Integer id2);
}
