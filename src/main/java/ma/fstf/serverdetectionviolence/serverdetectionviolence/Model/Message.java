package ma.fstf.serverdetectionviolence.serverdetectionviolence.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;


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
    String Texte;
    @Column
    String img;
    @ManyToOne
    @JoinColumn(name = "emmet_id")
    USER emmet;
    @ManyToOne
    @JoinColumn(name = "recep_id")
    USER recep;

}
