package ma.fstf.serverdetectionviolence.serverdetectionviolence.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class Message {
    @Id
    @GeneratedValue
    Integer id;
    @Column
    String texte;
    @Column
    String img;
    @ManyToOne
    @JoinColumn(name = "emmet_id")
    User emmet;
    @ManyToOne
    @JoinColumn(name = "recep_id")
    User recep;

}
